package com.example;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Orederrr {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
    private String product;
	
	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public String getProduct() {
		return product;
	}
	
	public void setOrder(String product) {
		this.product = product;
	}
	public Orederrr(String product) {
		super();
		this.product = product;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", product=" + product + "]";
	}
	    
	
	

	
	

	
}
