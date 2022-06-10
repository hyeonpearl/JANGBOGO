package jangbogo.jangbogospring.controller;

import jangbogo.jangbogospring.service.LoginService;
import jangbogo.jangbogospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {

        this.loginService = loginService;
    }

    @GetMapping("/login")
    public String goLogin() {
        return "login/login_index";
    }
    
    @PostMapping("/login")
    public String login(MemberDto memberDto){
        System.out.println("로그인 시도");
        
        boolean canLogin = loginService.login(memberDto.toEntity());

        if(canLogin){
            System.out.println("로그인 성공");
            return "home/home_index";
        }
        else{
            System.out.println("로그인 실패");
            return "login/login_index";
        }
    }
}
