package model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;





public class User {
  //@NotEmpty(message="Ime ne moze biti prazno")
	@javax.validation.constraints.NotEmpty
	@Pattern(regexp="[^0-9]+")
	@Size(min=3,max=6)
	private String name;
	@NotNull
	@Min(value=18)
	@Max(value=85)
	private int age;
	//@NotEmpty(message="Mail ne moze biti prazno")
	//NE KORISTITI @NotEmpty iz org.hibernate.validator vec iz javax.validation 
	@javax.validation.constraints.NotEmpty
	private String email;
	@NotNull(message="Zemlja ne moze biti prazno")
	private String country;
	
	
	
	public User(String name, int age, String email, String country) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.country = country;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
}
