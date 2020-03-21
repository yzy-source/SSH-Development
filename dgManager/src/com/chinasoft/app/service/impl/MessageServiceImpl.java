package com.chinasoft.app.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.chinasoft.app.dao.MessageDao;
import com.chinasoft.app.domain.Customer;
import com.chinasoft.app.domain.Messagebox;
import com.chinasoft.app.service.MessageService;
import com.chinasoft.app.vo.CustomerPage;
import com.chinasoft.app.vo.MessagePage;
import com.chinasoft.app.vo.UidPage;

@Transactional
public class MessageServiceImpl implements MessageService{
	private MessageDao messagedao;

	public void setMessagedao(MessageDao messagedao) {
		this.messagedao = messagedao;
	}

	@Override
	public void MessAdd(Messagebox messagebox) {
		messagedao.MessAdd(messagebox);
		
	}

	@Override
	public void MessDelete(int messid) {
		messagedao.MessDelete(messid);
		
	}


	@Override
	public Messagebox findMessById(int messid) {
		Messagebox messagebox=messagedao.findMessById(messid);
		return messagebox;
	}


	@Override
	public UidPage MessSearchByUid(int uid, int currentpage, int pagesize) {
		UidPage messagepage=new UidPage();
		List<Messagebox> messagelist=messagedao.findMessByUid(uid, currentpage, pagesize);
		messagepage.setUcurrentpage(currentpage);               
		messagepage.setUpagesize(pagesize);     
		messagepage.setUmessagelist(messagelist);    
		int totalcount=messagedao.findtotalMessCountUid(uid);       
		messagepage.setUtotalcount(totalcount);  
		messagepage.setUtotalpage(totalcount % pagesize==0?totalcount/pagesize:totalcount/pagesize+1); 
		return messagepage;
	}


}
