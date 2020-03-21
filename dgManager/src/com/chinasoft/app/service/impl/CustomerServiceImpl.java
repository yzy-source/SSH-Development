package com.chinasoft.app.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.app.dao.CustomerDao;
import com.chinasoft.app.dao.impl.CustomerDaoImpl;
import com.chinasoft.app.domain.Customer;
import com.chinasoft.app.service.CustomerService;
import com.chinasoft.app.vo.CustomerPage;
import com.chinasoft.app.vo.NotVipPage;
import com.chinasoft.app.vo.VipPage;

@Transactional
public class CustomerServiceImpl implements CustomerService{
	private CustomerDao customerdao;
	

	public void setCustomerdao(CustomerDao customerdao) {
		this.customerdao = customerdao;
	}

	@Override
	public void add(Customer customer) {
		customerdao.add(customer);
		
	}

	@Override
	public void delele(int uid) {
		customerdao.delele(uid);
		
	}

	@Override
	public void update(Customer customer) {
		customerdao.update(customer);
	}

	@Override
	public CustomerPage search(int currentpage, int pagesize) {
		CustomerPage customerpage=new CustomerPage();
		List<Customer> customerlist=customerdao.search(currentpage, pagesize);
		customerpage.setCurrentpage(currentpage);
		customerpage.setPagesize(pagesize);
		customerpage.setCustomerlist(customerlist);
		int totalcount=customerdao.findtotalcount();
		customerpage.setTotalcount(totalcount);
		customerpage.setTotalpage(totalcount % pagesize==0?totalcount/pagesize:totalcount/pagesize+1);
		return customerpage;
	}

	@Override
	public VipPage vipSearch(int currentpage, int pagesize) {
		VipPage customerpage=new VipPage();
		List<Customer> customerlist=customerdao.vipSearch(currentpage, pagesize);
		customerpage.setVcurrentpage(currentpage);
		customerpage.setVpagesize(pagesize);
		customerpage.setVcustomerlist(customerlist);
		int totalcount=customerdao.findViptotalcount();
		customerpage.setVtotalcount(totalcount);
		customerpage.setVtotalpage(totalcount % pagesize==0?totalcount/pagesize:totalcount/pagesize+1);
		return customerpage;
	}

	@Override
	public NotVipPage notVipSearch(int currentpage, int pagesize) {
		NotVipPage customerpage=new NotVipPage();
		List<Customer> customerlist=customerdao.notVipSearch(currentpage, pagesize);
		customerpage.setNvcurrentpage(currentpage);
		customerpage.setNvpagesize(pagesize);
		customerpage.setNvcustomerlist(customerlist);
		int totalcount=customerdao.findNViptotalcount();
		customerpage.setNvtotalcount(totalcount);
		customerpage.setNvtotalpage(totalcount % pagesize==0?totalcount/pagesize:totalcount/pagesize+1);
		return customerpage;
	}

	@Override
	public Customer findcustomer(int uid) {
		Customer customer=customerdao.findcustomer(uid);
		return customer;
	}

	@Override
	public void vipdelele(int uid) {
		customerdao.vipdelele(uid);
		
	}


	@Override
	public void notvipdelele(int uid) {
		customerdao.notvipdelele(uid);
	}

}
