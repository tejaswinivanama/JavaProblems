package com.tej.easy;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=13;
		boolean flag=false;
		for(int i=2;i<=num/2;i++) {
			if(num % i ==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("prime number");
		}else {
			System.out.println("not prime");
		}
	}
}
