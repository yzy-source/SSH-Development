package com.chinaost.app.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	public String add(){
		System.out.println("add方法被执行。。");
		return "ok";
	}
	public String execute(){
		System.err.println("默认方法被执行。。。");
		return SUCCESS;
	}

}
