package com;

public class BMW extends Car{

	private String name="emp2";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getEnginePower() {
		System.out.println("from bmw class");
	}
}
