package com.tej.strings;

import java.util.Scanner;

public class PyramidPattern3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of rows");
	int noOfRows=sc.nextInt();
	int rowCount=1;
	
	for(int i=noOfRows;i>0;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=rowCount;k++) {
			System.out.print("*"+" ");
		}
		System.out.println();
		rowCount++; 
	}
}
}
