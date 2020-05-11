package com.shrenik.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@ToString
public class Technology {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int technologyid;
	
	private String technology;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "technology")
	private Set<Employee> employees;
}
