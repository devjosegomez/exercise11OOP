package com.exercise11oop.model;

public class Cat {
	private int id;
	private String name;
	private int age;
	
	public Cat() {
		
	}
	
	public Cat(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	//Getter and setters ID
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	//Getter and setters name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//Getter and setters age
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//ToString method
	public String ToString() {
		return "Id:["+id+"], name:["+name+"], age:["+age+"]";
	}
	
}
