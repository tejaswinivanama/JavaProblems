package com.tej.generalproblems;

import java.util.HashSet;

public class LengthOfLongestSubstring {

	public static int lengthOfLongestSubstr(String s) {
		int i=0;
		int j=0;
		int max=0;
		
		HashSet<Character> hash_set = new HashSet<Character>();
		
		while(j<s.length()) {
			if(!hash_set.contains(s.charAt(j))) {
				hash_set.add(s.charAt(j));
				j++;
				max=Math.max(hash_set.size(), max);
			}else {
				hash_set.remove(s.charAt(i));
				i++;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		
	}
	
	
	public static int lengthOfLongestSubstring(String s) {
		
		int leftPointer=0;
		int rightPointer=0;
		int max=0;
		
		HashSet<Character> hash_set=new HashSet<Character>();
		
		if(s.length() < 0) {
			return 0;
		}
		
		if(s.length()==1) {
			return 1;
		}
		
		while(rightPointer<s.length()) {
		if(!hash_set.contains(s.charAt(rightPointer))) {
			hash_set.add(s.charAt(rightPointer++));
			max=Math.max(max, hash_set.size());
			
		}
		else {
			hash_set.remove(s.charAt(leftPointer++));
		}
		}
		return max;
	}
}
