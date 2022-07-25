package jangbogo.jangbogospring.controller;

import jangbogo.jangbogospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/login")
public class LoginController {
    private final MemberService memberService;

    @Autowired
    public LoginController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("")
    public ModelAndView loginForm() {
        ModelAndView mav = new ModelAndView("login/login");
        return mav;
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
