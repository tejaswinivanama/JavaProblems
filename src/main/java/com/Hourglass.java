package com;

import java.util.Scanner;

public class Hourglass {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][] a=new int[6][6];
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				a[i][j]=scan.nextInt();
				
			}
		}
		System.out.println(findHourglassSum(a));
		scan.close();
	}
	
	static int findHourglassSum(int[][] a) {
		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int r=0;r<4;r++) {
			for(int c=0;c<4;c++) {
				sum=a[r+0][c+0]+a[r+0][c+1]+a[r+0][c+2]+a[r+1][c+1]+a[r+2][c+0]+a[r+2][c+1]+a[r+2][c+2];
						
						
			}
		}
		if(sum>max) {
			max=sum;
		}
		return max;
	}
}
