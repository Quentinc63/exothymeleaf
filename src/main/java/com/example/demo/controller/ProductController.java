package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Product;



@Controller
public class ProductController {

    private final List<Product> products = new ArrayList<>(
        List.of(
            new Product(1L, "Laptop", 999.99),
            new Product(2L, "Smartphone", 499.99),
            new Product(3L, "Tablet", 299.99),
            new Product(4L, "Smartwatch", 199.99),
            new Product(5L, "Headphones", 89.99)
        )
    );
    private Long counter = (long) products.size() ;

    @GetMapping("/products")
    public String getProducts(Model model) {
        model.addAttribute("productList", products);
        return "products";
    }
    
    
}
