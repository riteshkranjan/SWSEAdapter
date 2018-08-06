package com.bt.consumer.SWSEAdapter.dto;

import java.io.Serializable;
import java.util.List;

public class OrderDetails implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5925549000071684667L;
	private Order order;
	private List<OrderItem> orderItems;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	
	

}
