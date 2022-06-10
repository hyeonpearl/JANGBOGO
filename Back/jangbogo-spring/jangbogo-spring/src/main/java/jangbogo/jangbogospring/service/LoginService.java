package jangbogo.jangbogospring.service;

import jangbogo.jangbogospring.domain.Member;
import jangbogo.jangbogospring.repository.MemberRepository;

import java.util.Optional;

public class LoginService {
    private final MemberRepository memberRepository;

    public LoginService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    public boolean login(Member member){
        Optional<Member> findMember = memberRepository.findByEmail(member.getEmail());

        //널 값이면 로그인 X
        if(!findMember.isPresent()){
            return false;
        }

        //비밀번호 동일하지 않으면 로그인 X
        if(!findMember.get().getPassword().equals(member.getPassword())){
            return false;
        }

        //로그인 가능
        return true;
    }
}
