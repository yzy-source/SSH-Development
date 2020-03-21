package com.chinasoft.app.dao;

import java.util.List;

import com.chinasoft.app.domain.Customer;

public interface CustomerDao {
	//增加客户信息
	public void add(Customer customer);
	//删除客户信息
	public void delele(int uid);
	//修改客户信息
	public void update(Customer customer);
	//删除客户信息
	public void vipdelele(int uid);
	//删除客户信息
	public void notvipdelele(int uid);
	//查询所有顾客注册信息,并分页
	public List<Customer> search(int currentpage,int pagesize);
	//查询所有会员信息并，分页
	public List<Customer> vipSearch(int currentpage,int pagesize);
	//查询所有非会员信息，并分页
	public List<Customer> notVipSearch(int currentpage,int pagesize);
	//根据uid获得customer
	public Customer findcustomer(int uid);
	//查询所有顾客记录总数
	public int findtotalcount();
	public int findViptotalcount();
	public int findNViptotalcount();

}
