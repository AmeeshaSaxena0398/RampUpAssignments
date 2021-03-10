package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_Booking")
public class UserBooking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Booking_ID")
	private long bookingId;
	@Column(name="Booking_Address")
	private String bookingAddress;
	
	@Override
	public String toString() {
		return "UserBooking [bookingId=" + bookingId + ", bookingAddress=" + bookingAddress + "]";
	}
	public UserBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserBooking(long bookingId, String bookingAddress) {
		super();
		this.bookingId = bookingId;
		this.bookingAddress = bookingAddress;
	}
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookingAddress() {
		return bookingAddress;
	}
	public void setBookingAddress(String bookingAddress) {
		this.bookingAddress = bookingAddress;
	}

}
