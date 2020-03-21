package com.chinasoft.app.dao.impl;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.app.dao.OrderDao;
import com.chinasoft.app.domain.Orderinfo;

public class OrderDaoImpl extends HibernateDaoSupport implements  OrderDao{

	@Override
	public void add(Orderinfo Orderinfo) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(Orderinfo);
	}

	@Override
	public void update(Orderinfo Orderinfo) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(Orderinfo);
	}

	@Override
	public void delete(int oid) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.findOrderById(oid));
	}

	@Override
	public List<Orderinfo> findAll(final int currentPage, final int pageSize) {
		// TODO Auto-generated method stub
		 List list=this.getHibernateTemplate().executeFind(new HibernateCallback(){
				public Object doInHibernate(Session session)throws HibernateException,SQLException{
					Query query=session.createQuery("from Orderinfo");
					query.setFirstResult((currentPage-1)*pageSize);//第一页从0-4，第二页从5-9表示的是从查询记录的地几个开始，而不是从第几页开始
					query.setMaxResults(pageSize);
					List<Orderinfo>list=query.list();
					System.out.println(list.size());
					return list;
				}
			});
				//search不需要transaction函数
				//设置起始记录
			return list;
	}

	@Override
	public Orderinfo findOrderById(int oid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Orderinfo.class,oid);
	}

	@Override
	public int findTotalCount() {
		// TODO Auto-generated method stub
		Long count=(Long) this.getHibernateTemplate().find("select count(*)from Orderinfo").listIterator().next();
		return count.intValue();
	}

	@Override
	public List<Orderinfo> findAllByUid(int currentPage, int pageSize, int uid) {
		// TODO Auto-generated method stub
		List<Orderinfo>list =this.getHibernateTemplate().find("from Orderinfo where customer.uid=?",uid);
		return list;
	}

	@Override
	public int findTotalCountByUid(int uid) {
		// TODO Auto-generated method stub
		Long count=(Long) this.getHibernateTemplate().find("select count(*)from Orderinfo where customer.uid=?",uid).listIterator().next();
		return count.intValue();
	}

	@Override
	public List<Orderinfo> findAllByTime(int currentPage, int pageSize,
			Date orderTime) {
		// TODO Auto-generated method stub
		System.out.println("dao层中findAllByTime函数被执行");
		List<Orderinfo>list=this.getHibernateTemplate().find("from Orderinfo where orderTime =?",orderTime);
		return list;
	}

	@Override
	public int findTotalCountByTime(Date orderTime) {
		// TODO Auto-generated method stub
		System.out.println("dao层中findTotalCountByTime函数被执行");
		Long count=(Long) this.getHibernateTemplate().find("select count(*)from Orderinfo where orderTime=?",orderTime).listIterator().next();
		return count.intValue();
	}

}
