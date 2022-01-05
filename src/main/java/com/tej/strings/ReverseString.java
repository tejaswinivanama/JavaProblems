package com.tej.strings;

public class ReverseString {

	private static void stringRev(String s) {
		if(s.length()<1 || s==null) {
			return;
		}
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
	public static void main(String[] args) {
		stringRev("tejaswi");
	}
}
