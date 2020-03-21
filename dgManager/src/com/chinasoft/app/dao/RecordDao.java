package com.chinasoft.app.dao;

import java.util.List;

import com.chinasoft.app.domain.Recordlist;


public interface RecordDao {
	public List<Recordlist> findall(int currentPage, int pageSize);
	public int findTotalCount();
}
