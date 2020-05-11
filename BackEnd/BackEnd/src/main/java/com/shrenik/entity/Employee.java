package com.shrenik.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@ToString
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "empid")
	private int empcode;
	private String firstname;
	private String lname;
	private String fullname;
	private String gender;
	private String maratualstatus;
	private String location;
	private String contactno;
	private String emailid;
	private String projectleader;
	private double projectcost;
	
	@ManyToOne
	@JoinColumn(name="fktechnologyid",nullable = false)
	private Technology technology;
}
