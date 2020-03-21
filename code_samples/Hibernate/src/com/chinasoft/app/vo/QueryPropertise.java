package com.chinasoft.app.vo;

import java.io.Serializable;

public class QueryPropertise implements Serializable{
	private int a;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public QueryPropertise(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public QueryPropertise() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
