package com.chinasoft.app.dao;

import java.util.List;

import com.chinasoft.app.domain.Products;

public interface ProductDao {
	public void add(Products product);
    public void update(Products product);
    public void delete(int product_id);
    public List<Products> findAll(int currentPage,int pageSize);
    public Products findProductById(int product_id);
    public List<Products> findProductByName(String productName,int currentPage,int pageSize);
    public int findTotalCount();
    public int findProductNum(String productName);
    public List<Products> search(String str,int currentPage,int pageSize);
    public int searchNum(String str);

}
