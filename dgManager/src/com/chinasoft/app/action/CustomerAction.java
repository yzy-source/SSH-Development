package com.chinasoft.app.action;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.app.domain.Customer;
import com.chinasoft.app.domain.Messagebox;
import com.chinasoft.app.domain.Orderinfo;
import com.chinasoft.app.domain.Products;
import com.chinasoft.app.service.CustomerService;
import com.chinasoft.app.service.MessageService;
import com.chinasoft.app.service.OrderinfoService;
import com.chinasoft.app.vo.CustomerPage;
import com.chinasoft.app.vo.NotVipPage;
import com.chinasoft.app.vo.UidPage;
import com.chinasoft.app.vo.VipPage;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
	private Customer customer=new Customer();
	private CustomerService customerservice;
    private OrderinfoService orderinfoservice;
    private Integer orderid;
    
	
	public Integer getOrderid() {
		return orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public void setOrderinfoservice(OrderinfoService orderinfoservice) {
		this.orderinfoservice = orderinfoservice;
	}
	int currentpage=1;
	int pagesize=3;
	int vcurrentpage=1;
	int vpagesize=4;
	int nvcurrentpage=1;
	int nvpagesize=5;

	public int getVcurrentpage() {
		return vcurrentpage;
	}

	public void setVcurrentpage(int vcurrentpage) {
		this.vcurrentpage = vcurrentpage;
	}

	public int getVpagesize() {
		return vpagesize;
	}

	public void setVpagesize(int vpagesize) {
		this.vpagesize = vpagesize;
	}

	public int getNvcurrentpage() {
		return nvcurrentpage;
	}

	public void setNvcurrentpage(int nvcurrentpage) {
		this.nvcurrentpage = nvcurrentpage;
	}

	public int getNvpagesize() {
		return nvpagesize;
	}

	public void setNvpagesize(int nvpagesize) {
		this.nvpagesize = nvpagesize;
	}

	public void setCustomerservice(CustomerService customerservice) {
		this.customerservice = customerservice;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String add(){
		customerservice.add(customer);
		return "add_success";
	}
	public String addcustomer(){
		return "addcustomer";
	}
	
	public String delete(){
		customerservice.delele(customer.getUid());
		return "delete_success";
	}
	public String vipdelete(){
		customerservice.vipdelele(customer.getUid());
		return "vip_delete_success";
	}
	public String notvipdelete(){
		customerservice.notvipdelele(customer.getUid());
		return "notvip_delete_success";
	}
	public String update(){
		customerservice.update(customer);
		return "update_success";
	}
	public String vipsearch(){
		VipPage vipcustomer=customerservice.vipSearch(vcurrentpage, vpagesize);
		ServletActionContext.getRequest().setAttribute("vipcustomer", vipcustomer);
		return "vip_search";
	}
	public String notvipsearch(){
		NotVipPage notvip=customerservice.notVipSearch(nvcurrentpage, nvpagesize);
		ServletActionContext.getRequest().setAttribute("notvip",notvip);
		return "not_vip_search";
	}
	public String search(){
		CustomerPage customerpage=customerservice.search(currentpage, pagesize);
		ServletActionContext.getRequest().setAttribute("customerpage", customerpage);
		return "search_success";
	}
	public String findcustomer(){
		Customer findcustomer=customerservice.findcustomer(customer.getUid());
		ServletActionContext.getRequest().setAttribute("customer", findcustomer);
		return "findcustomer";
	}
	public String orderView(){
		if (customer.getUid()==null) {
			customer=(Customer)ServletActionContext.getRequest().getAttribute("customer");
			Integer uid=Integer.valueOf(customer.getUid());
			Customer mycustomer=customerservice.findcustomer(uid);
			ServletActionContext.getRequest().setAttribute("customer", mycustomer);
		} else {
			Customer mycustomer=customerservice.findcustomer(customer.getUid());			
			ServletActionContext.getRequest().setAttribute("customer", mycustomer);
		}
		return "showorder";
	}
	public String orderDelete(){
		ServletActionContext.getRequest().setAttribute("customer", orderinfoservice.findOrderById(orderid).getCustomer());
		orderinfoservice.delete(orderid);
		return "order_delete_success";
	}
	
	
   
	public int getCurrentpage() {
		return currentpage;
	}

	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	

}
