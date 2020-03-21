package com.chinasoft.app.domain;


import java.util.Date;

/**
 * Messagebox generated by hbm2java
 */
public class Messagebox implements java.io.Serializable {

	private Integer msgId;
	private Customer customer;
	private Products products;
	private String content;
	private Date msgTime;

	public Messagebox() {
	}

	public Messagebox(Customer customer, Products products, String content,
			Date msgTime) {
		this.customer = customer;
		this.products = products;
		this.content = content;
		this.msgTime = msgTime;
	}

	public Integer getMsgId() {
		return this.msgId;
	}

	public void setMsgId(Integer msgId) {
		this.msgId = msgId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getMsgTime() {
		return this.msgTime;
	}

	public void setMsgTime(Date msgTime) {
		this.msgTime = msgTime;
	}

}
