package com.chinasoft.app.service;

import java.util.List;

import com.chinasoft.app.domain.Messagebox;
import com.chinasoft.app.vo.MessagePage;
import com.chinasoft.app.vo.UidPage;

public interface MessageService {
	   //�û��������
		public void MessAdd(Messagebox messagebox);
		//ɾ������
		public void MessDelete(int messid);
		//�����û���ѯ����
		public UidPage MessSearchByUid(int id,int currentpage,int pagesize);
		//��������
		public Messagebox findMessById(int messid);

}
