package com.Form.Validation.model;

import jakarta.persistence.*;


@Entity
@Table(name ="studentForms")
public class StudentValidations {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "std_id")
	private long id;
	@Column(name = "std_name")
	private String  name;
	@Column(name = "std_age")
	private int age;
	@Column(name = "std_email")
	private String email;
	@Column(name = "std_password")
	private String password;
	@Column(name = "imagepath")
	private String imagepath;
	
	public StudentValidations(long id, String name, int age, String email, String password, String imagepath) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.imagepath = imagepath;
	}
	public StudentValidations() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	
	
}
