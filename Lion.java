package com.Xworkz.DataBase.Interface;

public class Lion implements Animal1{

	@Override
	public void eat() {
		System.out.println("Lion is eating");
		
	}

	@Override
	public void travel() {
		System.out.println("Lion is travelling");
		
	}
	
	public void roar() {
		System.out.println("Lion is roaring");
	}
}
