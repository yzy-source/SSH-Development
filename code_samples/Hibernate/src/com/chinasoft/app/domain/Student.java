package com.chinasoft.app.domain;

import java.io.Serializable;

public class Student implements Serializable{
	private Integer sid;
	private String sname;
	private Classinfo classinfo;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Classinfo getClassinfo() {
		return classinfo;
	}
	public void setClassinfo(Classinfo classinfo) {
		this.classinfo = classinfo;
	}
	
}
