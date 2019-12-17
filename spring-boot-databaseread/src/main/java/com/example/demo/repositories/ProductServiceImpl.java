package com.example.demo.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.entities.Product;
import com.example.demo.services.ProductService;

@Transactional
@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Iterable<Product> findAll() {
		
		return productRepository.findAll();
	}

	@Override
	public boolean insertR(int id) {
		return productRepository.existsById(id);
	}

	@Override
	public void save(int id, String name,int quantity) {
		// TODO Auto-generated method stub
		Product prod1 = productRepository.findById(id).get();
		prod1.setName(name);
		prod1.setQuantity(quantity);
		productRepository.save(prod1);
	}

	@Override
	public void deleteR(int id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
	}
	
	

}