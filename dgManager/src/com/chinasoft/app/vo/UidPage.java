package com.chinasoft.app.vo;

import java.util.List;

import com.chinasoft.app.domain.Messagebox;

public class UidPage {
	private int upagesize; //ÿҳ��������¼
	private int ucurrentpage; //��ǰҳ
	private int utotalpage; //��ҳ��
	private int utotalcount; //�ܼ�¼��
	private List<Messagebox> umessagelist;
	public int getUpagesize() {
		return upagesize;
	}
	public void setUpagesize(int upagesize) {
		this.upagesize = upagesize;
	}
	public int getUcurrentpage() {
		return ucurrentpage;
	}
	public void setUcurrentpage(int ucurrentpage) {
		this.ucurrentpage = ucurrentpage;
	}
	public int getUtotalpage() {
		return utotalpage;
	}
	public void setUtotalpage(int utotalpage) {
		this.utotalpage = utotalpage;
	}
	public int getUtotalcount() {
		return utotalcount;
	}
	public void setUtotalcount(int utotalcount) {
		this.utotalcount = utotalcount;
	}
	public List<Messagebox> getUmessagelist() {
		return umessagelist;
	}
	public void setUmessagelist(List<Messagebox> umessagelist) {
		this.umessagelist = umessagelist;
	}
	

}
