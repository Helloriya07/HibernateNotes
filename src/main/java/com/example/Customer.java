package com.example;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int cId;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Orederrr> order;
	
	
	public int getcId() {
		return cId;
	}

	
	public void setcId(int cId) {
		this.cId = cId;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Orederrr> getOrder() {
		return order;
	}

	
	public void setOrder(List<Orederrr> order) {
		this.order = order;
	}


	public Customer(String name, List<Orederrr> order) {
		super();
		this.name = name;
		this.order = order;
	}


	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", name=" + name + ", order=" + order + "]";
	}
	

}
	

	