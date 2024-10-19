package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<String> findAllProducts() {
        return Arrays.asList("Product1","Product2","Product3");
    }

}
