package com.chinasoft.dao;

import java.util.List;

import com.chinasoft.domain.Book;
/**
 * 数据层
 * @author Administrator
 *
 */
public interface BookDao {
	//增加
	public void add(Book book);
	//修改
	public void update(Book book);
	//删除
	public void delete(Book book);
	//查询全部
	public List<Book> findAll(int currentPage,int pageSize);
	//根据id去查询图书
	public Book findBookById(int bid);
	public int findTotalCount();
	

}
