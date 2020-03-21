package com.chinasoft.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.chinasoft.dao.BookDao;
import com.chinasoft.domain.Book;
import com.chinasoft.util.HibernateUtil;

public class BookDaoImpl implements BookDao{

	@Override
	public void add(Book book) {
		Session session = HibernateUtil.openSession();
		Transaction tran = session.beginTransaction();
		session.save(book);
		tran.commit();
		session.close();
	}

	@Override
	public void update(Book book) {
		Session session = HibernateUtil.openSession();
		Transaction tran = session.beginTransaction();
		session.update(book);
		tran.commit();
		session.close();
		
	}

	@Override
	public void delete(Book book) {
		Session session = HibernateUtil.openSession();
		Transaction tran = session.beginTransaction();
		session.delete(book);
		tran.commit();
		session.close();
		
	}

	@Override
	public List<Book> findAll(int currentPage,int pageSize) {
		Session session = HibernateUtil.openSession();
		Query query=session.createQuery("from Book");
		//设置起始记录
		query.setFirstResult((currentPage-1)*pageSize);
		query.setMaxResults(pageSize);
		List<Book> list = query.list();
		session.close();
		return list;
	}

	@Override
	public Book findBookById(int bid) {
		Session session = HibernateUtil.openSession();
		Book book=(Book) session.get(Book.class,bid);
		session.close();
		return book;
	}

	@Override
	public int findTotalCount() {
		Session session = HibernateUtil.openSession();
		Query query = session.createQuery("select count(*) from Book");
		int count = Integer.parseInt(query.uniqueResult().toString());
		return count;
	}

}
