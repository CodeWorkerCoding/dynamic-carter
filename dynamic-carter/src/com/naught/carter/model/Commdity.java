package com.naught.carter.model;

import com.naught.carter.util.UUIdUtil;

/**
 * 商品模型
 */
public class Commdity {
	
	private String id;
	private String commdityName;
	private double price;
	public Commdity() {
	}
	
	public Commdity(String commdityName, double price) {
		super();
		this.id = UUIdUtil.getUUid();
		this.commdityName = commdityName;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCommdityName() {
		return commdityName;
	}
	public void setCommdityName(String commdityName) {
		this.commdityName = commdityName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
