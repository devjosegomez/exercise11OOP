package com.exercise11oop.app;
import  com.exercise11oop.model.Dog;

public class DogApp {

	public static void main(String[] args) {
		Dog pluto = new Dog();
		Dog firulais = new Dog(2, "Firulais", "Huskie", 3, 62.5);
		
		pluto.age = 1;
		pluto.height = 43;
		pluto.id = 1;
		
		System.out.println("Id: " + pluto.id);
		System.out.println("Pluto's properties: ");
		System.out.println("Age: " + pluto.age);
		System.out.println("Height: " + pluto.height);
		System.out.println();
		System.out.println("Firulais's properties: ");
		System.out.println("Age: " + firulais.age);
		System.out.println("Height: " + firulais.height);
		System.out.println("Id: " + firulais.id);
	}

}
