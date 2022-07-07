package jangbogo.jangbogospring.dto;

import com.sun.istack.NotNull;
import jangbogo.jangbogospring.domain.Member;
import lombok.Builder;

public class MemberDto {

    @NotNull
    private Long id;
    private String name;
    private String email;
    private String password;
    private String address;
    private String tel;

    public Member toEntity() {
        Member build = Member.builder()
                .id(id)
                .email(email)
                .password(password)
                .name(name)
                .address(address)
                .tel(tel)
                .build();
        return build;
    }

    @Builder
    public MemberDto(Long id, String name, String email, String password, String address, String tel) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.tel = tel;
    }

    protected MemberDto(){

    }
}
