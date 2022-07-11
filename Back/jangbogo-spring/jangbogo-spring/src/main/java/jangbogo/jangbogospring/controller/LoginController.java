package jangbogo.jangbogospring.controller;

import jangbogo.jangbogospring.dto.MemberDto;
import jangbogo.jangbogospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    private final MemberService memberService;

    @Autowired
    public LoginController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/login")
    public String loginForm() {
        return "login/login";
    }

    /*
    @PostMapping("/login")
    public String login(MemberDto memberDto){

        System.out.println("로그인 시도");
        boolean canLogin = memberService.login(memberDto.toEntity());

        if(canLogin){

            System.out.println("로그인 성공");
            return "redirect:/";
        }
        else{
            System.out.println("로그인 실패");
            return "login/login";
        }
    }*/

    /*
    @PostMapping("/logout")
    public String logout(){

        return "redirect:/";
    }*/
}
