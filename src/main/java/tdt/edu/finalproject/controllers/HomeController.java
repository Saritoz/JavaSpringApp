package tdt.edu.finalproject.controllers;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.joran.conditional.ElseAction;
import tdt.edu.finalproject.models.Account;
import tdt.edu.finalproject.models.Cart;
import tdt.edu.finalproject.models.Flower;
import tdt.edu.finalproject.repositories.AccountRepository;
import tdt.edu.finalproject.repositories.CartRepository;
import tdt.edu.finalproject.repositories.FlowerRepository;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private FlowerRepository flowerRepository;

    @Autowired
    private CartRepository cartRepository;

    private HashPassword hashPassword = new HashPassword();

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getHomePage() {
        return "/user/index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginPage() {
        return "/user/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String postLoginPage(ModelMap modelMap, @RequestParam("login-username") String login_username,
            @RequestParam("login-password") String login_password)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        String error = "";

        if (login_username.isEmpty()) {
            error = "Vui lòng điền username";
        } else if (login_password.isEmpty()) {
            error = "Vui lòng điền mật khẩu";
        }

        if (!error.isEmpty()) {
            modelMap.addAttribute("error", error);
            return "/user/login";
        }

        Iterable<Account> findByUsername = accountRepository.findAccountByUsername(login_username);
        for (Account account : findByUsername) {
            if (account.getUsername().equals(login_username)
                    && hashPassword.ValidatePassword(login_password, account.getPassword())) {
                return "/user/flowerlist";
            }
        }
        modelMap.addAttribute("error", "Tài khoản hoặc mật khẩu không chính xác!");
        modelMap.addAttribute("login-username", login_username);
        return "/user/login";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String postSignupPage(ModelMap modelMap, @RequestParam("signup-username") String signup_username,
            @RequestParam("signup-fullname") String signup_fullname, @RequestParam("signup-email") String signup_email,
            @RequestParam("signup-password") String signup_password,
            @RequestParam("signup-confirmPassword") String signup_confirmPassword)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        String error = "";
        if (signup_username.isEmpty()) {
            error = "Vui lòng điền username";
        } else if (signup_fullname.isEmpty()) {
            error = "Vui lòng điền họ tên";
        } else if (signup_email.isEmpty()) {
            error = "Vui lòng điền email";
        } else if (signup_password.isEmpty()) {
            error = "Vui lòng nhập mật khẩu";
        } else if (signup_confirmPassword.isEmpty()) {
            error = "Vui lòng nhập lại mật khẩu";
        } else if (signup_password.length() < 6) {
            error = "Mật khẩu ít nhất 6 ký tự";
        } else if (!signup_password.equals(signup_confirmPassword)) {
            error = "Mật khẩu không trùng khớp";
        }

        Iterable<Account> findByUsername = accountRepository.findAccountByUsername(signup_username);
        Iterable<Account> findByEmail = accountRepository.findAccountByEmail(signup_email);

        for (Account account : findByUsername) {
            if (account.getUsername().equals(signup_username)) {
                error = "Tên tài khoản đã tồn tại";
            }
        }

        for (Account account : findByEmail) {
            if (account.getEmail().equals(signup_email) && error.isEmpty()) {
                error = "Email đã tồn tại";
            }
        }

        if (!error.isEmpty()) {
            modelMap.addAttribute("error", error);
            modelMap.addAttribute("signup_username", signup_username);
            modelMap.addAttribute("signup_fullname", signup_fullname);
            modelMap.addAttribute("signup_email", signup_email);
            return "/user/login";
        }

        String passwordHashed = hashPassword.GenerateStringPasswordHash(signup_password);
        Account createAccount = new Account(signup_username, signup_fullname, signup_email, passwordHashed);
        accountRepository.save(createAccount);
        modelMap.addAttribute("message", "Tạo tài khoản thành công!");
        return "/user/login";
    }

    @RequestMapping(value = "/flowers", method = RequestMethod.GET)
    public String getFlowerList(ModelMap modelMap) {
        Iterable<Flower> flowers = flowerRepository.findAll();
        modelMap.addAttribute("flowers", flowers);
        return "/user/flowerlist";
    }

    @RequestMapping(value = "/flowers", method = RequestMethod.POST)
    public String postFlowerList(ModelMap modelMap, @RequestParam("sort-price") String sort_price,
            @RequestParam("price-from") String price_from, @RequestParam("price-to") String price_to,
            @RequestParam("sort-name") String sort_name,
            @RequestParam("byname") String name) {
        Iterable<Flower> flowers = new ArrayList<>();
        if (name.isEmpty()) {
            if (sort_price.equals("1")) { // 1: thap den cao
                flowers = flowerRepository.FilterFlowerByPriceASC();
            } else if (sort_price.equals("2")) { // 2: cao den thap
                flowers = flowerRepository.FilterFlowerByPriceDESC();
            } else if (sort_name.equals("0")) { // 0: A - Z
                flowers = flowerRepository.FilterFlowerByNameASC();
            } else if (sort_name.equals("1")) { // 1: Z - A
                flowers = flowerRepository.FilterFlowerByNameDESC();
            } else {
                flowers = flowerRepository.findAll();
            }
        } else if (!name.isEmpty()) {
            if (sort_price.equals("1")) { // 1: thap den cao
                flowers = flowerRepository.findByNameAndFilterFlowerByPriceASC(name);
            } else if (sort_price.equals("2")) { // 2: cao den thap
                flowers = flowerRepository.findByNameAndFilterFlowerByPriceDESC(name);
            } else if (sort_name.equals("0")) { // 0: A - Z
                flowers = flowerRepository.findByNameAndFilterFlowerByNameASC(name);
            } else if (sort_name.equals("1")) { // 1: Z - A
                flowers = flowerRepository.findByNameAndFilterFlowerByNameDESC(name);
            } else {
                flowers = flowerRepository.findAllFlowerByName(name);
            }
        } else {
            flowers = flowerRepository.findAll();
        }

        if (!price_from.isEmpty() && !price_to.isEmpty()) {
            int price_from_int = Integer.parseInt(price_from);
            int price_to_int = Integer.parseInt(price_to);
            List<Flower> flowersSend = new ArrayList<>();
            for (Flower flower : flowers) {
                if (flower.getPrice() >= price_from_int && flower.getPrice() <= price_to_int) {
                    flowersSend.add(flower);
                }
            }
            modelMap.addAttribute("flowers", flowersSend);
        } else {
            modelMap.addAttribute("flowers", flowers);
        }
        modelMap.addAttribute("name", name);
        modelMap.addAttribute("sort_price", sort_price);
        modelMap.addAttribute("sort_name", sort_name);
        modelMap.addAttribute("price_from", price_from);
        modelMap.addAttribute("price_to", price_to);
        return "/user/flowerlist";
    }

    @RequestMapping(value = "/flowerinfo/{id}", method = RequestMethod.GET)
    public String getFlowerInfo(@PathVariable int id, ModelMap modelMap) {
        Optional<Flower> flower = flowerRepository.findById(id);
        modelMap.addAttribute("flower", flower.get());
        return "/user/flowerinfo";
    }

    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public String getCart() {
        return "/user/cartstep1";
    }

    // @RequestMapping(value = "/cart", method = RequestMethod.GET)
    // public String getCart() {
    // return "/user/cartstep1";
    // }

    @RequestMapping(value = "/cart/ordernow", method = RequestMethod.POST)
    public String postCart(ModelMap modelMap, @RequestParam("flower-id") int flower_id,
            @RequestParam("flower-amount") int flower_amount) {
        Iterable<Flower> flowers = flowerRepository.findFlowerById(flower_id);
        int total = 0;
        String name = "";
        String image = "";
        int price = 0;
        int totalFlower = 0;
        for (Flower flower : flowers) {
            total = flower.getPrice() * flower_amount;
            name = flower.getName();
            image = flower.getImage1();
            price = flower.getPrice() * flower_amount;
        }
        Cart cart = new Cart(0, flower_id, name, flower_amount, price, image, "lnkhanhduy", "ordernow", total);
        cartRepository.save(cart);

        Iterable<Cart> carts = cartRepository.findCartByStatus("ordernow");

        modelMap.addAttribute("carts", carts);
        modelMap.addAttribute("totalFlower", flower_amount);
        modelMap.addAttribute("total", total);
        return "/user/cartstep1";
    }

    @RequestMapping(value = "/cart-step-2", method = RequestMethod.GET)
    public String getFillInfo() {
        return "/user/cartstep2";
    }

    @RequestMapping(value = "/cart-step-2", method = RequestMethod.POST)
    public String postFillInfo() {
        return "/user/cartstep2";
    }

    @RequestMapping(value = "/cart-step-2/ordernow", method = RequestMethod.POST)
    public String postCartStep2Ordernow(ModelMap modelMap, @RequestParam("cart-id") int cart_id) {
        Iterable<Cart> carts = cartRepository.findCartById(cart_id);
        int total = 0;
        for (Cart cart : carts) {
            total = cart.getTotal();
        }
        modelMap.addAttribute("total", total);
        modelMap.addAttribute("carts", carts);
        return "/user/cartstep2";
    }

    @RequestMapping(value = "/cart-step-3", method = RequestMethod.GET)
    public String getPayment() {
        return "/user/cartstep3";
    }

    @RequestMapping(value = "/cart-step-3", method = RequestMethod.POST)
    public String postPayment(ModelMap modelMap, @RequestParam("fullname") String fullname,
            @RequestParam("pnumber") String pnumber, @RequestParam("email") String email,
            @RequestParam("address") String address) {

        return "/user/cartstep3";
    }

    @RequestMapping(value = "/cart-step-3/ordernow", method = RequestMethod.POST)
    public String postPaymentOrdernow(ModelMap modelMap, @RequestParam("fullname") String fullname,
            @RequestParam("pnumber") String pnumber, @RequestParam("email") String email,
            @RequestParam("address") String address, @RequestParam("cart-id") int cart_id) {
        Iterable<Cart> carts = cartRepository.findCartById(cart_id);
        int total = 0;
        for (Cart cart : carts) {
            total = cart.getTotal();
        }
        modelMap.addAttribute("total", total);
        modelMap.addAttribute("fullname", fullname);
        modelMap.addAttribute("pnumber", pnumber);
        modelMap.addAttribute("email", email);
        modelMap.addAttribute("address", address);
        modelMap.addAttribute("cart-id", cart_id);
        return "/user/cartstep3";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String getProfile() {
        return "/user/profile";
    }
}
