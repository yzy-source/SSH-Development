package com.chinasoft.app.service;

import java.util.List;

import com.chinasoft.app.domain.Customer;

public interface UserService {
	public void userRegister(Customer user);
	public List<Customer> userLogin(Customer customer);
}
