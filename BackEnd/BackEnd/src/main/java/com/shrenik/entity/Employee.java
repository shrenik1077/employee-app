package com.shrenik.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity 
public class Employee implements Serializable {
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

	public int getEmpcode() {
		return empcode;
	}

	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaratualstatus() {
		return maratualstatus;
	}

	public void setMaratualstatus(String maratualstatus) {
		this.maratualstatus = maratualstatus;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getProjectleader() {
		return projectleader;
	}

	public void setProjectleader(String projectleader) {
		this.projectleader = projectleader;
	}

	public double getProjectcost() {
		return projectcost;
	}

	public void setProjectcost(double projectcost) {
		this.projectcost = projectcost;
	}

	public Technology getTechnology() {
		return technology;
	}

	public void setTechnology(Technology technology) {
		this.technology = technology;
	}

	public Employee(int empcode, String firstname, String lname, String fullname, String gender, String maratualstatus,
			String location, String contactno, String emailid, String projectleader, double projectcost,
			Technology technology) {
		super();
		this.empcode = empcode;
		this.firstname = firstname;
		this.lname = lname;
		this.fullname = fullname;
		this.gender = gender;
		this.maratualstatus = maratualstatus;
		this.location = location;
		this.contactno = contactno;
		this.emailid = emailid;
		this.projectleader = projectleader;
		this.projectcost = projectcost;
		this.technology = technology;
	}
	
	public Employee() {}
}
