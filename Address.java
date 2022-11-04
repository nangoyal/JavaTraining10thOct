package com.jpa.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//pojo class for Address
@Entity
public class Address {
////	fields 
	@Id
	@GeneratedValue
	private int addrId;
	@Column(name = "emp_city")
	private String city;
	@Column(name = "emp_state")
	private String state;
	
//	constructors
	public Address() {}
	public Address(int addrId, String city, String state) {
		super();
		this.addrId = addrId;
		this.city = city;
		this.state = state;
	}
	
    public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
//	Getters and Setters
	public int getAddrId() {
		return addrId;
	}
	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
//	toString() method
	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
}
