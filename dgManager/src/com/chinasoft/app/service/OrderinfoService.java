package com.chinasoft.app.service;

import java.util.Date;

import com.chinasoft.app.domain.Orderinfo;
import com.chinasoft.app.vo.OrderinfoPage;

public interface OrderinfoService {
	public void add(Orderinfo Orderinfo);
	public void update(Orderinfo Orderinfo);
	public void delete(int oid);
	public OrderinfoPage findAll(int currentPage,int pageSize);
	public Orderinfo findOrderById(int oid);
	public com.chinasoft.app.vo.OrderinfoPage findAllByUid(int currentPage,
			int pageSize,int uid);
	public OrderinfoPage findAllByTime(int currentPage, int pageSize,
			Date orderTime);
}
