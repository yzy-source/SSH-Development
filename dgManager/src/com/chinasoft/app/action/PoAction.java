package com.chinasoft.app.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.app.domain.Orderinfo;
import com.chinasoft.app.domain.Po;
import com.chinasoft.app.service.OrderinfoService;
import com.chinasoft.app.service.PoService;
import com.chinasoft.app.vo.OrderinfoPage;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class PoAction extends ActionSupport implements ModelDriven<Po>{
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

	private Po po=new Po();
	private PoService poservice;
   
	@Override
	public Po getModel() {
		// TODO Auto-generated method stub
		return po;
	}
	
	public void setPoservice(PoService poservice) {
		this.poservice = poservice;
	}

	public String SearchByPid()
    {
    	System.out.println("SearchByPid'函数被执行...");
    	//得到页面输入的数据内容
    	ServletActionContext.getRequest().setAttribute("po",po);
    	//通过页面输入的数据内容返回oid值
          List<Po>list=poservice.findAllByPid(po.getProducts().getProductId());
		List<Orderinfo>list_order=poservice.SearchByPid(list);
		OrderinfoPage orderPage=new OrderinfoPage();
		orderPage.setDataList(list_order);
		orderPage.setCurrentPage(currentPage);
		orderPage.setPageSize(pageSize);
		//总共有几条order
		int totalCount=list_order.size();
		orderPage.setTotalCount(totalCount);
		orderPage.setTotalPage(totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1);
		ServletActionContext.getRequest().setAttribute("OrderinfoPage", orderPage);
		return SUCCESS;
    }

}
