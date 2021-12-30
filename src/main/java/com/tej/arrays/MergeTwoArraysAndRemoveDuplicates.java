package com.tej.arrays;

import java.util.Arrays;

public class MergeTwoArraysAndRemoveDuplicates {

	public static void main(String[] args) {

		int[] a=new int[] {7, -5, 3, 8, -4, 11, -19, 21};
		int[] b=new int[] {6, 13, -7, 0, 11, -4, 3, -5};

		mergeTwoArraysAndRemoveDuplicates(a,b);
	}

	private static void mergeTwoArraysAndRemoveDuplicates(int[] array1,int[] array2) {

		int[] mergedArray=new int[array1.length+array2.length] ;
		int k=0;
		for(int i=0;i<array1.length;i++) {
			mergedArray[k]=array1[i];
			k++;
		}

		for(int i=0;i<array2.length;i++) {
			mergedArray[k]=array2[i];
			k++;
		}
		System.out.print(Arrays.toString(sortTechnique(mergedArray)));
	}	


	private static int[] sortTechnique(int[] a) {

		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
}
