package com.chinasoft.service;

import java.util.List;

import com.chinasoft.domain.Book;
import com.chinasoft.vo.BookPage;

/**
 * 业务逻辑
 * @author Administrator
 *
 */
public interface BookService {
	//增加
		public void add(Book book);
		//修改
		public void update(Book book);
		//删除
		public void delete(Book book);
		//查询全部
		public BookPage findAll(int currentPage,int pageSize);
		//根据id去查询图书
		public Book findBookById(int bid);


}
