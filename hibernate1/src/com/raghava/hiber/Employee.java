package com.raghava.hiber;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

@Entity
@Table("emphiber1")
public class Employee {
private int id;
private String firstName,lastName;

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


}
