package com.chinasoft.app.dao;

import java.util.List;

import com.chinasoft.app.domain.Brand;
import com.chinasoft.app.domain.Products;

public interface BrandDao {
	public void add(Brand brand);
    public void update(Brand brand);
    public void delete(String bname);
    public List<Brand> findAll(int currentPage,int pageSize);
    public Brand findBrandById(String bname);
    public int findTotalCount();
    public List<Brand> findBrandByCountry(String country,int currentPage,int pageSize);
    public int findBrandNum(String country);
}
