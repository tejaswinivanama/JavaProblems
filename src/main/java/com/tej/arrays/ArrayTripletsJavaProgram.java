package com.tej.arrays;

import java.util.HashSet;

public class ArrayTripletsJavaProgram {
	public static void main(String[] args) {
		findArrayTriplets(new int[] {21, 13, 47, 61, 34, 40, 55, 71, 87});
	}
	private static void findArrayTriplets(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			HashSet<Integer> hashSet=new HashSet<>();
			for(int j=i+1;j<array.length;j++) {
				if(hashSet.contains(array[i]+array[j])) {
					System.out.println("["+array[i]+" " + array[j] + " " +(array[i]+array[j])+" ]");
				}else {
					hashSet.add(array[j]);
				}
			}
		}
	}
}
