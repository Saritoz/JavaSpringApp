package tdt.edu.finalproject.controllers;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tdt.edu.finalproject.models.Account;
import tdt.edu.finalproject.models.Flower;
import tdt.edu.finalproject.repositories.AccountRepository;
import tdt.edu.finalproject.repositories.FlowerRepository;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private FlowerRepository flowerRepository;

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

    @RequestMapping(value = "/cart", method = RequestMethod.POST)
    public String postCart(ModelMap modelMap, @RequestParam("flower-id") int flower_id,
            @RequestParam("flower-amount") int flower_amount) {
        return "/user/cartstep1";
    }

    @RequestMapping(value = "/cart-step-2", method = RequestMethod.GET)
    public String getFillInfo() {
        return "/user/cartstep2";
    }

    @RequestMapping(value = "/cart-step-2", method = RequestMethod.POST)
    public String postFillInfo() {
        return "redirect:/cart-step-3";
    }

    @RequestMapping(value = "/cart-step-3", method = RequestMethod.GET)
    public String getPayment() {
        return "/user/cartstep3";
    }

    @RequestMapping(value = "/cart-step-3", method = RequestMethod.POST)
    public String postPayment() {
        return "redirect:/";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String getProfile() {
        return "/user/profile";
    }
}
