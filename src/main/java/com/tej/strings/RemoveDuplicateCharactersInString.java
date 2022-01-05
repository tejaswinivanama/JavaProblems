package com.tej.strings;

import java.util.HashSet;

public class RemoveDuplicateCharactersInString {

	public static void main(String[] args) {
		String s="abc tejjaswini";
		
		char[] cArray=s.replace("\s", "").toCharArray();
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<cArray.length;i++) {
			set.add(cArray[i]);
		}
		
		for(char c:set) {
			System.out.print(c);
		}
	}
}
