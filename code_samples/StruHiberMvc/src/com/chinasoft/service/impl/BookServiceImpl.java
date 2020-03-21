package com.chinasoft.service.impl;

import java.util.List;

import com.chinasoft.dao.BookDao;
import com.chinasoft.dao.impl.BookDaoImpl;
import com.chinasoft.domain.Book;
import com.chinasoft.service.BookService;
import com.chinasoft.vo.BookPage;

public class BookServiceImpl implements BookService{
	private BookDao bookDao = new BookDaoImpl();
	@Override
	public void add(Book book) {
		bookDao.add(book);
		
	}

	@Override
	public void update(Book book) {
		bookDao.update(book);
		
	}

	@Override
	public void delete(Book book) {
		bookDao.delete(book);
		
	}

	@Override
	public BookPage findAll(int currentPage,int pageSize) {
		BookPage bookPage = new BookPage();
		List<Book> list = bookDao.findAll(currentPage, pageSize);
		bookPage.setDataList(list);
		bookPage.setCurrentPage(currentPage);
		bookPage.setPageSize(pageSize);
		int totalCount = bookDao.findTotalCount();
		bookPage.setTotalCount(totalCount);
		bookPage.setTotalPage(totalCount % pageSize ==0?totalCount/pageSize:totalCount/pageSize+1);
		return bookPage;
	}

	@Override
	public Book findBookById(int bid) {
		return bookDao.findBookById(bid);
	}

}
