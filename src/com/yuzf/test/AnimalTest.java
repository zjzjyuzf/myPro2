package com.yuzf.test;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal animal_1 = new Animal();
		
		Animal animal_2 = new Dog();
		
		Animal animal_3 = new Cat();
		
		animal_1.say();
		animal_2.say();
		animal_3.say();
		
		Dog dog = (Dog) animal_3;
		
		dog.say();
	}
	
}

class Animal{
	
	public void say() {
		System.out.println("james harden");
	}
	
}

class Dog extends Animal{
	@Override
	public void say() {
		System.out.println("james 1234");
	}
	
}

class Cat extends Animal {
	@Override
	public void say() {
		System.out.println("james 7890");
	}
}