package jangbogo.jangbogospring.controller;

import jangbogo.jangbogospring.domain.Member;
import jangbogo.jangbogospring.dto.MemberDto;
import jangbogo.jangbogospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Optional;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
    @PostMapping("/register")
    public String create(MemberDto memberDto){

        memberService.save(memberDto.toEntity());
        //존재하는 이메일이면
        return "redirect:/";
    }

    @ResponseBody
    @PostMapping("/emailCheck")
    public int emailCheck(String email)
    {
        System.out.println("이메일 체크");
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

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/mypage")
    public String mypageForm(Principal principal, Model model) {
        Optional<Member> member = memberService.findEmail(principal.getName());
        model.addAttribute("member", member);
        return "mypage/mypage";
    }

    @GetMapping("/editInfo")
    public String editInfo(){
        return "member/edit-info";
    }

    @GetMapping("/favorite")
    public String favorite() {
        return "member/favorite";
    }
}
