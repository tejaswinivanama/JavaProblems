package com.tej.arrays;

import java.util.Arrays;

public class ArrayRotationLeft {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(leftRotate(new int[] {1,2,3,4,5,6},2)));
	}
	
	private static int[] leftRotate(int[] array,int positions) {
		int temp;
		for(int i=0;i<positions;i++) {
			temp=array[0];
			for(int j=0;j<array.length-1;j++) {
				array[j]=array[j+1];
			}
			array[array.length-1]=temp;
		}
		return array;
	}
}
