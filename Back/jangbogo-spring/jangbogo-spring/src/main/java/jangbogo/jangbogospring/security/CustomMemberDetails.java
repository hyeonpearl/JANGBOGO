package jangbogo.jangbogospring.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

// UserDetails - Spring Security에서 사용자의 정보를 담는 인터페이스이다
// 대부분의 경우 Spring Security의 기본 UserDetails로는 실무에서 필요한 정보를 모두 담을 수 없기에 아래와 같은 CustomUserDetails를 구현하여 사용
public class CustomMemberDetails implements UserDetails {

    private String email;	// DB에서 PK 값
    private String password;	// 비밀번호
    private boolean locked;	//계정 잠김 여부
    private Collection<GrantedAuthority> authorities;	//권한 목록

    // 해당 유저의 권한 목록
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    // 비밀번호
    @Override
    public String getPassword() {
        return password;
    }

    // Member의 PK값 - email
    @Override
    public String getUsername() {
        return email;
    }

    // 계정 만료 여부 - true : 만료 안됨, false : 만료
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    // 계정 잠김 여부 - true : 잠기지 않음, false : 잠김
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    // 비밀번호 만료 여부 - true : 만료 안됨, false : 만료
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    // 사용자 활성화 여부 - true : 활성화, false : 비활성화
    @Override
    public boolean isEnabled() {
        return true;
    }
}
