package jangbogo.jangbogospring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration      // 해당 클래스를 Configuration으로 등록한다.
@EnableWebSecurity  // Spring Security를 활성화 시킨다.
public class WebSecurityConfig {


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                // HttpServletRequest에 따라 접근(access)을 제한
                // antMatchers() 메서드로 특정 경로를 지정하며, permitAll(), hasRole() 메서드로 역할(Role)에 따른 접근 설정을 잡아준다.
                .authorizeRequests()
                    .antMatchers(   "/", "/login", "/register", "/css/**", "/js/**", "/File/**").permitAll() // 해당 경로들에 대해서는 권한없이 접근 가능
                    .anyRequest().authenticated()   // 모든 요청에 대해, 인증된 사용자만 접근하도록 설정
                .and()
                // form 기반으로 인증을 하도록 합니다. 로그인 정보는 기본적으로 HttpSession을 이용
                .formLogin()
                    .loginPage("/login")
                    .permitAll()
                .and()
                // 로그아웃을 지원하는 메서드이며 HTTP 세션을 제거
                .logout()
                    .permitAll();
        return http.build();
    }
}
