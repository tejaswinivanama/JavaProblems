package com.tej.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class PairsOfElementsArray {

	//Java program to find all pairs of elements in an integer 
	//array whose sum is equal to a given number
	public static void main(String[] args) {
		int[] res=findPairsOfElements(new int[] {4, 6, 5, -10, 8, 5, 20},11);
		System.out.println(Arrays.toString(res));
	}

	private static int[] findPairsOfElements(int[] a,int sum){
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			int complement=sum-a[i];
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
			}
			map.put(a[i], i);
		}
		return new int[] {};
	}
}
