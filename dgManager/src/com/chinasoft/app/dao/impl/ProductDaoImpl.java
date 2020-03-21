package com.chinasoft.app.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import com.chinasoft.app.dao.ProductDao;
import com.chinasoft.app.domain.Products;

@Component("transactionManager")
public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao{

	@Override
	public void add(Products product) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(product);
	}

	@Override
	public void update(Products product) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(product);
	}

	@Override
	public void delete(int product_id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.findProductById(product_id));
	}

	@Override
	public List<Products> findAll(final int currentPage, final int pageSize) {
		// TODO Auto-generated method stub
		List list = this.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					@Override
					public Object doInHibernate(org.hibernate.Session arg0)
							throws HibernateException, SQLException {
						// TODO Auto-generated method stub
						Query query = arg0.createQuery("from Products");
						query.setFirstResult((currentPage - 1) * pageSize);
						query.setMaxResults(pageSize);
						List<Products> list = query.list();
						return list;
					}
				});
		return list;
	}

	@Override
	public Products findProductById(int product_id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Products.class, product_id);
	}

	@Override
	public int findTotalCount() {
		// TODO Auto-generated method stub
		Long count=(Long)this.getHibernateTemplate().find("select count(*) from Products").listIterator().next();
		return count.intValue();
	}

	@Override
	public List<Products> findProductByName(final String productName,final int currentPage, final int pageSize) {
		// TODO Auto-generated method stub
		System.out.println(productName);
		List list = this.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					@Override
					public Object doInHibernate(org.hibernate.Session arg0)
							throws HibernateException, SQLException {
						// TODO Auto-generated method stub
						Query query = arg0.createQuery("from Products where productName=?");
						query.setString(0, productName);
						query.setFirstResult((currentPage - 1) * pageSize);
						query.setMaxResults(pageSize);
						List<Products> list = query.list();
						//System.out.println(list.size());
						return list;
					}
				});
		return list;
	}

	@Override
	public int findProductNum(String productName) {
		// TODO Auto-generated method stub
		Long count=(Long)this.getHibernateTemplate().find("select count(*) from Products where productName=?",productName).listIterator().next();
		return count.intValue();
	}

	@Override
	public List<Products> search(final String str,final int currentPage,final int pageSize) {
		// TODO Auto-generated method stub
		List list = this.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					@Override
					public Object doInHibernate(org.hibernate.Session arg0)
							throws HibernateException, SQLException {
						// TODO Auto-generated method stub
						Query query = arg0.createQuery("from Products where productName like ?");
						query.setString(0, '%'+str+'%');
						query.setFirstResult((currentPage - 1) * pageSize);
						query.setMaxResults(pageSize);
						List<Products> list = query.list();
						//System.out.println(list.size());
						return list;
					}
				});
		return list;
	}

	@Override
	public int searchNum(String str) {
		// TODO Auto-generated method stub
		Long count=(Long)this.getHibernateTemplate().find("select count(*) from Products where productName like ?",'%'+str+'%').listIterator().next();
		return count.intValue();
	}

}
