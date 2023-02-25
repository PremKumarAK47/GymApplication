package com.masai.model;

public class Gym {

	private int gymId;
	private String gymName;
	private int monthlyFee;
	public Gym(int gymId, String gymName, int monthlyFee) {
		super();
		this.gymId = gymId;
		this.gymName = gymName;
		this.monthlyFee = monthlyFee;
	}
	public Gym() {
		super();
	}
	public int getGymId() {
		return gymId;
	}
	public void setGymId(int gymId) {
		this.gymId = gymId;
	}
	public String getGymName() {
		return gymName;
	}
	public void setGymName(String gymName) {
		this.gymName = gymName;
	}
	public int getMonthlyFee() {
		return monthlyFee;
	}
	public void setMonthlyFee(int monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	@Override
	public String toString() {
		return "Gym [gymId=" + gymId + ", gymName=" + gymName + ", monthlyFee=" + monthlyFee + "]";
	}
	
	
	
}
