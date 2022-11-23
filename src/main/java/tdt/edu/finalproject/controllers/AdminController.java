package tdt.edu.finalproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
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
