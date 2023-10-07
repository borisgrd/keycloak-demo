package net.browse3d.keycloakdemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

        // Old deprecated way
        // public SecurityFilterChain securityFilterChain(HttpSecurity http) throws
        // Exception {
        // http.csrf()
        // .disable()
        // .authorizeHttpRequests()
        // .anyRequest()
        // .fullyAuthenticated();

        // http.oauth2ResourceServer()
        // .jwt();

        // http.sessionManagement()
        // .sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        // return http.build();

        // }

        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
                http.csrf()
                                .disable()
                                .authorizeHttpRequests()
                                .anyRequest()
                                .fullyAuthenticated();

                http.oauth2ResourceServer()
                                .jwt();

                http.sessionManagement()
                                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);

                return http.build();

        }

}
