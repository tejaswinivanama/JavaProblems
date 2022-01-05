package com.tej.strings;

import java.util.HashMap;

public class Anagram {
	public static void main(String[] args) {
		isAnagram("Mother In Laww", "Hitler Woman");
	}
	private static void isAnagram(String s1,String s2) {
		boolean status=true;
		s1=s1.replace("\s", "").toLowerCase();
		s2=s2.replace("\s", "").toLowerCase();
		
		if(s1.length()!=s2.length()) {
			status=false;
		}
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s1.length();i++) {
			if(map.containsKey(s1.charAt(i))) {
				map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
			}
			map.put(s1.charAt(i), 1);
		}
		
		for(int i=0;i<s2.length();i++) {
			if(map.containsKey(s2.charAt(i))) {
				map.put(s2.charAt(i), map.get(s2.charAt(i))-1);
			}
		}
		for(int v:map.values()) {
			if(v!=0) {
				status=false;
				break;
			}
		}
		
		if(status) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}
}
