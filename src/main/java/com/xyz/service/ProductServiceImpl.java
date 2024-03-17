package com.xyz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.model.Product;
import com.xyz.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
		
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public String deleteProduct(int id) {
		// TODO Auto-generated method stub
		boolean b= productRepository.findById(id).isPresent();
		if(b) {
			productRepository.delete(productRepository.findById(id).get());
			return "Deleted Successfully";
		}
		return "Not Deleted";
				
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}

	@Override
	public Product EditProduct(Product product, int id) {
		// TODO Auto-generated method stub
		Product oldProduct= productRepository.findById(id).get();
		oldProduct.setProductName(product.getProductName());
		oldProduct.setDescription(product.getDescription());
		oldProduct.setPrice(product.getPrice());
		oldProduct.setStatus(product.getStatus());
		return productRepository.save(oldProduct);
	}

}
