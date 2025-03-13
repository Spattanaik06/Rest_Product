package com.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Product;
import com.springboot.repo.ProductRepo;
@Service
public class ProductService 
{
	@Autowired
	private ProductRepo productRepo;
	
	public List<Product> getProducts()
	{
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"mango",6700.00));
		list.add(new Product(2,"Apple",3000.00));
		list.add(new Product(3,"orange",7700.00));
		list.add(new Product(4,"pineApple",3700.00));
		
		List<Product> saveAll = productRepo.saveAll(list);
		
		saveAll.stream().filter(null)
		
		 return saveAll.stream().filter(p->p.getProductCost()>5000).collect(Collectors.toList());
		
	}
	
	
}
