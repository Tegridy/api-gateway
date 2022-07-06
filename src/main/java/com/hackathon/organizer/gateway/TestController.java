package com.hackathon.organizer.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class TestController {

    @GetMapping("/")
    public String index(Principal principal) {
        return principal.getName();
    }
}
