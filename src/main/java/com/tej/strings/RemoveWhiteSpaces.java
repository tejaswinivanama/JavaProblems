package com.tej.strings;

import java.util.Arrays;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String s = "This is Tejaswi";
		String[] array=s.split(" ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
	}
}
