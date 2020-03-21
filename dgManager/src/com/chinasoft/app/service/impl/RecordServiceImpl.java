package com.chinasoft.app.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.app.dao.RecordDao;
import com.chinasoft.app.domain.RecordPage;
import com.chinasoft.app.domain.Recordlist;
import com.chinasoft.app.service.RecordService;
@Transactional

public class RecordServiceImpl implements RecordService{
	RecordDao recordDao;
	public RecordDao getRecordDao() {
		return recordDao;
	}
	public void setRecordDao(RecordDao recordDao) {
		this.recordDao = recordDao;
	}
	@Override
	public RecordPage findall(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		RecordPage recordPage=new RecordPage();

		List<Recordlist> list=recordDao.findall(currentPage, pageSize);
		recordPage.setDataList(list);
		recordPage.setCurrentPage(currentPage);
		recordPage.setPageSize(pageSize);
		int totalCount=recordDao.findTotalCount();
		
		recordPage.setTotalCount(totalCount);
		recordPage.setTotalPage(totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1);
		return recordPage;
	}

}
