package com.cts.demo.model;

public class Employee {
   private int id;
   private String name;
   private Address address;

public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setAddress(Address address) {
	this.address = address;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public Address getAddress() {
	return address;
}
   
}
