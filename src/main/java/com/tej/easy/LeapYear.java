package com.tej.easy;

public class LeapYear {
	public static void main(String[] args) {
		int year=2012;
		boolean leap=false;
	/* a leap year should be divisible by 4 then 
	 if its a century year it should be divisible by 400*/
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					leap=true;
				}else {
					leap=false;
				}
			}else {
				leap=true;
			}
		}else {
			leap=false;
		}
		if(leap) {
			System.out.println("its leap");
		}else {
			System.out.println("not leap");
		}
	}
}
