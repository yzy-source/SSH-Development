package com.chinasoft.app.service;

import java.util.List;

import com.chinasoft.app.domain.Products;
import com.chinasoft.app.util.ProductPage;


public interface ProductService {
	public void add(Products product);
    public void update(Products product);
    public void delete(int product_id);
    public ProductPage findAll(int currentPage,int pageSize);
    public Products findProductById(int product_id);
    public ProductPage findProductByName(String productName,int currentPage,int pageSize);
    public ProductPage search(String str,int currentPage,int pageSize);
}
