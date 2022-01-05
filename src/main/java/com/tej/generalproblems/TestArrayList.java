package com.tej.generalproblems;

import java.util.Arrays;
import java.util.List;

public class TestArrayList {

	
	public static void main(String[] args) {
		String[] a= new String[]{"a","b",""};
		List<String> b =Arrays.asList(a);
		System.out.println(b);
		a[1]="c";
		System.out.println(b);
		
	}
}
