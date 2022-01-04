package com.tej.arrays;

import java.util.Arrays;

public class SortBinaryArray {

	public static void main(String[] args) {
		System.out.print(Arrays.toString(sortArray(new int[] {1,0,0,1,1,1})));
	}
	
	private static int[] sortArray(int[] a) {
		int left=0;
		int right=a.length-1;
		
		while(left<right) {
			if(a[left]==1) {
				//swap
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				right--;
			}
			else {
				left++;
			}
		}
		return a;
	}
}
