package com.tej.strings;

import java.util.Scanner;

public class PyramidPattern5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int noOfRows=sc.nextInt();
		int rowCount=1;
		
		for(int i=noOfRows;i>0;i--) {
			for(int j=1;j<=i*2;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=noOfRows;j++) {
			System.out.print(j+" ");
			}
			for(int j=noOfRows-1;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
			rowCount++;
		}
	}
}


//   2
// 1 2 1