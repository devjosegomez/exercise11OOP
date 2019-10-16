package com.exercise11oop.model;

public class Angora extends Cat{
	private double jawLong;
	
	public Angora() {
		
	}
	
	public Angora(int id, String name, int age) {
		super(id, name, age);
	}
	
	//Getters and setters jawLong;
	public double getJawLong() {
		return jawLong;
	} 
	
	public void setJawLong(double jawLong) {
		this.jawLong = jawLong;
	}
	
	@Override
	//ToString
	public String ToString() {
		return "Id:["+getId()+"], name:["+getName()+"], age:["+getAge()+"], jawLong:[" + jawLong + "]";
	}
	
}
