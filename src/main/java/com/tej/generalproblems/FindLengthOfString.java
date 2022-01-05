package com.tej.generalproblems;

public class FindLengthOfString {

	public static void main(String[] args) {
		String str="I am awesome";
		int count=0;
		char[] c=str.toCharArray();
		for(char c1:c) {
			count++;
		}
		System.out.println(count);
	}
}
