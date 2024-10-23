package com.example.first_spring_boot_application;

import com.example.first_spring_boot_application.models.ProductModel;
import com.example.first_spring_boot_application.repository.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;
@Component
public class data  {

    @Autowired
    private repo repos;



    public void seed(@ModelAttribute ProductModel pm) throws Exception{
if(repos.count()==0) {
    List<ProductModel> prod = Arrays.asList(
            new ProductModel(pm.getProductname(), pm.getPrice(), pm.getDescription(), pm.getCategory(), pm.getTotal_rating()));
    repos.saveAll(prod);

    System.out.println("seeded");
}
else{
        List<ProductModel> prod = Arrays.asList(
                new ProductModel(pm.getProductname(), pm.getPrice(), pm.getDescription(), pm.getCategory(), pm.getTotal_rating()));
        repos.saveAll(prod);
    System.out.println("seeded");

    }
}
    }

