package com.chinasoft.app.vo;

import java.util.List;

import com.chinasoft.app.domain.Customer;

public class NotVipPage {
	private int nvpagesize; //ÿҳ��������¼
	private int nvcurrentpage; //��ǰҳ
	private int nvtotalpage; //��ҳ��
	private int nvtotalcount; //�ܼ�¼��
	private List<Customer> nvcustomerlist;
	public int getNvpagesize() {
		return nvpagesize;
	}
	public void setNvpagesize(int nvpagesize) {
		this.nvpagesize = nvpagesize;
	}
	public int getNvcurrentpage() {
		return nvcurrentpage;
	}
	public void setNvcurrentpage(int nvcurrentpage) {
		this.nvcurrentpage = nvcurrentpage;
	}
	public int getNvtotalpage() {
		return nvtotalpage;
	}
	public void setNvtotalpage(int nvtotalpage) {
		this.nvtotalpage = nvtotalpage;
	}
	public int getNvtotalcount() {
		return nvtotalcount;
	}
	public void setNvtotalcount(int nvtotalcount) {
		this.nvtotalcount = nvtotalcount;
	}
	public List<Customer> getNvcustomerlist() {
		return nvcustomerlist;
	}
	public void setNvcustomerlist(List<Customer> nvcustomerlist) {
		this.nvcustomerlist = nvcustomerlist;
	}
	

}
