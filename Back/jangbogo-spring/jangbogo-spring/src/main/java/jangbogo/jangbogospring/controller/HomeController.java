package jangbogo.jangbogospring.controller;

import jangbogo.jangbogospring.domain.Member;
import jangbogo.jangbogospring.session.HttpSessionUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(@SessionAttribute(name = HttpSessionUtils.LOGIN_MEMBER, required = false)Member loginMember, Model model)
    {
        if(loginMember == null)
        {
            return "home/home";
        }

        // 세션이 유지되면 로그인 홈으로 이동
        model.addAttribute("member", loginMember);
        System.out.println("로그인 홈으로 이동");
        return "home/loginHome";
    }

    @GetMapping("/register")
    public String signUp(){
        return "register/register";
    }
}
