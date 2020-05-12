package com.shrenik.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity 
public class Technology implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int technologyid;
	
	private String technology;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "technology")
	private Set<Employee> employees;

	public int getTechnologyid() {
		return technologyid;
	}

	public void setTechnologyid(int technologyid) {
		this.technologyid = technologyid;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public Technology(int technologyid, String technology, Set<Employee> employees) {
		super();
		this.technologyid = technologyid;
		this.technology = technology;
		this.employees = employees;
	}
	
	public Technology() {}
	
}
