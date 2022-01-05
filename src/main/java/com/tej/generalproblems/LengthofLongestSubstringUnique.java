package com.tej.generalproblems;

import java.util.HashSet;

public class LengthofLongestSubstringUnique {

	public static int LengthOfLongestSubstring(String s){
		int max=0;
		int i=0;
		int j=0;

		HashSet<Character> set=new HashSet<>();
		while(j<s.length()) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				max=Math.max(max, set.size());
				j++;
			}else {
				set.remove(s.charAt(i));
				i++;
			}
		}
		
		return max;

	}
	public static void main(String[] args) {
		System.out.println(LengthOfLongestSubstring("abcabcbb"));
	}
}
