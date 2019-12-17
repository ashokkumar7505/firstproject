package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entities.Product;
import com.example.demo.services.ProductService;

@Controller
@RequestMapping("product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.GET)
	public void index(ModelMap modelMap) {
		modelMap.put("products", productService.findAll());
		for (Product product : productService.findAll()) {
			System.out.println("Product Data -"+ product.getId()+"-"+ product.getName()+ "-"+product.getPrice()+ "-"
		+product.getQuantity());
		}
		//return "product/index";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void checkid(int id) {
		System.out.println("Product "+id +" - "+productService.insertR(id));
	}
	
	
	@RequestMapping(method = RequestMethod.PATCH)
	public void savedata(int id,String name, int quantity) {
		
		System.out.println("*******************Before Updating*************");
		for (Product product : productService.findAll()) {
			System.out.println("Product Data -"+ product.getId()+"-"+ product.getName()+ "-"+product.getPrice()+ "-"
		+product.getQuantity());
		}
		
		productService.save(id, name, quantity);
		
		System.out.println("*******************After Updating*************");
		for (Product product : productService.findAll()) {
			System.out.println("Product Data -"+ product.getId()+"-"+ product.getName()+ "-"+product.getPrice()+ "-"
		+product.getQuantity());
		}
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void deleteR(int id) {
		System.out.println("******************In DELETE method**************");
		productService.deleteR(id);
	}
	
	

}