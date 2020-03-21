package com.chinasoft.app.service.impl;

import java.util.List;







import com.chinasoft.app.dao.ProductDao;
import com.chinasoft.app.domain.Products;
import com.chinasoft.app.service.ProductService;
import com.chinasoft.app.util.ProductPage;

public class ProductServiceImpl implements ProductService {
    private ProductDao productDao;
    
    //依赖注入
	public void setProductDao(ProductDao productDao) {
		System.out.println("ProductDao");
		this.productDao = productDao;
	}

	@Override
	public void add(Products product) {
		// TODO Auto-generated method stub
		productDao.add(product);
		
	}

	@Override
	public void update(Products product) {
		// TODO Auto-generated method stub
		productDao.update(product);
	}

	@Override
	public void delete(int product_id) {
		// TODO Auto-generated method stub
		productDao.delete(product_id);
		
	}

	@Override
	//查找所有商品
	public ProductPage findAll(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		ProductPage productPage=new ProductPage();
		productPage.setCurrentPage(currentPage);
		productPage.setPageSize(pageSize);
		productPage.setProductList(productDao.findAll(currentPage, pageSize));
		int totalCount=productDao.findTotalCount();
		productPage.setTotalCount(totalCount);
		productPage.setTotalPage(totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1);
		System.out.println(productPage.getProductList().size());
		return productPage;
	}

	@Override
	//按照商品ID查找商品
	public Products findProductById(int product_id) {
		// TODO Auto-generated method stub
		return productDao.findProductById(product_id);
	}

	@Override
	//按照商品名称查找所有商品
	public ProductPage findProductByName(String productName,int currentPage,int pageSize) {
		// TODO Auto-generated method stub
		ProductPage productPage=new ProductPage();
		productPage.setCurrentPage(currentPage);
		productPage.setPageSize(pageSize);
		productPage.setProductList(productDao.findProductByName(productName, currentPage, pageSize));
		int totalCount=productDao.findProductNum(productName);
		productPage.setTotalCount(totalCount);
		productPage.setTotalPage(totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1);
		System.out.println(productPage.getProductList().size());
		return productPage;
	}

	@Override
	public ProductPage search(String str, int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		ProductPage productPage=new ProductPage();
		productPage.setCurrentPage(currentPage);
		productPage.setPageSize(pageSize);
		productPage.setProductList(productDao.search(str, currentPage, pageSize));
		int totalCount=productDao.searchNum(str);
		productPage.setTotalCount(totalCount);
		productPage.setTotalPage(totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1);
		System.out.println(productPage.getProductList().size());
		return productPage;
	}
   
}
