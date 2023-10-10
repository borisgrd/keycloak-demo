package net.browse3d.keycloakdemo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping
    @PreAuthorize("hasRole('client_user')")
    public String hello() {
        return "Hi";
    }

    @GetMapping("/hello-admin")
    @PreAuthorize("hasRole('client_admin')")
    public String hello2() {
        return "Hi ADMIN";
    }
}
