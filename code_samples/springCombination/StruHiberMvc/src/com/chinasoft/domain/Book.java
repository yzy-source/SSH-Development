package com.chinasoft.domain;

// Generated 2017-7-14 14:38:37 by Hibernate Tools 3.4.0.CR1

/**
 * Book generated by hbm2java
 */
public class Book implements java.io.Serializable {

	private Integer bid;
	private String bname;

	public Book() {
	}

	public Book(String bname) {
		this.bname = bname;
	}

	public Integer getBid() {
		return this.bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return this.bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

}