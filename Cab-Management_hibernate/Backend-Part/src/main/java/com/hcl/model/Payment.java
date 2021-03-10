package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Payment_ID")
	
	private long paymentId;
	
	@JoinColumn(name= "FK_BookingId")
	private long bookingId;

	@Column(name="STATUS")
	private String status;

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", bookingId=" + bookingId + ", status=" + status + "]";
	}

	public Payment(long paymentId, long bookingId, String status) {
		super();
		this.paymentId = paymentId;
		this.bookingId = bookingId;
		this.status = status;
	}

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
