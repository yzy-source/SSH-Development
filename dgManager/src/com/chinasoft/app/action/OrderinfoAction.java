package com.chinasoft.app.action;

import java.util.Iterator;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.app.domain.Customer;
import com.chinasoft.app.domain.Messagebox;
import com.chinasoft.app.domain.Orderinfo;
import com.chinasoft.app.domain.Po;
import com.chinasoft.app.domain.Products;
import com.chinasoft.app.service.CustomerService;
import com.chinasoft.app.service.OrderinfoService;
import com.chinasoft.app.service.ProductService;
import com.chinasoft.app.service.impl.OrderinfoServiceImpl;
import com.chinasoft.app.vo.OrderinfoPage;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class OrderinfoAction extends ActionSupport implements
		ModelDriven<Orderinfo> {
	private int currentPage = 1;
	private int pageSize = 5;
	private CustomerService customerService;

    
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	private Orderinfo Orderinfo = new Orderinfo();
	private OrderinfoService orderinfoservice;// =new OrderinfoServiceImpl();
	private Po po = new Po();

	@Override
	public Orderinfo getModel() {
		// TODO Auto-generated method stub
		return Orderinfo;
	}

	public void setOrderinfoservice(OrderinfoService orderinfoservice) {
		this.orderinfoservice = orderinfoservice;
	}

	public String add() {
		System.out.println("add函数被执行");
		orderinfoservice.add(Orderinfo);
		Customer customer=customerService.findcustomer(Orderinfo.getCustomer().getUid());
		if(customer.isIsvip()==true){
			customer.setCredit(customer.getCredit()+Integer.parseInt(Orderinfo.getTotalMoney()));
			customerService.update(customer);
		}
		
		return "orderinfo_search";
	}

	public String update() {
		System.out.println("update函数被执行");
		orderinfoservice.update(Orderinfo);
		return "orderinfo_search";
	}

	public String findById() {
		Orderinfo orderinfo = orderinfoservice
				.findOrderById(Orderinfo.getOid());
		ServletActionContext.getRequest().setAttribute("Orderinfo", orderinfo);
		System.out.println("findById函数被执行...");
		return "findById";
	}

	public String delete() {
		System.out.println("delete函数被执行...");
		// Book book2 = bookService.findBookById(book.getBid());
		orderinfoservice.delete(Orderinfo.getOid());
		return "orderinfo_search";
	}

	public String search() {
		System.out.println("search函数被执行...");
		OrderinfoPage OrderinfoPage = orderinfoservice.findAll(currentPage,
				pageSize);
		System.out.println("OrderinfoService.findAll函数被执行...");
		ServletActionContext.getRequest().setAttribute("OrderinfoPage",
				OrderinfoPage);
		return SUCCESS;
	}

	public String SearchByUid() {
		System.out.println("SearchByUid函数被执行...");
		ServletActionContext.getRequest().setAttribute("orderinfo", Orderinfo);
		OrderinfoPage OrderinfoPage = orderinfoservice.findAllByUid(
				currentPage, pageSize, Orderinfo.getCustomer().getUid());
		ServletActionContext.getRequest().setAttribute("OrderinfoPage",
				OrderinfoPage);
		return SUCCESS;
	}

	public String SearchByTime() {
		System.out.println("SearchByTime函数执行");
		ServletActionContext.getRequest().setAttribute("orderinfo", Orderinfo);
		OrderinfoPage OrderinfoPage = orderinfoservice.findAllByTime(
				currentPage, pageSize, Orderinfo.getOrderTime());
		ServletActionContext.getRequest().setAttribute("OrderinfoPage",
				OrderinfoPage);
		return SUCCESS;
	}
}
