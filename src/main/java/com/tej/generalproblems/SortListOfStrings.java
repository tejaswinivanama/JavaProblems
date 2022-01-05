package com.tej.generalproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class SortListOfStrings {

	public static void main(String[] args) {
		String[] list= {"abc","xyz","def"};
		sortStrings(list);
		
	}
	private static void sortStrings(String[] l) {
		Arrays.sort(l);
		for(String s:l) {
			System.out.println(s);
		}
		
		
	}
}
