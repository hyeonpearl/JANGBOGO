package jangbogo.jangbogospring.domain;

import lombok.Builder;

import javax.persistence.*;

@Entity
public class Member {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Builder
    public Member(Long id, String email, String password, String name, String address, String tel) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.address = address;
        this.tel = tel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    private String email;

    private String password;

    private String name;

    private String address;

    private String tel;
}
