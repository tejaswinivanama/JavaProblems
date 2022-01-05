package com.tej.generalproblems;

public class TestClass{

	public static void main(String[] args) {
		Car c=new BMW();
		c.getEnginePower();
		System.out.println(c.getName()); //Instance variables does not participate in polymorphism, however instance methods do participate.
		//but if we declare both instance variables as private output will be emp2 because child class won't be able to access parent class's private variables
	//https://javasolutionsguide.blogspot.com/2016/04/encapsulation.html
	
	}
}
