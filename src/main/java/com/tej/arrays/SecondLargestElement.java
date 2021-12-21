package com.tej.arrays;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] a= {11,10,9,0};
		findSecondLargestElement(a);
	}
	private static void findSecondLargestElement(int[] a) {		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(a[a.length-2]);
	}
}
