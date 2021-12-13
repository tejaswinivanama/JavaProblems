package com;


import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		
		boolean ret;
		try {
			ret = isAnagram(a, b);
			System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		} catch (IllegalArgumentException e) {
			System.out.println("Enter strings of length>0");
			e.printStackTrace();
		}scan.close();

	}


	static boolean isAnagram(String a, String b) throws IllegalArgumentException {
		// Complete the function
		java.util.HashMap<Character,Integer> map=new java.util.HashMap<>();


		if(a==null || b==null || a.equals("") || b.equals("")) {
			throw new IllegalArgumentException();
		}
		if(a.length()!=b.length() ){
			return false;
		}

		a=a.toLowerCase();
		b=b.toLowerCase();

		for(int i=0;i<a.length();i++) {
			char letter=a.charAt(i);
			if(map.containsKey(letter)) {
				int frequency=map.get(a.charAt(i));
				map.put(a.charAt(i), ++frequency);
			}else {
				map.put(a.charAt(i), 1);
			}
		}
		for(int j=0;j<b.length();j++) {
			char letter=b.charAt(j);
			if(!map.containsKey(letter)) {
				return false;
			}
			int frequency=map.get(b.charAt(j));
			
			if(frequency==0) {
				return false;
			}else {
				map.put(b.charAt(j),--frequency);
			}
		}
		return true;
	}
}