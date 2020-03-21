package com.chinasoft.app.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import com.chinasoft.app.dao.BrandDao;
import com.chinasoft.app.domain.Brand;
import com.chinasoft.app.domain.Products;

@Component("transactionManager")
public class BrandDaoImpl extends HibernateDaoSupport implements BrandDao{

	@Override
	public void add(Brand brand) {
		// TODO Auto-generated method stub
	    this.getHibernateTemplate().save(brand);
	}

	@Override
	public void update(Brand brand) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(brand);
	}

	@Override
	public void delete(String bname) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.findBrandById(bname));
		
	}

	@Override
	public List<Brand> findAll(final int currentPage, final int pageSize) {
		// TODO Auto-generated method stub
		System.out.println("brandFindAll");
		List list = this.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					@Override
					public Object doInHibernate(org.hibernate.Session arg0)
							throws HibernateException, SQLException {
						// TODO Auto-generated method stub
						System.out.println("brand");
						Query query = arg0.createQuery("from Brand");
						query.setFirstResult((currentPage - 1) * pageSize);
						query.setMaxResults(pageSize);
						List<Brand> list = query.list();
						return list;
					}
				});
	     return list;
	}

	@Override
	public Brand findBrandById(String bname) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Brand.class, bname);
	}

	@Override
	public int findTotalCount() {
		// TODO Auto-generated method stub
		Long count=(Long)this.getHibernateTemplate().find("select count(*) from Brand").listIterator().next();
		return count.intValue();
	}

	@Override
	public List<Brand> findBrandByCountry(final String country, final int currentPage,
			final int pageSize) {
		// TODO Auto-generated method stub
		List list = this.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					@Override
					public Object doInHibernate(org.hibernate.Session arg0)
							throws HibernateException, SQLException {
						// TODO Auto-generated method stub
						Query query = arg0.createQuery("from Brand where country=?");
						query.setString(0, country);
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
	public int findBrandNum(String country) {
		// TODO Auto-generated method stub
		Long count=(Long)this.getHibernateTemplate().find("select count(*) from Brand where country=?",country).listIterator().next();
		return count.intValue();
	}

}
