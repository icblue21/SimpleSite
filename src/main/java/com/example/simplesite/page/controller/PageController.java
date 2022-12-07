package com.example.simplesite.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PageController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/goLogin")
    public String login(HttpSession session){
        if(session.getAttribute("name") != null){
            return "index";
        }
        return "login";
    }
    @GetMapping("/goSignUp")
    public String signup(HttpSession session){
        if(session.getAttribute("name") != null){
            return "index";
        }
        return "signup";
    }
}
