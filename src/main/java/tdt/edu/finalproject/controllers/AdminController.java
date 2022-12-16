package tdt.edu.finalproject.controllers;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import tdt.edu.finalproject.models.Account;
import tdt.edu.finalproject.models.Flower;
import tdt.edu.finalproject.models.OrderF;
import tdt.edu.finalproject.repositories.AccountRepository;
import tdt.edu.finalproject.repositories.FlowerRepository;
import tdt.edu.finalproject.repositories.ImageRepository;
import tdt.edu.finalproject.repositories.OrderRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private FlowerRepository flowerRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ImageRepository imageRepository;

    private HashPassword hashPassword = new HashPassword();

    @RequestMapping("/login")
    public String getLogin(ModelMap modelMap) {
        return "/admin/login";
    }

    @RequestMapping("")
    public String getDashboard(ModelMap modelMap) {
        Iterable<OrderF> orders = orderRepository.findAllOrderGroupById();
        int flower_sold = 0;
        int order_waiting = 0;
        int total_today = 0;
        for (OrderF orderF : orders) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDateTime now = LocalDateTime.now();
            if (orderF.getTimeResponse().equals(dtf.format(now).toString())
                    && orderF.getStatus().equals("Thành công")) {
                flower_sold++;
                total_today += orderF.getTotal();
            }
            if (orderF.getStatus().equals("Chờ xác nhận")) {
                order_waiting++;
            }
        }
        modelMap.addAttribute("flower_sold", flower_sold);
        modelMap.addAttribute("order_waiting", order_waiting);
        modelMap.addAttribute("total_today", total_today);
        modelMap.addAttribute("content", "dashboard.jsp");
        modelMap.addAttribute("active", 0);
        return "/admin/layout";
    }

    @RequestMapping("/usermanagement")
    public String getUserManagement(ModelMap modelMap) {
        Iterable<Account> accounts = accountRepository.findAll();
        modelMap.addAttribute("accounts", accounts);
        modelMap.addAttribute("content", "usermanagement.jsp");
        modelMap.addAttribute("active", 1);
        return "/admin/layout";
    }

    @RequestMapping(value = "/usermanagement/delete", method = RequestMethod.POST)
    public String deleteUserManagement(ModelMap modelMap, @RequestParam("username") String username) {
        accountRepository.deleteByUsername(username);
        Iterable<Account> accounts = accountRepository.findAll();
        modelMap.addAttribute("accounts", accounts);
        modelMap.addAttribute("content", "usermanagement.jsp");
        modelMap.addAttribute("active", 1);
        return "/admin/layout";
    }

    @RequestMapping(value = "/usermanagement/reset", method = RequestMethod.POST)
    public String resetUserManagement(ModelMap modelMap, @RequestParam("username") String username)
            throws NoSuchAlgorithmException, InvalidKeySpecException {
        String password = hashPassword.GenerateStringPasswordHash(username);
        accountRepository.updatePasswordAccount(password, username);
        Iterable<Account> accounts = accountRepository.findAll();
        modelMap.addAttribute("accounts", accounts);
        modelMap.addAttribute("content", "usermanagement.jsp");
        modelMap.addAttribute("active", 1);
        return "/admin/layout";
    }

    @RequestMapping("/productmanagement")
    public String getProductManagement(ModelMap modelMap) {
        Iterable<Flower> flowers = flowerRepository.findAll();
        modelMap.addAttribute("flowers", flowers);
        modelMap.addAttribute("content", "productmanagement.jsp");
        modelMap.addAttribute("active", 2);
        return "/admin/layout";
    }

    @RequestMapping(value = "/productmanagement/add", method = RequestMethod.POST)
    public String addProduct(ModelMap modelMap, @RequestParam("name-product") String name_product,
            @RequestParam("price-product") int price_product, @RequestParam("desc-product") String desc_product,
            @RequestParam("quantity-product") int quantity_product,
            @RequestParam("category-product") String category_product,
            @RequestParam("images-product") MultipartFile[] multipartFile) {
        List<String> imageStrings = new ArrayList<String>();
        try {
            for (MultipartFile multipartF : multipartFile) {
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss ");
                Date date = new Date();
                String nameImage = formatter.format(date) + multipartF.getOriginalFilename();
                imageStrings.add(nameImage);
                imageRepository.saveImage(multipartF, nameImage);
            }
            Flower flower = new Flower(0, name_product, price_product, desc_product,
                    quantity_product, category_product, (imageStrings.size()) > 0 ? (imageStrings.get(0)) : null,
                    (imageStrings.size()) > 1 ? (imageStrings.get(1)) : null,
                    (imageStrings.size()) > 2 ? (imageStrings.get(2)) : null,
                    (imageStrings.size()) > 3 ? (imageStrings.get(3)) : null,
                    (imageStrings.size()) > 4 ? (imageStrings.get(4)) : null);
            flowerRepository.save(flower);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Iterable<Flower> flowers = flowerRepository.findAll();
        modelMap.addAttribute("flowers", flowers);
        modelMap.addAttribute("message", "Thêm sản phẩm thành công!");
        modelMap.addAttribute("content", "productmanagement.jsp");
        modelMap.addAttribute("active", 2);
        return "/admin/layout";
    }

    @RequestMapping(value = "/productmanagement/edit", method = RequestMethod.POST)
    public String updateProduct(ModelMap modelMap, @RequestParam("id-product") int id_product,
            @RequestParam("name-product") String name_product,
            @RequestParam("price-product") int price_product, @RequestParam("desc-product") String desc_product,
            @RequestParam("quantity-product") int quantity_product,
            @RequestParam("category-product") String category_product,
            @RequestParam("images-product") MultipartFile[] multipartFile) throws IOException {
        if (!multipartFile[0].isEmpty()) {
            List<String> imageStrings = new ArrayList<String>();
            try {
                for (MultipartFile multipartF : multipartFile) {
                    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss ");
                    Date date = new Date();
                    String nameImage = formatter.format(date) + multipartF.getOriginalFilename();
                    imageStrings.add(nameImage);
                    imageRepository.saveImage(multipartF, nameImage);
                }
                Flower flower = new Flower(id_product, name_product, price_product,
                        desc_product,
                        quantity_product, category_product, (imageStrings.size()) > 0 ? (imageStrings.get(0)) : null,
                        (imageStrings.size()) > 1 ? (imageStrings.get(1)) : null,
                        (imageStrings.size()) > 2 ? (imageStrings.get(2)) : null,
                        (imageStrings.size()) > 3 ? (imageStrings.get(3)) : null,
                        (imageStrings.size()) > 4 ? (imageStrings.get(4)) : null);
                flowerRepository.save(flower);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            flowerRepository.updateFlower(name_product, price_product, desc_product, quantity_product, category_product,
                    id_product);
        }

        Iterable<Flower> flowers = flowerRepository.findAll();
        modelMap.addAttribute("flowers", flowers);
        modelMap.addAttribute("message", "Sửa sản phẩm thành công!");
        modelMap.addAttribute("content", "productmanagement.jsp");
        modelMap.addAttribute("active", 2);
        return "/admin/layout";
    }

    @RequestMapping(value = "/productmanagement/delete", method = RequestMethod.POST)
    public String deleteProduct(ModelMap modelMap, @RequestParam("id-product") int id_product) {
        flowerRepository.deleteById(id_product);
        Iterable<Flower> flowers = flowerRepository.findAll();
        modelMap.addAttribute("flowers", flowers);
        modelMap.addAttribute("message", "Xoá sản phẩm thành công!");
        modelMap.addAttribute("content", "productmanagement.jsp");
        modelMap.addAttribute("active", 2);
        return "/admin/layout";
    }

    @RequestMapping("/ordermanagement")
    public String getOrderManagement(ModelMap modelMap) {
        Iterable<OrderF> ordersGroupBy = orderRepository.findAllOrderGroupById();
        modelMap.addAttribute("ordersGroupBy", ordersGroupBy);
        modelMap.addAttribute("content", "ordermanagement.jsp");
        modelMap.addAttribute("active", 3);
        return "/admin/layout";
    }

    @PostMapping("/ordermanagement/delivery")
    public ResponseEntity<String> updateDeliveryOrderManagement(@RequestBody String idOrder) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        orderRepository.updateTimeResponserder(dtf.format(now).toString(), idOrder);
        orderRepository.updateDeliveryOrder(idOrder);
        return new ResponseEntity<>("Update delivery", HttpStatus.OK);
    }

    @PostMapping("/ordermanagement/success")
    public ResponseEntity<String> updateSuccessOrderManagement(@RequestBody String idOrder) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        orderRepository.updateTimeResponserder(dtf.format(now).toString(), idOrder);
        orderRepository.updateSuccessOrder(idOrder);
        return new ResponseEntity<>("Update success", HttpStatus.OK);
    }

    @PostMapping("/ordermanagement/deny")
    public ResponseEntity<String> updateDenyOrderManagement(@RequestBody String idOrder) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        orderRepository.updateTimeResponserder(dtf.format(now).toString(), idOrder);
        orderRepository.updateDenyOrder(idOrder);
        return new ResponseEntity<>("Update deny", HttpStatus.OK);
    }

    @GetMapping("/ordermanagement/detail/{id}")
    public ResponseEntity<List<OrderF>> getDetailOrderManagement(@PathVariable String id) {
        List<OrderF> orders = orderRepository.findOrderByIdOrder(id);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping("/ordermanagement/getall")
    public ResponseEntity<List<OrderF>> getAllOrderManagement() {
        List<OrderF> orders = orderRepository.findAllOrder();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping("/ordermanagement/getsuccess")
    public ResponseEntity<List<OrderF>> getSuccesOrderManagement() {
        List<OrderF> orders = orderRepository.findAllOrderBySuccess();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping("/ordermanagement/getdelivery")
    public ResponseEntity<List<OrderF>> getDeliveryOrderManagement() {
        List<OrderF> orders = orderRepository.findAllOrderByDelivery();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping("/ordermanagement/getwaiting")
    public ResponseEntity<List<OrderF>> getWaitingOrderManagement() {
        List<OrderF> orders = orderRepository.findAllOrderByWaiting();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping("/ordermanagement/getdeny")
    public ResponseEntity<List<OrderF>> getDenyOrderManagement() {
        List<OrderF> orders = orderRepository.findAllOrderByDeny();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }
}
