package com.chinasoft.app.service;

import java.util.List;

import com.chinasoft.app.domain.Orderinfo;
import com.chinasoft.app.domain.Po;

public interface PoService {
	List<Po> findAllByPid(Integer productId);

	List<Orderinfo> SearchByPid(List<Po> list);
} 
