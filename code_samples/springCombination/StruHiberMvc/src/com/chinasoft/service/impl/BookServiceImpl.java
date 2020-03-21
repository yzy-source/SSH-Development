package com.chinasoft.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.dao.BookDao;
import com.chinasoft.dao.impl.BookDaoImpl;
import com.chinasoft.domain.Book;
import com.chinasoft.service.BookService;
import com.chinasoft.vo.BookPage;
@Transactional
public class BookServiceImpl implements BookService{
	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public void add(Book book) {
		bookDao.add(book);
		
	}

	@Override
	public void update(Book book) {
		bookDao.update(book);
		
	}

	@Override
	public void delete(int bid) {
		bookDao.delete(bid);
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
