package com.chinasoft.app.service;

import java.util.List;

import com.chinasoft.app.domain.Messagebox;
import com.chinasoft.app.vo.MessagePage;
import com.chinasoft.app.vo.UidPage;

public interface MessageService {
	   //用户添加留言
		public void MessAdd(Messagebox messagebox);
		//删除留言
		public void MessDelete(int messid);
		//根据用户查询留言
		public UidPage MessSearchByUid(int id,int currentpage,int pagesize);
		//查找留言
		public Messagebox findMessById(int messid);

}
