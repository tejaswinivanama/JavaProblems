package com.tej.arrays;

import java.util.HashSet;

public class CommonElements {
	//Java program to find the intersection of two arrays
	public static void main(String[] args) {
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
		findCommonElements(s1,s2);
	}
	private static void findCommonElements(String[] a, String[] b) {
		HashSet<String> res=new HashSet<String>();
		if(!(a==null||b==null)) {
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<b.length;j++) {
					if(a[i].equalsIgnoreCase(b[j])) {
						res.add(a[i]);
					}
				}
			}
		}System.out.println(res);


	}
}
