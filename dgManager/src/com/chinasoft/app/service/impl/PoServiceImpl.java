package com.chinasoft.app.service.impl;
import java.util.List;

import com.chinasoft.app.dao.PoDao;
import com.chinasoft.app.domain.Orderinfo;
import com.chinasoft.app.domain.Po;
import com.chinasoft.app.service.PoService;
import com.chinasoft.app.vo.OrderinfoPage;

public class PoServiceImpl implements PoService{
public PoDao poDao;
	
	public void setPoDao(PoDao poDao) {
		this.poDao = poDao;
	}

	@Override
	public List<Po> findAllByPid(Integer productId) {
		// TODO Auto-generated method stub
		List<Po> list=poDao.findAllByPid(productId);
		return list;
	}

	@Override
	public List<Orderinfo> SearchByPid(List<Po> list) {
		// TODO Auto-generated method stub
		List<Orderinfo>list1=poDao.SearchByPid(list);
		return list1;
	}

}
