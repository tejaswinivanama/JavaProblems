package com.tej.generalproblems;

import java.util.Scanner;

public class StringManipulations {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		/* Enter your code here. Print output to STDOUT. */
		int c= A.length()+B.length();
		System.out.println(c);
		if(A.compareToIgnoreCase(B)<0){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}

		System.out.println(A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase() + " " +B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase());
	}
}
