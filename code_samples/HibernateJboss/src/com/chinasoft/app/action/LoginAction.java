package com.chinasoft.app.action;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.chinasoft.app.domain.User;
import com.chinasoft.app.util.HibernateUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User>{
	private User user=new User();
	public String execute(){
		Session session=HibernateUtil.openSession();
		Transaction tran=session.beginTransaction();
		Query query=session.createQuery("from User where username=? and password=?");
		query.setString(0, user.getUsername());
		query.setString(1, user.getPassword());
		List<User> list=query.list();
		tran.commit();
		session.close();
		if(!list.isEmpty()){
			return SUCCESS;
		}else{
			this.addActionError("用户名或密码错误");
			return "fail";
		}
		
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	

}
