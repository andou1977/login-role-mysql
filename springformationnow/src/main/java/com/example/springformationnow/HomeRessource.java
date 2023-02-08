package com.example.springformationnow;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeRessource {

    //acces kounya menm menm ditou 
    @GetMapping("/login")
    public String index(){
        return "/login";
    }

    @GetMapping("/admin")
    public String admin(){
        return "/admin";
    }

    @GetMapping("/user")
    public String user(){
        return "/user";
    }

    @GetMapping("/editor")
    public String editor(){
        return "/Editor";
    }

    @GetMapping("/lector")
    public String lecteur(){
        return "/Lecteur";
    }
}
