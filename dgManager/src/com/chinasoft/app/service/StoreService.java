package com.chinasoft.app.service;


import java.util.List;

//import com.chinasoft.app.domain.Products;
import com.chinasoft.app.domain.Recordlist;
import com.chinasoft.app.domain.SearchPage;
import com.chinasoft.app.domain.Store;
import com.chinasoft.app.domain.StorePage;

public interface StoreService {
	public SearchPage findbyname(String product_name,int currentPage, int pageSize);
	public StorePage findall(int currentPage, int pageSize);

	public void updatein(int number,int productId,int wId);
	public void updateout(int number,int productId,int wId);
	public void add(Recordlist recordlist);
}
