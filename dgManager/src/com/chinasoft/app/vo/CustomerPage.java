package com.chinasoft.app.vo;

import java.util.List;

import com.chinasoft.app.domain.Customer;

public class CustomerPage {
	private int pagesize; //ÿҳ��������¼
	private int currentpage; //��ǰҳ
	private int totalpage; //��ҳ��
	private int totalcount; //�ܼ�¼��
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
