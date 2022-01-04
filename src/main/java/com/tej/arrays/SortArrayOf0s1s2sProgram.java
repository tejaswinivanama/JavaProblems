package com.tej.arrays;

import java.util.Arrays;

public class SortArrayOf0s1s2sProgram {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortArrays(new int[] {1, 0, 2, 2, 0, 2, 1, 2, 1, 1, 2, 0})));
	}
	private static int[] sortArrays(int[] array){
		
		int low=0;
		int mid=0;
		int high=array.length-1;
		
		while(mid<=high) {
			if(array[mid]==0) {
				swap(array,low,mid);
				low++;
				mid++;
			}
			
			if(array[mid]==2) {
				swap(array,mid,high);
				high--;
			}
			
			else {
				mid++;
			}
		}
		return array;
	}
	
	private static void swap(int[] a,int low,int high) {
		int temp=a[low];
		a[low]=a[high];
		a[high]=temp;
	}
}
