package com.chinasoft.app.vo;

import java.util.List;

import com.chinasoft.app.domain.Messagebox;


public class MessagePage {
	private int pagesize; //ÿҳ��������¼
	private int currentpage; //��ǰҳ
	private int totalpage; //��ҳ��
	private int totalcount; //�ܼ�¼��
	private List<Messagebox> messagelist;
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getCurrentpage() {
		return currentpage;
	}
	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}
	public int getTotalpage() {
		return totalpage;
	}
	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
	public int getTotalcount() {
		return totalcount;
	}
	public void setTotalcount(int totalcount) {
		this.totalcount = totalcount;
	}
	public List<Messagebox> getMessagelist() {
		return messagelist;
	}
	public void setMessagelist(List<Messagebox> messagelist) {
		this.messagelist = messagelist;
	}
	

}
