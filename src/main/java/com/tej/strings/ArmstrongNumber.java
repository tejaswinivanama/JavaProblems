package com.tej.strings;

public class ArmstrongNumber {
	public static void main(String[] args) {
		isArmstrong(153);
	}
	
	private static void isArmstrong(int num) {
		int s=0;
		int n=num;
		while(n>0) {
			int r=n%10;
			s=s+r*r*r;
			n=n/10;
			
		}
		
		if(s==num) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
	}
}
