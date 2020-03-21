package com.chinasoft.app.dao;

import java.util.List;

import com.chinasoft.app.domain.Customer;

public interface UserDao {
	//用户注册
	public void userRegister(Customer customer);
	//用户登录
	public List<Customer> userLogin(Customer user);

}
