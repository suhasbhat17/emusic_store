package org.suhas.emusicstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by suhas on 5/25/2016.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "home";
    }


    @RequestMapping("/login")
    public String login(@RequestParam(value = "error",required = false) String error, @RequestParam(value = "logout",required = false) String logout, Model model){
        if(error!=null){
            model.addAttribute("error","No matching Username and Password found");
        }
        if(logout!=null){
            model.addAttribute("msg","Logout Successfull");
        }
        return "login";
    }
}
