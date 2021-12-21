package com.tej.arrays;

import java.util.Arrays;

public class SubArrayWhoseSumIsNumber {
	public static void main(String[] args) {
		// Java program to find continuous
		//sub array whose sum is equal to a given number
		findSubArrayOfSumValue(new int[] {42, 15, 12, 8, 6, 32},26);
		
	}

	private static int[] findSubArrayOfSumValue(int[] a,int sum) {

		if(a==null || a.length==0) {
			throw new IllegalArgumentException();
		}
		for(int i=0;i<a.length;i++) {
			int actualSum=0;
			for(int j=i;j<a.length;j++) {

				actualSum=actualSum+a[j];
				if(actualSum==sum) {
					System.out.println(Arrays.toString(Arrays.copyOfRange(a, i, j+1)));
				}
			}
		}
		return new int[] {};
	}
}
