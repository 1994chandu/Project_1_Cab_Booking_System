package com.CBS.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="request")
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable=false)
	private Integer reqId;
	@Column
	private String status;
	//@Column
	//private Timestamp rDate;
	
	@ManyToOne
	private Employee emp;
	
	public Request() {
		
	}
	
	public Request(String status, Integer emp) {
		// to insert a new request
		
		}
	public Integer getReqId() {
		return reqId;
	}
	public String getStatus() {
		return status;
	}
		public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	

/*@Entity
@Table(name="request")
public class Request {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable= false)
	private Integer requestId;
	
	@OneToOne(cascade=CascadeType.ALL,targetEntity=Employee.class)
	@JoinColumn(name="eId")
	private Employee eId;
	
	@OneToOne(cascade=CascadeType.ALL,targetEntity=BookingDetails.class)
	@JoinColumn(name="bookingId")
	private BookingDetails bookingId;
	
	@OneToOne(cascade=CascadeType.ALL,targetEntity=BookingStatus.class)
	@JoinColumn(name="bId")
	private BookingStatus bId;

	/**
	 * @param eId
	 * @param bId
	 */
	/*public Request( Employee eId, BookingStatus bId) {
		this.eId = eId;
		this.bId = bId;
		this.bookingId = null;
	}

	/**
	 * @param eId
	 * @param bookingId
	 * @param bId
	 */
	/*public Request( Employee eId, BookingDetails bookingId, BookingStatus bId) {
		this.eId = eId;
		this.bookingId = bookingId;
		this.bId = bId;
	}

	public Request() {}

	public Integer getRequestId() {
		return requestId;
	}

	public Employee getEId() {
		return eId;
	}

	public BookingDetails getBookingId() {
		return bookingId;
	}

	public BookingStatus getbId() {
		return bId;
	}

	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}

	public void seteId(Employee eId) {
		this.eId = eId;
	}

	public void setBookingId(BookingDetails bookingId) {
		this.bookingId = bookingId;
	}

	public void setbId(BookingStatus bId) {
		this.bId = bId;
	}*/
	
	

}