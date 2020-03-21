package com.chinasoft.app.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Classinfo implements Serializable{
	private Integer cid;
	private String cname;
	private Set<Student> students = new HashSet<Student>();
	
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	

}
