package com.chinasoft.app.dao;

import java.util.Date;
import java.util.List;

import com.chinasoft.app.domain.Orderinfo;

public interface OrderDao {
	public void add(Orderinfo Orderinfo);
	public void update(Orderinfo Orderinfo);
	public void delete(int oid);
	public List<Orderinfo> findAll(int currentPage,int pageSize);
	public Orderinfo findOrderById(int oid);
	public int findTotalCount();
	public List<Orderinfo> findAllByUid(int currentPage, int pageSize,int uid);
	public int findTotalCountByUid(int uid);
	public List<Orderinfo> findAllByTime(int currentPage, int pageSize,
			Date orderTime);
	public int findTotalCountByTime(Date orderTime);
}
