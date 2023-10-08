package net.browse3d.keycloakdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.web.SecurityFilterChain;

import com.nimbusds.jose.crypto.factories.DefaultJWEDecrypterFactory;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@RequiredArgsConstructor
public class SecurityConfig {

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

        // private final JwtDecoder jwtDecoder;
        private final JwtAuthConverter jwtAuthConverter;

        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
                http
                                .csrf(AbstractHttpConfigurer::disable)
                                .authorizeHttpRequests(req -> req.anyRequest()
                                                .fullyAuthenticated())
                                .oauth2ResourceServer((oauth2ResourceServer) -> oauth2ResourceServer
                                                .jwt((jwt) -> jwt.jwtAuthenticationConverter(jwtAuthConverter)))
                                .sessionManagement((session) -> session
                                                .sessionCreationPolicy(SessionCreationPolicy.STATELESS));

                return http.build();

        }

}
