package com.tej.arrays;

import java.util.Arrays;

public class SeparateZeroesFromNonZeroes {
//Java program to separate zeros from non-zeros in an integer array
	public static void main(String[] args) {
		moveZeroesToRight(new int[] {3,0,2,3,0,5,6});
	}
	
	private static void moveZeroesToRight(int[] array) {
		int counter=0;
		if(array==null) {
			return;
		}
		
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0) {
				array[counter]=array[i];
				counter++;
			}
		}
		while(counter<array.length) {
			array[counter]=0;
			counter++;
		}
		System.out.println(Arrays.toString(array));
	}
}
