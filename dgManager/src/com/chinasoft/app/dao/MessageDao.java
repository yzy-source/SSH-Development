package com.chinasoft.app.dao;

import java.util.List;

import com.chinasoft.app.domain.Messagebox;

public interface MessageDao {
	//用户添加留言
	public void MessAdd(Messagebox messagebox);
	//删除留言
	public void MessDelete(int messid);
	//查找留言
	public Messagebox findMessById(int messid);
	public List<Messagebox> findMessByUid(int uid,int currentpage,int pagesize);
	//所有留言数
	public int findtotalMessCountUid(int uid);

	

}
