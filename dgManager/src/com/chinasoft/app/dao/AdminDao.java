package com.chinasoft.app.dao;

import java.util.List;

import com.chinasoft.app.domain.Admin;

public interface AdminDao {
	//管理员注册
	public void adminRegister(Admin admin);
	//管理员登录
	public List<Admin> adminLogin(Admin admin);

}
