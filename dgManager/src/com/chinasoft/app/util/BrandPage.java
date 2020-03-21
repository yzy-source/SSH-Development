package com.chinasoft.app.util;

import java.util.List;

import com.chinasoft.app.domain.Brand;

public class BrandPage {
	   private int pageSize;
	   private int currentPage;
	   private int totalPage;//(totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1)
	   private int totalCount;
	   private List<Brand> brandList;
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
	public List<Brand> getBrandList() {
		return brandList;
	}
	public void setBrandList(List<Brand> brandList) {
		this.brandList = brandList;
	}
	   
}
