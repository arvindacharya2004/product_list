package com.example.first_spring_boot_application.models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.web.bind.annotation.ModelAttribute;

@Entity
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;


    public ProductModel(String productname, double price, String description, String category, int total_rating) {
        this.productname = productname;
        this.price = price;
        this.description = description;
        this.category = category;
        this.total_rating = total_rating;
    }

    public ProductModel() {
    }

    private String productname;
    private double price;
    private String description;
    private  String category;
    private  int total_rating;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getTotal_rating() {
        return total_rating;
    }

    public void setTotal_rating(int total_rating) {
        this.total_rating = total_rating;
    }
}
