package com.xyz.service;

import java.util.List;

import com.xyz.model.Product;

public interface ProductService {
	
	public Product saveProduct(Product product);
	public List<Product> getAllProduct();
	public String deleteProduct(int id);
	public Product getProductById(int id);
	
	public Product EditProduct(Product product,int id) ;

}
