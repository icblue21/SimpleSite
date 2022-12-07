package com.example.simplesite.controller;

import com.example.simplesite.service.SimpleSiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class MemberController {

    @Autowired
    SimpleSiteService ss;

    @PostMapping("/signup")
    public String signUp(@RequestParam HashMap<String,String> params){

        if(ss.insertMember(params) > 0){
            return "index";
        } else {
            return "signup";
        }
    }

    @PostMapping("/login")
    public String login(@RequestParam HashMap<String,String> params, HttpSession session){

        HashMap<String,String> map = ss.selectMember(params);
        if(map != null){
            session.setAttribute("name",map.get("name"));
            return "index";
        } else {
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("name");
        return "index";
    }
}
