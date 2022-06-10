package jangbogo.jangbogospring.controller;

import jangbogo.jangbogospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/register")
    public String createForm(){
        return "register/register_index";
    }

    @PostMapping("/register")
    public String create(MemberDto memberDto){

        memberService.join(memberDto.toEntity());
        //존재하는 이메일이면
        return "redirect:/";
    }

    @ResponseBody
    @PostMapping("/emailCheck")
    public int emailCheck(String email)
    {
        int result = memberService.isCheckEmail(email);

        if(result == 0)
        {
            System.out.println(email + " 사용 가능 이메일입니다.");
        }
        else
        {
            System.out.println(email + " 이미 존재하는 이메일입니다.");
        }

        return result;
    }
}
