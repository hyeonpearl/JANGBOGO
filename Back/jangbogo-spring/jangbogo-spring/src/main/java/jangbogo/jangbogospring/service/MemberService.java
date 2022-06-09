package jangbogo.jangbogospring.service;

import jangbogo.jangbogospring.domain.Member;

import jangbogo.jangbogospring.repository.MemberRepository;
import jangbogo.jangbogospring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //회원가입
    public Long join(Member member)
    {
        System.out.println("join 버튼 누름");
        //해당 email을 가진 회원이 있으면
        memberRepository.findByEmail(member.getEmail())
                        .ifPresent(member1 -> {
                            throw new IllegalStateException("이미 존재하는 회원입니다.");
                        });

        memberRepository.save(member);
        return member.getId();
    }

    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findEmail(String memberEmail){

        return memberRepository.findByEmail(memberEmail);
    }

    public int isCheckEmail(String memberEmail){
        Optional<Member> member = findEmail(memberEmail);

        // 저장값이 존재하지 않으면 0
        if(!member.isPresent()){
            System.out.println("해당 이메일 없음");
            return 0;
        }
        else{
            System.out.println("해당 이메일 존재" + member.get().getEmail());
            return 1;
        }
    }

    public boolean login(Member member){
        Optional<Member> findMember = memberRepository.findByEmail(member.getEmail());

        //널 값인지 확인
        if(findMember.isPresent()){
            return false;
        }

        //비밀번호 동일한지 확인
        if(!findMember.get().getPassword().equals(member.getPassword())){
            return false;
        }

        //로그인 가능
        return true;
    }
}
