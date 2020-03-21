package com.chinasoft.app.vo;

import java.util.List;

import com.chinasoft.app.domain.Customer;

public class CustomerPage {
	private int pagesize; //每页多少条记录
	private int currentpage; //当前页
	private int totalpage; //总页数
	private int totalcount; //总记录数
	private List<Customer> customerlist;
	
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getCurrentpage() {
		return currentpage;
	}
	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}
	public int getTotalpage() {
		return totalpage;
	}
	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
	public int getTotalcount() {
		return totalcount;
	}
	public void setTotalcount(int totalcount) {
		this.totalcount = totalcount;
	}
	public List<Customer> getCustomerlist() {
		return customerlist;
	}
	public void setCustomerlist(List<Customer> customerlist) {
		this.customerlist = customerlist;
	}
	

}
