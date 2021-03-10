package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Vehicle")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Vehicle_ID")
	private long vehicleId;
	@Column(name="Vehicle_Name")
	private String vehicleName;
	@Column(name="Vehicle_Type")
	private String vehicleType;
	@Column(name="Vehicle_RegNo")
	private int vehicleRegNo;
	
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", vehicleType=" + vehicleType
				+ ", vehicleRegNo=" + vehicleRegNo + "]";
	}
	public Vehicle(long vehicleId, String vehicleName, String vehicleType, int vehicleRegNo) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
		this.vehicleRegNo = vehicleRegNo;
	}
	public Vehicle() {
		super();
	
	}
	public long getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getVehicleRegNo() {
		return vehicleRegNo;
	}
	public void setVehicleRegNo(int vehicleRegNo) {
		this.vehicleRegNo = vehicleRegNo;
	}

}
