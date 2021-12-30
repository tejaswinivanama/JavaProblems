package com.tej.arrays;

import java.util.Arrays;

public class MinimumAbsoluteDifference {
	public static void main(String[] args) {
		int[] a=new int[] {5, 8, 4, 2, 9, 0};
		minimumAbsoluteDifference(a);
	}
	private static void minimumAbsoluteDifference(int[] array) {
		Arrays.sort(array);
		int minimum=Math.abs(array[1]-array[0]);
		int first=array[0];
		int second=array[1];
		
		for(int i=2;i<array.length;i++) {
			if(Math.abs(array[i]-array[i-1])<minimum){
				minimum=array[i]-array[i-1];
				first=array[i-1];
				second=array[i];
			}
		}
		System.out.println(minimum);
	}
}
