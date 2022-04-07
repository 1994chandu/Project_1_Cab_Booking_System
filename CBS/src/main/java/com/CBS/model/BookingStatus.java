package com.CBS.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "bstatus")
public class BookingStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable= false)
	private Integer bId;
	@Column(nullable= false)
	private String bookingStatus;
	
	/**
	 * @param bId
	 * @param bookingStatus
	 */
	public BookingStatus(Integer bId, String bookingStatus) {
		this.bId = bId;
		this.bookingStatus = bookingStatus;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(bId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingStatus other = (BookingStatus) obj;
		return Objects.equals(bId, other.bId);
	}

	@Override
	public String toString() {
		return "BookingStatus [Current Status is = " + bookingStatus + "]";
	}

	public Integer getbId() {
		return bId;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setbId(Integer bId) {
		this.bId = bId;
	}

	public void setStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}


	public BookingStatus() {
		super();
	}


}
