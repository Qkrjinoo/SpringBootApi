package com.test.SpringBootApi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class BoardController {

    @GetMapping("/home")
    public String homepage() {
        return "home";
    }
}
