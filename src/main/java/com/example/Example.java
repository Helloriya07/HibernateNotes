package com.example;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;

@Entity
@NamedQuery(name = "update",
            query = "UPDATE Example SET name=:name WHERE id=:id")

public class Example {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	 private Fees fees;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Fees getFees() {
		return fees;
	}

	public void setFees(Fees fees) {
		this.fees = fees;
	}
	public Example( String name, Fees fees) {
		super();
		
		this.name = name;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Example [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}
	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}


	

}
