package com.chinasoft.app.vo;

import java.util.List;

import com.chinasoft.app.domain.Orderinfo;

public class OrderinfoPage {
	private int pageSize;
	private int currentPage;
	private int totalCount;
	private int totalPage;
	private List<Orderinfo>dataList;
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
	public List<Orderinfo> getDataList() {
		return dataList;
	}
	public void setDataList(List<Orderinfo> dataList) {
		this.dataList = dataList;
	}

}
