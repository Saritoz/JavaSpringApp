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
        return "index";
    }

    @RequestMapping(value="/flowers", method = RequestMethod.GET)
    public String getFlowerList() {
        return "flowerlist";
    }

    @RequestMapping(value="/flowerinfo/{id}", method = RequestMethod.GET)
    public String getFlowerInfo(@PathVariable int id) {
        return "flowerinfo";
    }
}
