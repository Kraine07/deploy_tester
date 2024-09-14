/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.kraine.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.kraine.model.UserModel;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Kraine
 */

@Controller
@RequestMapping("/")
public class index {
    
    @GetMapping("main")
    public String showMainPage(Model model){
        model.addAttribute("user", new UserModel());
        return "main";
    }
    
    @PostMapping("/submit-user")
    public String submitUser(Model model, UserModel user, HttpSession session){
        
        if("john".equals(user.getFirstName())){
            session.setAttribute("loggedIn", true);            
        }
        model.addAttribute("loggedIn", session.getAttribute("loggedIn"));
        return "home";
    }
    
    
}
