package com.project.movies.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    
    
    @GetMapping("/movies-list-guest")
    public String publicPage() {
        return "movies-list-guest";
    }
}
