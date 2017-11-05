package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class IndexController {
   
    @RequestMapping("/loginn")
    String loginn(){
        return "loginn";
    }
    @RequestMapping("/home")
    String personhome(){
        return "personhome";
    }
    @RequestMapping("/other")
    String othershome(){
        return "othershome";
    }
    @RequestMapping("/follower")
    String follower(){
        return "follower";
    }
    @RequestMapping("/following")
    String following(){
        return "following";
    }
    @RequestMapping("/logsuc")
    String logsuc(){
        return "logsuc";
    }
}