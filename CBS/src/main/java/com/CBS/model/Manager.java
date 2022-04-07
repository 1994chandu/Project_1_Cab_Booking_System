package com.CBS.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Manager{
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer mId;
	String Name;
	String deptName;
	String Password;
	String Phno;
	public Manager(Integer mId, String name, String deptName, String password, String phno) {
		super();
		this.mId = mId;
		Name = name;
		this.deptName = deptName;
		Password = password;
		Phno = phno;
	}
	@Override
	public String toString() {
		return "Manager [mId=" + mId + ", Name=" + Name + ", deptName=" + deptName + ", Password=" + Password
				+ ", Phno=" + Phno + "]";
	}
	public Manager() {
		super();
	}

	
}

