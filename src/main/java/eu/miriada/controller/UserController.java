package eu.miriada.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    public String getUser(){
        System.out.println("user");
        return "user";
    }

    @PostMapping
    @PreAuthorize("hasAuthority('user:write')")
    public String setUser(){
        System.out.println("setUser");
        return "user";
    }

}
