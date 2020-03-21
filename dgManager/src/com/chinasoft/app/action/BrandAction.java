package com.chinasoft.app.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.app.domain.Brand;
import com.chinasoft.app.service.BrandService;
import com.chinasoft.app.util.BrandPage;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BrandAction extends ActionSupport implements ModelDriven<Brand>{
    private Brand brand=new Brand();
    private BrandService brandService;
    private int currentPage=1;
	private int pageSize=3;
	
	
    
    public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}
    
    

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



	public String add(){
    	brandService.add(brand);
    	return "brand_search";
    }
    
    public String delete(){
    	System.out.println(brand.getBname());
    	brandService.delete(brand.getBname());
    	return "brand_search";
    }
    
    public String search()
	{
		BrandPage brandPage=brandService.findAll(currentPage,pageSize);
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("brandPage",brandPage);
		return SUCCESS;
	}
    
    public String findByCountry()
    {
    	BrandPage brandPage=brandService.findBrandByCountry(brand.getCountry(), currentPage, pageSize);
    	HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("brandPage",brandPage);
		return SUCCESS;
    }
    
	@Override
	public Brand getModel() {
		// TODO Auto-generated method stub
		return brand;
	}

}
