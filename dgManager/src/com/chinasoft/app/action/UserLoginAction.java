package com.chinasoft.app.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.chinasoft.app.domain.Customer;
import com.chinasoft.app.service.CustomerService;
import com.chinasoft.app.service.UserService;
import com.chinasoft.app.util.HibernateUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserLoginAction extends ActionSupport implements ModelDriven<Customer>{
	private Customer customer=new Customer();
   //使用spring set方法
	private UserService userservice;

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}
	//注意必须返回String 并且不带参数
	public String userLogin(){	
		
		List<Customer> list = userservice.userLogin(customer);
		//查询到用户匹配
		if(!list.isEmpty())
		{
			HttpServletRequest request=ServletActionContext.getRequest();
			HttpSession session=request.getSession();
			session.setAttribute("uid", list.get(0).getUid());
			session.setAttribute("username", list.get(0).getUsername());
			return SUCCESS;
		}
		else
		{
			this.addActionError("用户名和密码不一致，请重新输入");
			return "fail";
		}
	}
	public String userRegister(){
		return "user_register";
	}
	public String registerUser(){
		userservice.userRegister(customer);
		return "user_register_success";
	}
	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}

}
