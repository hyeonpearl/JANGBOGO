package jangbogo.jangbogospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String goHome()
    {
        return "home/home_index";
    }

    @GetMapping("/login")
    public String goLogin() {
        return "login/login_index";
    }

    @GetMapping("/register")
    public String signUp(){
        return "register/register_index";
    }
}
