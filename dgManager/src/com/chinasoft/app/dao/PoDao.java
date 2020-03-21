package com.chinasoft.app.dao;

import java.util.List;

import com.chinasoft.app.domain.Orderinfo;
import com.chinasoft.app.domain.Po;

public interface PoDao {
	List<Po> findAllByPid(Integer productId);

	List<Orderinfo> SearchByPid(List<Po> list);
}
