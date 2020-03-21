package com.chinasoft.app.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.app.dao.MessageDao;
import com.chinasoft.app.domain.Customer;
import com.chinasoft.app.domain.Messagebox;
import com.chinasoft.app.domain.Products;

public class MessageDaoImpl extends HibernateDaoSupport implements MessageDao{

	@Override
	public void MessAdd(Messagebox messagebox) {
		this.getHibernateTemplate().save(messagebox);
		
	}

	@Override
	public void MessDelete(int messid) {
		this.getHibernateTemplate().delete(this.findMessById(messid));
		
	}


	@Override
	public Messagebox findMessById(int messid) {
		return this.getHibernateTemplate().get(Messagebox.class, messid);
	}



	@Override
	public List<Messagebox> findMessByUid(final int uid, final int currentpage, final int pagesize) {
		List<Messagebox> list=this.getHibernateTemplate().executeFind(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException,SQLException{
				Query query=session.createQuery("from Messagebox  where uid=?");
				query.setInteger(0, uid);
				query.setFirstResult((currentpage-1)*pagesize);
				query.setMaxResults(pagesize);
				List<Messagebox> list=query.list();
				return list;
			}
		});
		return list;
	}



	@Override
	public int findtotalMessCountUid(int uid) {
		Long totalcount=(Long) this.getHibernateTemplate().find("select count(*) from Messagebox m where m.customer.uid=?",uid).listIterator().next();
		return totalcount.intValue();
	}



}
