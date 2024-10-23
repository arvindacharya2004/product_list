package com.example.first_spring_boot_application.repository;

import com.example.first_spring_boot_application.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repo extends JpaRepository<ProductModel, Long> {
}
