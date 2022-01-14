package com.tej.problems;

public class ReverseSubstrings {
public static void main(String[] args) {
	System.out.println(reverseSubstr("abc def"));
}

private static StringBuilder reverseSubstr(String s) {
	StringBuilder res=new StringBuilder();
	
	String[] sArray=s.split(" ");
	
	for(int i=sArray.length-1;i>=0;i--) {
		String word=sArray[i];
		StringBuilder reverseWord=new StringBuilder();
		for(int j=word.length()-1;j>=0;j--) {
		reverseWord.append(word.charAt(j));
		}
		res.append(reverseWord).append(" ");
	}
	
	
	
	
	return res;
}
}
