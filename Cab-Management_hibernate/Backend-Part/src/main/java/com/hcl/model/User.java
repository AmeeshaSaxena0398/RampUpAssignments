package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "id")
	private long userId;
	@Column(name= "name")
	private String userName;
	@Column(name = "PANCARD")
	private String userPAN;

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPAN=" + userPAN + "]";
	}

	public User() {
		super();

	}

	public User(long userId, String userName, String userPAN) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPAN = userPAN;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPAN() {
		return userPAN;
	}

	public void setUserPAN(String userPAN) {
		this.userPAN = userPAN;
	}

}
