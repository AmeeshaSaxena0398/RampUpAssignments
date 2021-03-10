package com.hcl.CrudOperation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name= "id")
    private Long id;
	@Column(name= "name")
    private String studentname;
	@Column(name= "course")
    private String course;
	@Column(name= "fee")
    private int fee;
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + studentname + ", course=" + course + ", fee=" + fee + "]";
	}
	public Student() {
		super();
		
	}
	public Student(Long id, String studentname, String course, int fee) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.course = course;
		this.fee = fee;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}

}
