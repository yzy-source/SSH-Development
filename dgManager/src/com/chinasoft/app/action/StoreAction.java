package com.chinasoft.app.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;




//import com.chinasoft.app.domain.Products;
import com.chinasoft.app.domain.SearchPage;
import com.chinasoft.app.domain.Store;
import com.chinasoft.app.domain.Recordlist;
import com.chinasoft.app.domain.StorePage;
import com.chinasoft.app.service.StoreService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StoreAction extends ActionSupport implements ModelDriven<Store>{

	private int currentPage=1;
	private int pageSize=5;
//	private Products products=new Products();
	private StoreService storeService;
	private Store store=new Store();
	
	
	
	
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
//	public Products getProducts() {
//		return products;
//	}
//	public void setProducts(Products products) {
//		this.products = products;
//	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
	public StoreService getStoreService() {
		return storeService;
	}
	public void setStoreService(StoreService storeService) {
		this.storeService = storeService;
	}
	public String showall()
	{
		
		StorePage storePage = storeService.findall(currentPage, pageSize);
		ServletActionContext.getRequest().setAttribute("storePage", storePage);
		System.out.println(storePage.getDataList().size());
		return SUCCESS;
	}
	public String find_product_byname()
	{

		SearchPage searchPage=storeService.findbyname(store.getProducts().getProductName(),currentPage, pageSize);
		
		System.out.println(searchPage.getDataList().size());
		if(searchPage.getDataList().size()!=0){
		
			ServletActionContext.getRequest().setAttribute("searchPage",searchPage);
		return "success";}
		else
		{
			return "fail";
		}
	}

	@Override
	public Store getModel() {
		// TODO Auto-generated method stub
		return store;
	}

}
