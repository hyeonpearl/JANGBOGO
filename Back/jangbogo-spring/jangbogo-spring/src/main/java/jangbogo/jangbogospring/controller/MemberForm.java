package jangbogo.jangbogospring.controller;

import javax.persistence.Column;

public class MemberForm {
    private Long id;

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String tel;
}
