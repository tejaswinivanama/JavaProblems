package com.tej.arrays;

import java.util.Arrays;

public class ArrayRotationRight {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(rightRotate(new int[] {1,2,3,4,5,6,7},2)));
	}
	private static int[] rightRotate(int[] array,int positions) {
		int temp;
		for(int i=0;i<positions;i++) {
			temp=array[array.length-1];
			for(int j=array.length-1;j>0;j--) {
				array[j]=array[j-1];
			}
			array[0]=temp;
		}
		return array;
	}
}
