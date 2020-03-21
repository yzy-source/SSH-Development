package com.chinasoft.app.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.app.dao.CustomerDao;
import com.chinasoft.app.domain.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao{

	@Override
	public void add(Customer customer) {
		
		this.getHibernateTemplate().save(customer);
		
	}

	@Override
	public void delele(int uid) {
		
		this.getHibernateTemplate().delete(this.findcustomer(uid));
		
	}

	@Override
	public void update(Customer customer) {
		
		this.getHibernateTemplate().update(customer);
	}

	@Override
	public List<Customer> search(final int currentpage, final int pagesize) {
		//显示所有customer的信息
		List<Customer> list=this.getHibernateTemplate().executeFind(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException,SQLException{
				Query query=session.createQuery("from Customer");
				query.setFirstResult((currentpage-1)*pagesize);
				query.setMaxResults(pagesize);
				List<Customer> list=query.list();
				return list;
			}
		});
		return list;
	}

	@Override
	public Customer findcustomer(int uid) {
		//根据uid查找customer
		return this.getHibernateTemplate().get(Customer.class, uid);
	}

	@Override
	public int findtotalcount() {
		Long totalcount=(Long) this.getHibernateTemplate().find("select count(*) from Customer").listIterator().next();
		return totalcount.intValue();
	}

	@Override
	public List<Customer> vipSearch(final int currentpage, final int pagesize) {
		//显示所有Vip信息
		List<Customer> list=this.getHibernateTemplate().executeFind(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException,SQLException{
				String hql="from Customer c where c.isvip<>0";
				Query query=session.createQuery(hql);
				query.setFirstResult((currentpage-1)*pagesize);
				query.setMaxResults(pagesize);
				List<Customer> list=query.list();
				return list;
			}
		});
		return list;
	}

	@Override
	public List<Customer> notVipSearch(final int currentpage, final int pagesize) {
		// 显示所有非会员信息
		List<Customer> list=this.getHibernateTemplate().executeFind(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException,SQLException{
				Query query=session.createQuery("from Customer c where c.isvip<>1");
				query.setFirstResult((currentpage-1)*pagesize);
				query.setMaxResults(pagesize);
				List<Customer> list=query.list();
				return list;
			}
		});
		return list;
	}


	@Override
	public void vipdelele(int uid) {
		this.getHibernateTemplate().delete(this.findcustomer(uid));
		
	}

	


	@Override
	public void notvipdelele(int uid) {
		this.getHibernateTemplate().delete(this.findcustomer(uid));
		
	}

	@Override
	public int findViptotalcount() {
		Long totalcount=(Long) this.getHibernateTemplate().find("select count(*) from Customer c where c.isvip<>0").listIterator().next();
		return totalcount.intValue();
	}

	@Override
	public int findNViptotalcount() {
		Long totalcount=(Long) this.getHibernateTemplate().find("select count(*) from Customer c where c.isvip<>1").listIterator().next();
		return totalcount.intValue();
	}
}
