package com.chinasoft.app.dao;

import java.util.List;

import com.chinasoft.app.domain.Admin;

public interface AdminDao {
	//����Աע��
	public void adminRegister(Admin admin);
	//����Ա��¼
	public List<Admin> adminLogin(Admin admin);

}
