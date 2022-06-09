package jangbogo.jangbogospring.controller;

import com.sun.istack.NotNull;
import jangbogo.jangbogospring.domain.Member;
import lombok.Builder;

public class MemberDto {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

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
