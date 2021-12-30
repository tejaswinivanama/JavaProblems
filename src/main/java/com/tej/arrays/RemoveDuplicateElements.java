package com.tej.arrays;

import java.util.HashSet;

public class RemoveDuplicateElements {
public static void main(String[] args) {
	int[] a=new int[] {7, 3, 21, 7, 34, 18, 3, 21};
	removeDuplicates(a);
}

public static void removeDuplicates(int[] array) {
	HashSet<Integer> hashSet=new HashSet<>();
	for(int i=0;i<array.length;i++) {
		if(!hashSet.add(array[i])) {
			System.out.println(array[i]);
		}
	}
}
}
