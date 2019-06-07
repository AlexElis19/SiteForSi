package com.siteforsi.controller;

import com.siteforsi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ProductController {
    @Autowired
    public ProductService productService;

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/reg")
    public String reg(){
        return "reg";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/product")
    public String getAllProduct(Model model){
        model.addAttribute("product",productService.findAll());
        return "productList";
    }

}
