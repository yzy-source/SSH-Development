package com.chinasoft.app.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chinasoft.app.dao.BrandDao;
import com.chinasoft.app.dao.impl.BrandDaoImpl;
import com.chinasoft.app.domain.Brand;
import com.chinasoft.app.service.BrandService;
import com.chinasoft.app.util.BrandPage;
import com.chinasoft.app.util.ProductPage;

public class BrandServiceImpl implements BrandService{
	//“¿¿µ◊¢»Î
    private BrandDao brandDao;
	

	public BrandDao getBrandDao() {
		return brandDao;
	}

	public void setBrandDao(BrandDao brandDao) {
		this.brandDao = brandDao;
	}

	@Override
	public void add(Brand brand) {
		// TODO Auto-generated method stub
		brandDao.add(brand);
		
	}

	@Override
	public void update(Brand brand) {
		// TODO Auto-generated method stub
		brandDao.update(brand);
		
	}

	@Override
	public void delete(String bname) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext resource  = new  ClassPathXmlApplicationContext("applicationContext.xml"); 
	    BrandDao brandDao1=(BrandDao) resource.getBean("brandDao");
		brandDao1.delete(bname);
		
	}

	@Override
	public BrandPage findAll(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		BrandPage brandPage=new BrandPage();
		ClassPathXmlApplicationContext resource  = new  ClassPathXmlApplicationContext("applicationContext.xml"); 
	     BrandDao brandDao1=(BrandDao) resource.getBean("brandDao");
	    
		brandPage.setCurrentPage(currentPage);
		brandPage.setPageSize(pageSize);
		brandPage.setBrandList(brandDao1.findAll(currentPage, pageSize));
		int totalCount=brandDao1.findTotalCount();
		brandPage.setTotalCount(totalCount);
		brandPage.setTotalPage(totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1);
		System.out.println(brandPage.getBrandList().size());
		return brandPage;
	}

	@Override
	public Brand findBrandById(String bname) {
		// TODO Auto-generated method stub
		return brandDao.findBrandById(bname);
	}

	@Override
	public BrandPage findBrandByCountry(String country, int currentPage,
			int pageSize) {
		// TODO Auto-generated method stub
		BrandPage brandPage=new BrandPage();
		brandPage.setCurrentPage(currentPage);
		brandPage.setPageSize(pageSize);
		brandPage.setBrandList(brandDao.findBrandByCountry(country, currentPage, pageSize));
		int totalCount=brandDao.findBrandNum(country);
		brandPage.setTotalCount(totalCount);
		brandPage.setTotalPage(totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1);
		return brandPage;
	}
     
}
