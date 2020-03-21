package com.chinasoft.app.service;

import com.chinasoft.app.domain.RecordPage;

public interface RecordService {
	public RecordPage findall(int currentPage, int pageSize);
}
