package jangbogo.jangbogospring.controller;

import jangbogo.jangbogospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/resister")
    public String createForm(){
        return "home/resister_index";
    }

    @PostMapping("/resister")
    public String create(MemberDto memberDto){

        memberService.join(memberDto.toEntity());
        //존재하는 이메일이면
        return "redirect:/";
    }
}
