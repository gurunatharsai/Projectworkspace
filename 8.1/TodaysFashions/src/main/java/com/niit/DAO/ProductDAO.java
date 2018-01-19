package com.niit.DAO;

import java.util.List;


import com.niit.model.Product;

public interface ProductDAO {
	public void addproduct(Product product);
	
	public List<Product> getProList();
	public void deleteProductById(String proid);
	public Product getProductById(String proid);
	public void updateproduct(Product product);
}
