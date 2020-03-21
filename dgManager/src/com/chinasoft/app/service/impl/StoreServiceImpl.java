package com.chinasoft.app.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.app.dao.StoreDao;
import com.chinasoft.app.domain.SearchPage;
import com.chinasoft.app.domain.StorePage;
//import com.chinasoft.app.domain.Products;
import com.chinasoft.app.domain.Recordlist;
import com.chinasoft.app.domain.Store;
import com.chinasoft.app.service.StoreService;
@Transactional
public class StoreServiceImpl implements StoreService{
	private StoreDao storeDao;
	@Override
	public SearchPage findbyname(String productName,int currentPage, int pageSize){
		SearchPage searchPage=new SearchPage();
		List<Store> list=storeDao.findbyname(productName, currentPage, pageSize);
		searchPage.setDataList(list);
		System.out.println(list.size());
		searchPage.setCurrentPage(currentPage);
		searchPage.setPageSize(pageSize);
		int totalCount=storeDao.findSearchTotalCount(productName);
		searchPage.setTotalCount(totalCount);
		searchPage.setTotalPage(totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1);
		return searchPage;
	}

	public void setStoreDao(StoreDao storeDao) {
		this.storeDao = storeDao;
	}

	@Override
	public StorePage findall(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		StorePage storePage=new StorePage();
		List<Store> list=storeDao.findall(currentPage, pageSize);
		storePage.setDataList(list);
		storePage.setCurrentPage(currentPage);
		storePage.setPageSize(pageSize);
		int totalCount=storeDao.findTotalCount();
		
		storePage.setTotalCount(totalCount);
		storePage.setTotalPage(totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1);
		return storePage;
	}

	@Override
	public void updatein(int number,int productId,int wId) {
		// TODO Auto-generated method stub
		storeDao.updatein(number,productId,wId);
	}
	@Override
	public void updateout(int number,int productId,int wId) {
		// TODO Auto-generated method stub
		storeDao.updateout(number,productId,wId);
	}
	@Override
	public void add(Recordlist recordlist) {
		// TODO Auto-generated method stub
		storeDao.add(recordlist);
	}

}
