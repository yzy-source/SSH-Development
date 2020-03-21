package com.chinasoft.app.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.chinasoft.app.domain.Book;
import com.chinasoft.app.domain.User;
import com.chinasoft.app.util.HibernateUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BookAction extends ActionSupport {
	public Book book =new Book();
	public String add(){
		return SUCCESS;
	}
	public String modify(){
		return SUCCESS;
	}
	public String delete(){
		return SUCCESS;
		
	}
	public String search(){
		Session session=HibernateUtil.openSession();
		Transaction tran=session.beginTransaction();
		Query query=session.createQuery("from Book");
		List<User> list=query.list();
		tran.commit();
		session.close();
		if(!list.isEmpty()){
			HttpServletRequest request=ServletActionContext.getRequest();
			request.setAttribute("list", list);
			return SUCCESS;
		}else{
			return "fail";
		}
	}

}
