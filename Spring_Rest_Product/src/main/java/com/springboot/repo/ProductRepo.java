package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
