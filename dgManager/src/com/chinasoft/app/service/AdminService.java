package com.chinasoft.app.service;

import java.util.List;

import com.chinasoft.app.domain.Admin;

public interface AdminService {
	//����Աע��
	public void adminRegister(Admin admin);
	//����Ա��¼
	public List<Admin> adminLogin(Admin admin);

}
