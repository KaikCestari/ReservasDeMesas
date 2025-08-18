package com.devkaik7.ReservasMesas.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/h2-console/**").permitAll()
                        .anyRequest().authenticated()
                )
                .csrf(csrf -> csrf.disable()) // necessário para H2
                .headers(headers -> headers.frameOptions(frame -> frame.disable())) // H2 precisa
                .formLogin(form -> form.loginPage("/login").permitAll()); // nova forma de habilitar login

        return http.build();
    }


}
