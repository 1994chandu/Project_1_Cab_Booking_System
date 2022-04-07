package com.CBS.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cab {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer cabNo;
	String driverName;
	String route;
	String time;
	String bookingStatus;
	String dmobile;
	public Cab(Integer cabNo, String driverName, String route, String time, String bookingStatus, String dmobile) {
		super();
		this.cabNo = cabNo;
		this.driverName = driverName;
		this.route = route;
		this.time = time;
		this.bookingStatus = bookingStatus;
		this.dmobile = dmobile;
	}
	public Integer getCabNo() {
		return cabNo;
	}
	public void setCabNo(Integer cabNo) {
		this.cabNo = cabNo;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public String getDmobile() {
		return dmobile;
	}
	public void setDmobile(String dmobile) {
		this.dmobile = dmobile;
	}
	@Override
	public String toString() {
		return "Cab [cabNo=" + cabNo + ", driverName=" + driverName + ", route=" + route + ", time=" + time
				+ ", bookingStatus=" + bookingStatus + ", dmobile=" + dmobile + "]";
	}
	public Cab() {
		super();
	}
}