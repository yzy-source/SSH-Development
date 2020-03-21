package com.chinasoft.app.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.app.dao.AdminDao;
import com.chinasoft.app.domain.Admin;
import com.chinasoft.app.service.AdminService;
@Transactional
public class AdminServiceImpl implements AdminService{
	private AdminDao admindao;
	

	public void setAdmindao(AdminDao admindao) {
		this.admindao = admindao;
	}

	@Override
	public void adminRegister(Admin admin) {
		// 管理员注册
		admindao.adminRegister(admin);
	}

	@Override
	public List<Admin> adminLogin(Admin admin) {
		//管理员登录
		return admindao.adminLogin(admin);
	}

}
