package com.naught.carter.model;

import java.util.ArrayList;
import java.util.List;

import com.naught.carter.util.UUIdUtil;

/**
 * 商品模型
 */
public class Commdity {
	
	private String id;
	private String commdityName;
	private double price;
	
	public static List<Commdity> commdities = new ArrayList<Commdity>();
	
	static {
		commdities.add(new Commdity("大学语文", 12.3d));
		commdities.add(new Commdity("软件工程", 45.3d));
		commdities.add(new Commdity("Red Hat Linux 管理", 82.3d));
		commdities.add(new Commdity("大学英语", 86.3d));
		commdities.add(new Commdity("高等数学", 70.3d));
	} 
	
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
