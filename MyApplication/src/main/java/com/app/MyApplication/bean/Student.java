package com.app.MyApplication.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_table")
public class Student {

	  @Id
	  @Column(name= "id")
	private int studId;
	  @Column(name= "name")
	private String studName;
	  @Column(name= "fee")
	private double studFee;
	  @Column(name= "mobile")
	private long studMobile;
	  @Column(name= "address")
	private String studAddress;
	
	
	public Student()
	{
		
	}


	public int getStudId() {
		return studId;
	}


	public void setStudId(int studId) {
		this.studId = studId;
	}


	public String getStudName() {
		return studName;
	}


	public void setStudName(String studName) {
		this.studName = studName;
	}


	public double getStudFee() {
		return studFee;
	}


	public void setStudFee(double studFee) {
		this.studFee = studFee;
	}


	public long getStudMobile() {
		return studMobile;
	}


	public void setStudMobile(long studMobile) {
		this.studMobile = studMobile;
	}


	public String getStudAddress() {
		return studAddress;
	}


	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studFee=" + studFee + ", studMobile="
				+ studMobile + ", studAddress=" + studAddress + "]";
	}
	
	
}
