package tdt.edu.finalproject.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import tdt.edu.finalproject.models.Flower;
import tdt.edu.finalproject.repositories.FlowerRepository;
import tdt.edu.finalproject.repositories.ImageRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private FlowerRepository flowerRepository;

    @Autowired
    private ImageRepository imageRepository;

    @RequestMapping("/login")
    public String getLogin(ModelMap modelMap) {
        return "/admin/login";
    }

    @RequestMapping("")
    public String getDashboard(ModelMap modelMap) {
        modelMap.addAttribute("content", "dashboard.jsp");
        modelMap.addAttribute("active", 0);
        return "/admin/layout";
    }

    @RequestMapping("/usermanagement")
    public String getUserManagement(ModelMap modelMap) {
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
    public String postAddProduct(ModelMap modelMap, @RequestParam("name-product") String name_product,
            @RequestParam("price-product") int price_product, @RequestParam("desc-product") String desc_product,
            @RequestParam("quantity-product") int quantity_product,
            @RequestParam("images-product") MultipartFile[] multipartFile) {

        String error = "";
        if (name_product.isEmpty()) {
            error = "Vui lòng nhập tên sản phẩm";
        } else if (price_product == 0) {
            error = "Vui lòng nhập giá sản phẩm";
        } else if (desc_product.isEmpty()) {
            error = "Vui lòng nhập mô tả sản phẩm";
        } else if (quantity_product == 0) {
            error = "Vui lòng nhập số lượng sản phẩm";
        }

        if (!error.isEmpty()) {
            modelMap.addAttribute("error", error);
            modelMap.addAttribute("name-product", name_product);
            modelMap.addAttribute("price-product", price_product);
            modelMap.addAttribute("desc-product", desc_product);
            modelMap.addAttribute("quantity-product", quantity_product);
            Iterable<Flower> flowers = flowerRepository.findAll();
            modelMap.addAttribute("flowers", flowers);
            modelMap.addAttribute("content", "productmanagement.jsp");
            modelMap.addAttribute("active", 2);
            return "/admin/layout";
        }

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
                    quantity_product, (imageStrings.size()) > 0 ? (imageStrings.get(0)) : null,
                    (imageStrings.size()) > 1 ? (imageStrings.get(1)) : null,
                    (imageStrings.size()) > 2 ? (imageStrings.get(2)) : null,
                    (imageStrings.size()) > 3 ? (imageStrings.get(3)) : null,
                    (imageStrings.size()) > 4 ? (imageStrings.get(4)) : null);
            flowerRepository.save(flower);
        } catch (Exception e) {
            // TODO: handle exception
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
    public String postEditProduct(ModelMap modelMap, @RequestParam("id-product") int id_product,
            @RequestParam("name-product") String name_product,
            @RequestParam("price-product") int price_product, @RequestParam("desc-product") String desc_product,
            @RequestParam("quantity-product") int quantity_product,
            @RequestParam("images-product") MultipartFile[] multipartFile) {

        String error = "";
        if (name_product.isEmpty()) {
            error = "Vui lòng nhập tên sản phẩm";
        } else if (price_product == 0) {
            error = "Vui lòng nhập giá sản phẩm";
        } else if (desc_product.isEmpty()) {
            error = "Vui lòng nhập mô tả sản phẩm";
        } else if (quantity_product == 0) {
            error = "Vui lòng nhập số lượng sản phẩm";
        }

        if (!error.isEmpty()) {
            modelMap.addAttribute("error", error);
            modelMap.addAttribute("name-product", name_product);
            modelMap.addAttribute("price-product", price_product);
            modelMap.addAttribute("desc-product", desc_product);
            modelMap.addAttribute("quantity-product", quantity_product);
            Iterable<Flower> flowers = flowerRepository.findAll();
            modelMap.addAttribute("flowers", flowers);
            modelMap.addAttribute("content", "productmanagement.jsp");
            modelMap.addAttribute("active", 2);
            return "/admin/layout";
        }

        List<String> imageStrings = new ArrayList<String>();
        try {
            for (MultipartFile multipartF : multipartFile) {
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss ");
                Date date = new Date();
                String nameImage = formatter.format(date) + multipartF.getOriginalFilename();
                imageStrings.add(nameImage);
                imageRepository.saveImage(multipartF, nameImage);
            }
            Flower flower = new Flower(id_product, name_product, price_product, desc_product,
                    quantity_product, (imageStrings.size()) > 0 ? (imageStrings.get(0)) : null,
                    (imageStrings.size()) > 1 ? (imageStrings.get(1)) : null,
                    (imageStrings.size()) > 2 ? (imageStrings.get(2)) : null,
                    (imageStrings.size()) > 3 ? (imageStrings.get(3)) : null,
                    (imageStrings.size()) > 4 ? (imageStrings.get(4)) : null);
            flowerRepository.save(flower);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        Iterable<Flower> flowers = flowerRepository.findAll();
        modelMap.addAttribute("flowers", flowers);
        modelMap.addAttribute("message", "Sửa sản phẩm thành công!");
        modelMap.addAttribute("content", "productmanagement.jsp");
        modelMap.addAttribute("active", 2);
        return "/admin/layout";
    }

    @RequestMapping(value = "/productmanagement/delete", method = RequestMethod.POST)
    public String postDeleteProduct(ModelMap modelMap, @RequestParam("id-product") int id_product) {
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
        modelMap.addAttribute("content", "ordermanagement.jsp");
        modelMap.addAttribute("active", 3);
        return "/admin/layout";
    }
}
