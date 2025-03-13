package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Product;
import com.springboot.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController 
{
	
	@Autowired
	private ProductService productService;
	
	
	@GetMapping("/emp")
	public List<Product> getAllEmpWithCondn()
	{
	return	productService.getProducts();
	
	}
	
}
