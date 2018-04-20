package model;

import java.util.Date;
import java.util.List;

public class Student {

	private String name;
	private String gender;
	private List<String>technologies;
	private String city;
	private String phone;
	private Date dob;
	//GET I SET METODE
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	//KONSTRUKTORI
	public Student(String name, String gender, List<String> technologies, String city, String phone, Date dob) {
		super();
		this.name = name;
		this.gender = gender;
		this.technologies = technologies;
		this.city = city;
		this.phone = phone;
		this.dob = dob;
	}
	public Student() {
		super();
	}
	
	
	
	
}
