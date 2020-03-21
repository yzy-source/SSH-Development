package com.chinasoft.app.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.app.dao.RecordDao;
import com.chinasoft.app.domain.Recordlist;
import com.chinasoft.app.domain.Store;


public class RecordDaoImpl extends HibernateDaoSupport implements RecordDao{

	@Override
	public List<Recordlist> findall(final int currentPage, final int pageSize) {
		// TODO Auto-generated method stub
		List list = this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,SQLException {
				Query query  = session.createQuery("from Recordlist");
				query.setFirstResult((currentPage-1)*pageSize);
				query.setMaxResults(pageSize);
				List<Store> list = query.list();
				return list;
			}
		});
		return list;
	}

	@Override
	public int findTotalCount() {
		// TODO Auto-generated method stub
		Long count  = (Long) this.getHibernateTemplate().find("select count(*) from Recordlist").listIterator().next();
		return count.intValue();
	}

}
