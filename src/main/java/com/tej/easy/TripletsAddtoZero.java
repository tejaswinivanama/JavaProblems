package com.tej.easy;

import java.util.HashSet;

public class TripletsAddtoZero {
	public static void main(String[] args) {
		findTriplets(new int[] {-1,0,1,2,-1,-4});
	}
	private static void findTriplets(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			HashSet<Integer> set=new HashSet<>();
			for(int j=i+1;j<a.length;j++) {
				if(set.contains(-(a[i]+a[j]))) {
					System.out.println(a[i] + " " + a[j]+" "+ (a[i]+a[j]));
				}else {
					set.add(a[j]);
				}
			}
		}
	}
}
