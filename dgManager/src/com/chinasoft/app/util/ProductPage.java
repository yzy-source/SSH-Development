package com.chinasoft.app.util;

import java.util.List;

import com.chinasoft.app.domain.Products;

public class ProductPage {
	 private int pageSize;
	   private int currentPage;
	   private int totalPage;//(totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1)
	   private int totalCount;
	   private List<Products> productList;
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<Products> getProductList() {
		return productList;
	}
	public void setProductList(List<Products> productList) {
		this.productList = productList;
	}
	
}
