package com.exercise11oop.app;
import  com.exercise11oop.model.Dog;

public class DogApp {

	public static void main(String[] args) {
		Dog pluto = new Dog();
		Dog tribilin = new Dog();
		
		pluto.age = 1;
		pluto.height = 43;
		pluto.id = 1;
		
		tribilin.age = 1;
		tribilin.height = 43;
		tribilin.id = 1;
		
		System.out.println("Pluto's properties: ");
		System.out.println("Age: " + pluto.age);
		System.out.println("Height: " + pluto.height);
		System.out.println("Id: " + pluto.id);
		
		System.out.println("Tribilin's age: " + tribilin.age);
		
	}

}
