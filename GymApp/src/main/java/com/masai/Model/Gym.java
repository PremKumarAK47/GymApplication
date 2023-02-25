package com.masai.Model;

public class Gym {
	private int person_id;
	private String name; 
	
	private int age;
	

	public Gym() {
		// TODO Auto-generated constructor stub
	}

	public Gym(int person_id, String name, int age) {
		super();
		this.person_id = person_id;
		this.name = name;
		
		this.age = age;
		
	}

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
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

	
	
}
