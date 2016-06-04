package com.naught.carter.model;

/**
 * 订单模型
 */
public class Order {
	
	private String id;
	private String orderno;
	
	public Order(){
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderno() {
		return orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

}
