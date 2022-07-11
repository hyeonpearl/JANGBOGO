package jangbogo.jangbogospring.controller;

import jangbogo.jangbogospring.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

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
