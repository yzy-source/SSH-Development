package com.chinasoft.app.vo;

import java.util.List;

import com.chinasoft.app.domain.Customer;

public class VipPage {
	private int vpagesize; //ÿҳ��������¼
	private int vcurrentpage; //��ǰҳ
	private int vtotalpage; //��ҳ��
	private int vtotalcount; //�ܼ�¼��
	private List<Customer> vcustomerlist;
	public int getVpagesize() {
		return vpagesize;
	}
	public void setVpagesize(int vpagesize) {
		this.vpagesize = vpagesize;
	}
	public int getVcurrentpage() {
		return vcurrentpage;
	}
	public void setVcurrentpage(int vcurrentpage) {
		this.vcurrentpage = vcurrentpage;
	}
	public int getVtotalpage() {
		return vtotalpage;
	}
	public void setVtotalpage(int vtotalpage) {
		this.vtotalpage = vtotalpage;
	}
	public int getVtotalcount() {
		return vtotalcount;
	}
	public void setVtotalcount(int vtotalcount) {
		this.vtotalcount = vtotalcount;
	}
	public List<Customer> getVcustomerlist() {
		return vcustomerlist;
	}
	public void setVcustomerlist(List<Customer> vcustomerlist) {
		this.vcustomerlist = vcustomerlist;
	}
	
	

}
