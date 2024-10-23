package com.example.first_spring_boot_application.Controller;


import com.example.first_spring_boot_application.data;
import com.example.first_spring_boot_application.models.ProductModel;
import com.example.first_spring_boot_application.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class ProductController {


    @Autowired
    private service serv;
    @Autowired
    private data dt;

    private ProductModel pro;
    @GetMapping("/")
    public String index() {
        return "index"; // Returns the index.html from the templates directory
    }
    @PostMapping("/submit")
    public String out(@ModelAttribute ProductModel pm) throws Exception {
        dt.seed(pm);

        return "index";
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {
        List<ProductModel> pro = serv.getall(); // Retrieve products from the database
        model.addAttribute("products", pro); // Add products to the model
        return "productList"; // Return the name of the view template
    }
}

