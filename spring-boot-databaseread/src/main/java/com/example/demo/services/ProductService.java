package com.example.demo.services;

import com.example.demo.entities.Product;

public interface ProductService {

	public Iterable<Product> findAll();
	
	public boolean insertR(int id);
	
	public void save(int id,String name,int quantity);
	
	public void deleteR(int id);

}