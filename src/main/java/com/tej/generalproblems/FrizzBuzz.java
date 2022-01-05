package com.tej.generalproblems;

public class FrizzBuzz {

	public static void main(String[] args) {
		printPattern2(100);
	}

	static void printPattern(int n) {

		for(int i=1;i<=n;i++) {
			if(i%3==0) {
				
				if(i%3==0 && i%5==0){
					System.out.println("FrizzBuzz");
				}else {
					System.out.println("Frizz");
				}
			}else if(i%5==0) {
				
				if(i%3==0 && i%5==0){
					System.out.println("FrizzBuzz");
				}else {
					System.out.println("Buzz");
				}
			}
			else {
				System.out.println(i);
			}
		}
	}
	
	static void printPattern2(int n) {
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0){
				System.out.println("FizzBuzz");
				
			}else if (i%3==0) {
				System.out.println("Fizz");
			}else if (i%5==0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
	}
		
	}
}
