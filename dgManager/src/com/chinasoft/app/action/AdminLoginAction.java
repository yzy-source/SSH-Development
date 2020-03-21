package com.chinasoft.app.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.app.domain.Admin;
import com.chinasoft.app.domain.Customer;
import com.chinasoft.app.service.AdminService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminLoginAction extends ActionSupport implements ModelDriven<Admin>{
	private Admin admin=new Admin();
	private AdminService adminservice;
	

	public void setAdminservice(AdminService adminservice) {
		this.adminservice = adminservice;
	}
	//管理员注册
	public String adminRegister(){
		return "admin_register";
	}
	public String registerAdmin(){
		adminservice.adminRegister(admin);
		return "admin_register_success";
	}
	//管理员登录
	public String adminLogin(){
		List<Admin> list=adminservice.adminLogin(admin);
		if(!list.isEmpty())
		{
			HttpSession session=ServletActionContext.getRequest().getSession();
			session.setAttribute("adminName", list.get(0).getAdminName());
			session.setAttribute("adminID",list.get(0).getAdminId());
			return SUCCESS;
		}
		else
		{
			this.addActionError("管理员用户名和密码不一致，请重新输入");
			return "fail";
		}
	}
	@Override
	public Admin getModel() {
		// TODO Auto-generated method stub
		return admin;
	}

}
