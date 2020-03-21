package com.chinasoft.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.chinasoft.domain.Book;
import com.chinasoft.service.BookService;
import com.chinasoft.service.impl.BookServiceImpl;
import com.chinasoft.util.HibernateUtil;
import com.chinasoft.vo.BookPage;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BookAction extends ActionSupport implements ModelDriven<Book>{
	private int currentPage=1;
	private int pageSize=5;
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	private Book book = new Book();
	private BookService bookService = new BookServiceImpl();
	public String add(){
		return null;
	}
	public String update(){
		bookService.update(book);
		return "book_search";
	}
	public String findById(){
		Book book1 = bookService.findBookById(book.getBid());
		ServletActionContext.getRequest().setAttribute("book", book1);
		return "findById";
	}
	public String delete(){
		//bookService
		Book book2 = bookService.findBookById(book.getBid());
		bookService.delete(book2);
		return "book_search";
	}
	public String search(){
		
		BookPage bookPage = bookService.findAll(currentPage, pageSize);
		ServletActionContext.getRequest().setAttribute("bookPage", bookPage);
		return SUCCESS;
		
	}
	@Override
	public Book getModel() {
		// TODO Auto-generated method stub
		return book;
	}

}
