package com.tej.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class FindTripletsofSum {

	public static void main(String[] args) {
		findTripletsOfGivenSum(new int[] {7, 5, 9, 3, 0, 8, 6},12);
	}

	private static void findTripletsOfGivenSum(int[] array,int reqSum) {

		for(int i=0;i<array.length-1;i++) {
			HashSet<Integer> hash_set=new HashSet<>();
			for(int j=i+1;j<array.length;j++) {
				if(hash_set.contains(reqSum-(array[i]+array[j]))){
					System.out.println("["+array[i]+" " + array[j] + " " + (reqSum-(array[i]+array[j])) + "]");
				}
				else {
					hash_set.add(array[j]);
				}
			}
		}
	}
}
