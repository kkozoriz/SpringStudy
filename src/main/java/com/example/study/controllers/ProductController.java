package com.example.study.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @GetMapping("/")
    public String getProducts() {

        return "products";
    }
}
