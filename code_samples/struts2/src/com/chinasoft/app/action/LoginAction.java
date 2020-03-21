package com.chinasoft.app.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	public String add(){
		System.out.println("add方法被执行。。。");
		return "good";
	}

}
