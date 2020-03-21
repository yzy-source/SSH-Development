package com.chinasoft.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.dao.BookDao;
import com.chinasoft.domain.Book;
import com.chinasoft.util.HibernateUtil;

public class BookDaoImpl extends HibernateDaoSupport implements BookDao{

	@Override
	public void add(Book book) {
		this.getHibernateTemplate().save(book);
	}

	@Override
	public void update(Book book) {
		this.getHibernateTemplate().update(book);
	}

	@Override
	public void delete(int  bid) {
		this.getHibernateTemplate().delete(this.findBookById(bid));
	}

	@Override
	public List<Book> findAll(final int currentPage,final int pageSize) {
		List list = this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException,SQLException {
				Query query  = session.createQuery("from Book");
				query.setFirstResult(currentPage);
				query.setMaxResults(pageSize);
				List<Book> list = query.list();
				return list;
			}
		});
		return list;
	}

	@Override
	public Book findBookById(int bid) {
		return this.getHibernateTemplate().get(Book.class, bid);
	}

	@Override
	public int findTotalCount() {
		Long count  = (Long) this.getHibernateTemplate().find("select count(*) from Book").listIterator().next();
		return count.intValue();
	}

}
