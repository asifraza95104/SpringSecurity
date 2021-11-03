package com.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subscription")
public class Subscription {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "id")
	  private int id;
	  
	  @Column(name= "name")
	  private String name;
	  
	  @Column(name= "price")
	  private Double price;
	  
	  @Column(name= "description")
	  private String description;
	  
	  
	  
	  @OneToOne(cascade = {CascadeType.MERGE,
			  CascadeType.DETACH,
			  CascadeType.PERSIST,
			  CascadeType.REFRESH}, mappedBy = "subscription")
	  private Customer customer;
	  
	  
	  public Subscription(int id)
	  {
		  this.id= id;
	  }
	  
	  public Subscription()
	  {
		  
	  }
	  
	  
	  
	  public Subscription(String name, Double price, String description)
	  {
		  this.name= name;
		  this.price= price;
		  this.description= description;
	  }



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



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	@Override
	public String toString() {
		return "Subscription [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + "]";
	}
	  
	  
	  
}
