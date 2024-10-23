package com.example.first_spring_boot_application;
import com.example.first_spring_boot_application.models.ProductModel;
import com.example.first_spring_boot_application.repository.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class service {

    @Autowired
    private repo repos;

    public List<ProductModel> getall(){

        return repos.findAll();
    }
}
