package com.raghava.hibernate;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;  

@Entity
@Table(name="emphiber2")
public class Employee {
	@Id
	private int id;
	
	private String name;
	
	private int sal;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name="empaddres",
			joinColumns=@JoinColumn(name="emp_id"))
	private List<Address> adds;

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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public List<Address> getAdds() {
		return adds;
	}

	public void setAdds(List<Address> adds) {
		this.adds = adds;
	}
	
}
