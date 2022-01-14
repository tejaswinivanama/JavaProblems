package com.tej.problems;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(reverseArr(new int[] {10,20,30,40} )));
	}
	
	private static int[] reverseArr(int[] a) {
		/*
		 * for(int i=a.length-1;i>=0;i--) { 
		 * System.out.print(a[i]+" "); }
		 */
		int n=a.length;
		int j=n;
		int[] b= new int[n];
		for(int i=0;i<n;i++) {
			b[j-1]=a[i];
			j=j-1;
		}
		return b;
	}
}
