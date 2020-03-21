package com.chinasoft.app.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.app.dao.UserDao;
import com.chinasoft.app.domain.Customer;
import com.chinasoft.app.util.HibernateUtil;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public void userRegister(Customer customer) {
		// 用户注册
		customer.setIsvip(false);
		customer.setCredit(0);
		customer.setDegree(0);
		this.getHibernateTemplate().save(customer);
		
	}
	@Override
	public List<Customer> userLogin(final Customer customer) {
		// 用户登录	
    	List<Customer> list=this.getHibernateTemplate().executeFind(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException,SQLException{
				Query query=session.createQuery("from Customer where username=? and password=?");
				query.setString(0, customer.getUsername());  //根据用户名和密码查询
				query.setString(1, customer.getPassword());
				List<Customer> list=query.list();
				return list;
			}	
		});
		return list;
	}


}
