package com.chinasoft.app.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.struts2.ServletActionContext;

import com.chinasoft.app.domain.Customer;
import com.chinasoft.app.domain.Messagebox;
import com.chinasoft.app.service.MessageService;
import com.chinasoft.app.vo.MessagePage;
import com.chinasoft.app.vo.UidPage;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MessageAction extends ActionSupport implements ModelDriven<Messagebox>{
	private Messagebox messagebox=new Messagebox();
	private MessageService messageservice;
	private 
	int uidCurrentpage=1;
	int uidPagesize=3;
	private int messageid;
	

	public Messagebox getMessagebox() {
		return messagebox;
	}
	public void setMessagebox(Messagebox messagebox) {
		this.messagebox = messagebox;
	}
	public int getMessageid() {
		return messageid;
	}
	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}
	public void setMessageservice(MessageService messageservice) {
		this.messageservice = messageservice;
	}
	public int getUidCurrentpage() {
		return uidCurrentpage;
	}
	public void setUidCurrentpage(int uidCurrentpage) {
		this.uidCurrentpage = uidCurrentpage;
	}
	public int getUidPagesize() {
		return uidPagesize;
	}
	public void setUidPagesize(int uidPagesize) {
		this.uidPagesize = uidPagesize;
	}
	public String add(){
		return "add";
	}
	public String messAdd(){
		messageservice.MessAdd(messagebox);
		ServletActionContext.getRequest().setAttribute("message",messagebox);
		return "add_mess_success";
	}
	public String messDelete(){
		Messagebox message=messageservice.findMessById(messagebox.getMsgId());
		ServletActionContext.getRequest().setAttribute("customer", message.getCustomer());
		messageservice.MessDelete(messagebox.getMsgId());
		return "delete_mess_success";
	}

	public String searchByUid(){
		Integer uid;
		if(messagebox.getCustomer()==null){
			uid=((Customer)ServletActionContext.getRequest().getAttribute("customer")).getUid();
		}
		else{
			uid=messagebox.getCustomer().getUid();
		}
		System.out.println(uid);
		System.out.println(messagebox.getCustomer());
		UidPage UidMessPage = messageservice.MessSearchByUid(uid, uidCurrentpage, uidPagesize);
		ServletActionContext.getRequest().setAttribute("uidpage",UidMessPage);
		ServletActionContext.getRequest().setAttribute("uid",uid);
		return "search_uid_success";
	}

	public String findMessage(){
		Messagebox findmess = messageservice.findMessById(messagebox.getMsgId());
		ServletActionContext.getRequest().setAttribute("message", findmess);
		return "findmessage";
	}


	@Override
	public Messagebox getModel() {
		// TODO Auto-generated method stub
		return messagebox;
	}

}
