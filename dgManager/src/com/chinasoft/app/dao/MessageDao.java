package com.chinasoft.app.dao;

import java.util.List;

import com.chinasoft.app.domain.Messagebox;

public interface MessageDao {
	//�û��������
	public void MessAdd(Messagebox messagebox);
	//ɾ������
	public void MessDelete(int messid);
	//��������
	public Messagebox findMessById(int messid);
	public List<Messagebox> findMessByUid(int uid,int currentpage,int pagesize);
	//����������
	public int findtotalMessCountUid(int uid);

	

}
