package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "driver")
public class Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Driver_ID")
	private long driverId;
	@Column(name="Driver_Name")
	private String driverName;
	@Column(name="Driver_LicenseNo")
	private String driverLicenseNo;
	
	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", driverLicenseNo=" + driverLicenseNo
				+ "]";
	}
	public Driver(long driverId, String driverName, String driverLicenseNo) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.driverLicenseNo = driverLicenseNo;
	}
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getDriverId() {
		return driverId;
	}
	public void setDriverId(long driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverLicenseNo() {
		return driverLicenseNo;
	}
	public void setDriverLicenseNo(String driverLicenseNo) {
		this.driverLicenseNo = driverLicenseNo;
	}
	
	

}
