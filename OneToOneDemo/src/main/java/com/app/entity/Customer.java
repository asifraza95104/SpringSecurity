package com.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "customer")
public class Customer {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name= "id")
	 private int id;
	 
      @Column(name = "first_name")
	 private String firstName;
      
        @Column(name= "last_name")
	 private String lastName;
	 
         @Column(name= "email")
	 private String email;
	 
         
         @OneToOne(cascade = CascadeType.ALL)
         @JoinColumn(name = "sub_id")
	 private Subscription subscription;
	 
	 
         
         public Customer()
         {
        	 
         }
	 
         public Customer(int id)
         {
        	  this.id= id;
         }
         public Customer (String firstName, String lastName, String email) {
        	 
        	 this.firstName=firstName;
        	 this.lastName=lastName;
        	 this.email= email;
         }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Subscription getSubscription() {
			return subscription;
		}

		public void setSubscription(Subscription subscription) {
			this.subscription = subscription;
		}

		@Override
		public String toString() {
			return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
					+ "]";
		}
         
         
         
         
         
	
}
