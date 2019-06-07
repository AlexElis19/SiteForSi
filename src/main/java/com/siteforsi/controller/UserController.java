package com.siteforsi.controller;

import com.siteforsi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping("/users")
    public String getAllUsers(Model model){
        model.addAttribute("users",userService.findAll());
        return "usersList";
    }

}
