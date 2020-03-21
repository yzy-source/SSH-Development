package com.chinasoft.app.service;

import com.chinasoft.app.domain.Brand;
import com.chinasoft.app.util.BrandPage;
import com.chinasoft.app.util.ProductPage;

public interface BrandService {
	public void add(Brand brand);
    public void update(Brand brand);
    public void delete(String bname);
    public BrandPage findAll(int currentPage,int pageSize);
    public Brand findBrandById(String bname);
    public BrandPage findBrandByCountry(String country,int currentPage,int pageSize);
}
