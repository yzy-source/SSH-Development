package com.chinasoft.app.domain;

import java.util.List;

//import com.chinasoft.app.domain.Products;

public class StorePage {
	private int pageSize;
	private int currentPage;
	private  int totalCount;
	private int totalPage;
	private List<Store> dataList;
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
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<Store> getDataList() {
		return dataList;
	}
	public void setDataList(List<Store> dataList) {
		this.dataList = dataList;
	}
}
