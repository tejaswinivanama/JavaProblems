package com.tej.strings;

import java.util.Scanner;

public class PyramidPattern2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of rows");
	int noOfRows=sc.nextInt();
	int rowCount=1;
	for(int i=noOfRows;i>0;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=rowCount;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
		rowCount++;
	}
	
}
}
