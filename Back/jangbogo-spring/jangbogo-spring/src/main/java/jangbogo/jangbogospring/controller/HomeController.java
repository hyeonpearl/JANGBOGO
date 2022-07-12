package jangbogo.jangbogospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home()
    {
        return "home/home";
    }

    @GetMapping("/register")
    public String signUp(){
        return "register/register";
    }
}
