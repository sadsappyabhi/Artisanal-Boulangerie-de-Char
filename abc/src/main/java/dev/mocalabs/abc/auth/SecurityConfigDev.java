package dev.mocalabs.abc.auth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.boot.security.autoconfigure.web.servlet.PathRequest.toH2Console;

@Configuration
@Profile("dev")
public class SecurityConfigDev {
    @Bean
    public SecurityFilterChain securityFilterChainDev(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.ignoringRequestMatchers("/h2-console/**"))
                .headers(headers -> headers.frameOptions(frame -> frame.disable()))
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers(toH2Console()).permitAll()
                        .anyRequest().permitAll());

        return http.build();
    }
}
