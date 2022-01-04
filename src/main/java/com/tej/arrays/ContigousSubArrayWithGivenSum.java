package com.tej.arrays;

public class ContigousSubArrayWithGivenSum {
	public static void main(String[] args) {
		contiguousSubArrayWithSum(new int[] {2, 4, 2, 8, 3, 3, 2, -4, 12}, 8);
	}

	private static void contiguousSubArrayWithSum(int[] array,int reqSum) {
		int currentSum=0;
		int currentStart=0;
		int currentEnd=0;

		for(int i=0;i<array.length;i++) {

			currentSum=currentSum+array[i];

			if(currentSum==reqSum) {
				currentEnd=i;
				printArray(array,currentStart,currentEnd);
				currentSum=0;
				currentStart=i+1;
			}

		}
	}

	public static void printArray(int[] a,int start,int end) {

		System.out.print("[");
		for(int i=start;i<=end;i++) {
			System.out.print(" "+a[i]);
		}
		System.out.print(" ]");
	}



}
