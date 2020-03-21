package com.chinasoft.app.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.app.dao.StoreDao;
import com.chinasoft.app.domain.Products;
//import com.chinasoft.app.domain.Products;
import com.chinasoft.app.domain.Recordlist;
import com.chinasoft.app.domain.Store;


public class StoreDaoImpl extends HibernateDaoSupport implements StoreDao{
	
	@Override
	public List<Store> findbyname(final String productName,final int currentPage, final int pageSize) {
		// TODO Auto-generated method stub
		List list = this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session arg0) throws HibernateException,SQLException {
				Query query1=arg0.createQuery("from Products where product_name=?");
				query1.setString(0, productName);
				List<Products> list1=query1.list();
				Products product=list1.get(0);
				Integer a=product.getProductId();
				String s=a.toString(a);
				Query query=arg0.createQuery("from Store where product_id=?");
				query.setString(0, s);
				query.setFirstResult((currentPage-1)*pageSize);
				query.setMaxResults(pageSize);
				List<Store> list = query.list();
				return list;
			}
		});
		return list;
	}

	@Override
	public List<Store> findall(final int currentPage, final int pageSize) {
		// TODO Auto-generated method stub
		List list = this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,SQLException {
				Query query  = session.createQuery("from Store");
				query.setFirstResult((currentPage-1)*pageSize);
				query.setMaxResults(pageSize);
				List<Store> list = query.list();
				return list;
			}
		});
		return list;
	}


	@Override
	public void add(Recordlist recordlist) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(recordlist);
	}

	@Override
	public int findTotalCount() {
		// TODO Auto-generated method stub
		Long count  = (Long) this.getHibernateTemplate().find("select count(*) from Store").listIterator().next();
		return count.intValue();
	}

	@Override
	public void updatein(int number,int productId,int wId) {
		// TODO Auto-generated method stub
		Store store1=(Store)this.getHibernateTemplate().find("from Store where product_id=? and w_id=?",productId,wId).get(0);
		int n1=store1.getStoreNum();
		int id=store1.getStoreId();
		Store store=this.getHibernateTemplate().get(Store.class,id);
		
		store.setStoreNum(number+n1);
		Products product=store.getProducts();
		product.setProductId(productId);
		store.setProducts(product);
		this.getHibernateTemplate().update(store);
	}
	@Override
	public void updateout(int number,int productId,int wId) {
		// TODO Auto-generated method stub
		Store store1=(Store)this.getHibernateTemplate().find("from Store where product_id=? and w_id=?",productId,wId).get(0);
		int n1=store1.getStoreNum();
		int id=store1.getStoreId();
		Store store=this.getHibernateTemplate().get(Store.class, id);
		
		store.setStoreNum(n1-number);
		Products product=store.getProducts();
		product.setProductId(productId);
		store.setProducts(product);
		this.getHibernateTemplate().update(store);
	}

	@Override
	public int findSearchTotalCount(final String  productName) {
		// TODO Auto-generated method stub
		 String s1;
		 final List list = this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session arg0) throws HibernateException,SQLException {
				Query query1=arg0.createQuery("from Products where product_name=?");
				query1.setString(0, productName);
				List list=query1.list();
				return list;
			}
		});
		 Products pro=(Products) list.get(0);
		 int s=pro.getProductId();
		 
		Long count  = (long) this.getHibernateTemplate().find("select count(*) from Store where product_id = ?",s).listIterator().next();
		return count.intValue();
	}

}
