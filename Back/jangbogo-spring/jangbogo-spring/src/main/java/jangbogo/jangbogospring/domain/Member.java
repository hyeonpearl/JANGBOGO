package jangbogo.jangbogospring.domain;

public class Member {
    private Long id;

    private String email;
    private String password;
    private String name;
    private String address;
    private String phone;

    public Member(Long id, String email, String password, String name, String address, String phone) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}
