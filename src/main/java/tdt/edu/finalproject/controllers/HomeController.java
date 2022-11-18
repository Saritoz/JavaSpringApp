package tdt.edu.finalproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value="", method = RequestMethod.GET)
    public String getHomePage() {
        return "/user/index";
    }

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String getLoginPage() {
        return "/user/login";
    }

    @RequestMapping(value="/flowers", method = RequestMethod.GET)
    public String getFlowerList() {
        return "/user/flowerlist";
    }

    @RequestMapping(value="/flowerinfo/{id}", method = RequestMethod.GET)
    public String getFlowerInfo(@PathVariable int id) {
        return "/user/flowerinfo";
    }

    @RequestMapping(value="/cart", method = RequestMethod.GET)
    public String getCart() {
        return "/user/cartstep1";
    }

    @RequestMapping(value="/cart-step-2", method = RequestMethod.GET)
    public String getFillInfo() {
        return "/user/cartstep2";
    }

    @RequestMapping(value="/cart-step-2", method = RequestMethod.POST)
    public String postFillInfo() {
        return "redirect:/cart-step-3";
    }

    @RequestMapping(value="/cart-step-3", method = RequestMethod.GET)
    public String getPayment() {
        return "/user/cartstep3";
    }

    @RequestMapping(value="/cart-step-3", method = RequestMethod.POST)
    public String postPayment() {
        return "redirect:/";
    }

    @RequestMapping(value="/profile", method = RequestMethod.GET)
    public String getProfile() {
        return "/user/profile";
    }
}
