package com.chinasoft.app.dao;

import java.util.List;

import com.chinasoft.app.domain.Customer;

public interface UserDao {
	//�û�ע��
	public void userRegister(Customer customer);
	//�û���¼
	public List<Customer> userLogin(Customer user);

}
