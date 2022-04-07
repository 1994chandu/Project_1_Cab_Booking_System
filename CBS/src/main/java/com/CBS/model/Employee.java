package com.CBS.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Employee{
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer eId;
	String empName;
	String deptName;
	String password;
	String phno;
	public Employee(Integer eId, String empName, String deptName, String password, String phno) {
		super();
		this.eId = eId;
		this.empName = empName;
		this.deptName = deptName;
		this.password = password;
		this.phno = phno;
	}
	@OneToMany(mappedBy = "emp")
	private List<Request> request = new ArrayList<Request>();
	public Employee() {
		super();
	}
	public Integer getEId() {
		return eId;
	}
	public void setEId(Integer eId) {
		this.eId = eId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", empName=" + empName + ", deptName=" + deptName + ", password=" + password
				+ ", phno=" + phno + "]";
	}

	
}
