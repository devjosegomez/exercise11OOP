package com.exercise11oop.app;
import com.exercise11oop.model.Cat;

public class CatApp {

	public static void main(String[] args) {
		Cat aurelia = new Cat();
		
		aurelia.setId(1);
		aurelia.setAge(4);
		aurelia.setName("Aurelia");
		
		System.out.println("Aurelia's id: " + aurelia.getId());
		System.out.println("Aurelia's age: " + aurelia.getAge());
		System.out.println("Aurelia's name: " + aurelia.getName());

	}

}
