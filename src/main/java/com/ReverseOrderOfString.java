package com;

public class ReverseOrderOfString {

	public static void main(String[] args) {
		revOrderOfWords(null);
	}

	public static StringBuilder revOrderOfWords(String input) {
		StringBuilder s1=new StringBuilder();
		if(input !=null) {
		String[] sarr = input.split(" ");
		for(int i=sarr.length-1;i>=0;i--) {
		   s1.append(sarr[i]).append(" ");
		}
		System.out.println(s1);
	}
		return s1;
	}
}
