package com.Xworkz.DataBase.Interface;

public class Dog implements Animal1{

	@Override
	public void eat() {
		System.out.println("Dog is eating");
		
	}

	@Override
	public void travel() {
		System.out.println("Dog is travelling");
		
	}
	
	public void bark() {
		System.out.println("Dog is barking");
	}
	

}
