package com.tej.generalproblems;

public class PairWithLargestDifference {
	public static void main(String[] args) {
		int m=findPairWithLargestDifference(new int[] {1,5,7,9,2});
		System.out.println(m);
	}
	
	private static int findPairWithLargestDifference(int[] a) {
		int min=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if((a[j]-a[i])>min) {
					min=a[j]-a[i];
				}
			}
		}
		return min;
	}
}
