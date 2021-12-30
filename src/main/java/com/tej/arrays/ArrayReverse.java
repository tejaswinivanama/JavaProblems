package com.tej.arrays;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		reverseArray(new int[] {2,3,4,5,6,7});
		reverseArray(new int[] {2,3,4,5,6});
	}
	private static void reverseArray(int[] array) {
		int n=array.length/2;
		int temp=0;
		for(int i=0;i<n;i++) {
			temp=array[i];
			array[i]=array[array.length-i-1];
			array[array.length-i-1]=temp;
		}
		
		System.out.println(Arrays.toString(array));
	}
}
