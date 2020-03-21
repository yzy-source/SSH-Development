package com.chinasoft.app.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.app.dao.UserDao;
import com.chinasoft.app.domain.Customer;
import com.chinasoft.app.service.UserService;
@Transactional
public class UserServiceImpl implements UserService{
//	spring  set方法
	private UserDao userdao;
	

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	@Override
	public void userRegister(Customer customer) {
		// 注册用户
		userdao.userRegister(customer);
	}
//用户登录
	@Override
	public List<Customer> userLogin(Customer customer) {
		return userdao.userLogin(customer);
	}

}
