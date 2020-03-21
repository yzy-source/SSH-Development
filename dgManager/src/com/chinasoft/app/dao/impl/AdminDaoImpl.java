package com.chinasoft.app.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.app.dao.AdminDao;
import com.chinasoft.app.domain.Admin;
import com.chinasoft.app.domain.Customer;

public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao{

	@Override
	public void adminRegister(Admin admin) {
		// ����Աע��
		this.getHibernateTemplate().save(admin);
	}

	@Override
	public List<Admin> adminLogin(final Admin admin) {
		// ����Ա��¼
		List<Admin> list=this.getHibernateTemplate().executeFind(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException,SQLException{
				Query query=session.createQuery("from Admin where adminName=? and adminPassword=?");
				query.setString(0,admin.getAdminName());  //�����û����������ѯ
				query.setString(1, admin.getAdminPassword());
				List<Admin> list=query.list();
				return list;
			}	
		});
		return list;
	}

}
