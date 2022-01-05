package com.tej.generalproblems;

public class TestPatterns {

	public static void main(String[] args) {
		startPattern1();
		System.out.println("");
		startPattern2();
		System.out.println("");
		startPattern3();
	}
	
	public static void startPattern1() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
	}
	
	public static void startPattern2() {
		for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
			System.out.println(" ");
		}
	}
	
	public static void startPattern3() {
		for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++) {
			System.out.print(" *");
		}
			System.out.println(" ");
		}
	}
	
}
