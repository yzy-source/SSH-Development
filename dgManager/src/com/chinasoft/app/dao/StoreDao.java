package com.chinasoft.app.dao;

import java.util.List;

import com.chinasoft.app.domain.StorePage;
//import com.chinasoft.app.domain.Products;
import com.chinasoft.app.domain.Recordlist;
import com.chinasoft.app.domain.Store;

public interface StoreDao {
	public List<Store> findbyname(String product_name,int currentPage, int pageSize);
	public List<Store> findall(int currentPage, int pageSize);
	public void add(Recordlist recordlist);
	public int findTotalCount();
	public int findSearchTotalCount(final String  productName);
	public void updatein(int number,int productId,int wId);
	public void updateout(int number,int productId,int wId);
}
