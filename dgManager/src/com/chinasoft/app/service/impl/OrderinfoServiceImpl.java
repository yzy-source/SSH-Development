package com.chinasoft.app.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.app.dao.OrderDao;
import com.chinasoft.app.dao.impl.OrderDaoImpl;
import com.chinasoft.app.domain.Orderinfo;
import com.chinasoft.app.service.OrderinfoService;
import com.chinasoft.app.vo.OrderinfoPage;
@Transactional
public class OrderinfoServiceImpl implements OrderinfoService{
	public OrderDao orderDao;//=new OrderDaoImpl();


	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public void add(Orderinfo Orderinfo) {
		// TODO Auto-generated method stub
		orderDao.add(Orderinfo);
	}

	@Override
	public void update(Orderinfo Orderinfo) {
		// TODO Auto-generated method stub
		orderDao.update(Orderinfo);
	}

	@Override
	public void delete(int oid) {
		// TODO Auto-generated method stub
		orderDao.delete(oid);
	}

	@Override
	public OrderinfoPage findAll(int currentPage, int pageSize) {
		// TODO Auto-generated method stub;
		OrderinfoPage orderPage=new OrderinfoPage();
		List<Orderinfo>list = orderDao.findAll(currentPage, pageSize);
		orderPage.setDataList(list);
		orderPage.setCurrentPage(currentPage);
		orderPage.setPageSize(pageSize);
		int totalCount=orderDao.findTotalCount();
		orderPage.setTotalCount(totalCount);
		orderPage.setTotalPage(totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1);
		return orderPage;
	}

	@Override
	public Orderinfo findOrderById(int oid) {
		// TODO Auto-generated method stub
		return orderDao.findOrderById(oid);
	}

	@Override
	public OrderinfoPage findAllByUid(int currentPage, int pageSize,int uid) {
		// TODO Auto-generated method stub
		OrderinfoPage orderPage=new OrderinfoPage();
		List<Orderinfo>list = orderDao.findAllByUid(currentPage, pageSize,uid);
		orderPage.setDataList(list);
		orderPage.setCurrentPage(currentPage);
		orderPage.setPageSize(pageSize);
		int totalCount=orderDao.findTotalCountByUid(uid);
		orderPage.setTotalCount(totalCount);
		orderPage.setTotalPage(totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1);
		return orderPage;
	}

	@Override
	public OrderinfoPage findAllByTime(int currentPage, int pageSize,
			Date orderTime) {
		// TODO Auto-generated method stub
		System.out.println("service²ãÖÐfindAllByTimeº¯ÊýÖ´ÐÐ");
		OrderinfoPage orderPage=new OrderinfoPage();
		List<Orderinfo>list = orderDao.findAllByTime(currentPage, pageSize,orderTime);
		orderPage.setDataList(list);
		orderPage.setCurrentPage(currentPage);
		orderPage.setPageSize(pageSize);
		int totalCount=orderDao.findTotalCountByTime(orderTime);
		orderPage.setTotalCount(totalCount);
		orderPage.setTotalPage(totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1);
		return orderPage;
	}

	
}
