package com.masai.model;

public class Person {

	
   private int personid;
   private String name;
   private String email;
   private int age;
   private String mobile;
public Person(int personid, String name, String email, int age, String mobile) {
	super();
	this.personid = personid;
	this.name = name;
	this.email = email;
	this.age = age;
	this.mobile = mobile;
}
public Person() {
	super();
}
public int getPersonid() {
	return personid;
}
public void setPersonid(int personid) {
	this.personid = personid;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "Person [personid=" + personid + ", name=" + name + ", email=" + email + ", age=" + age + ", mobile="
			+ mobile + "]";
}

   
   
}
