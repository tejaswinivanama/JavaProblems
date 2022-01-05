package com.tej.generalproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Substringmanipulations {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int n=scan.nextInt();
		
		
		System.out.println(getSmallestLargestSubstrings(s,n));
		
	}
	
	static String getSmallestLargestSubstrings(String s,int n) {
		String smallest=s.substring(0, n);
		String largest="";
		int max=s.length()-n+1;
		for(int i=0;i<max;i++) {
			if(s.substring(i, i+n).compareTo(smallest)<0) {
				smallest=s.substring(i,i+n);
			}else if(s.substring(i, i+n).compareTo(largest)>0) {
				largest=s.substring(i,i+n);
			}
		}
		
		return smallest + " "+ largest;
	}

	/*
	 * public static void main(String[] args) { String s1=null; Scanner in = new
	 * Scanner(System.in); String S = in.next(); int start = in.nextInt(); int end =
	 * in.nextInt(); for(int i=start;i<end-1;i++) { s1= S.substring(start, end); }
	 * System.out.println(s1); }
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * Scanner scan = new Scanner(System.in); String string = scan.next(); int size
	 * = scan.nextInt();
	 * 
	 * List<String> list = new LinkedList<>();
	 * 
	 * final int max = string.length() - size; for (int i = 0; i <= max; i++) {
	 * list.add(string.substring(i, i + size)); }
	 * 
	 * System.out.println(Collections.min(list));
	 * System.out.println(Collections.max(list)); // return Collections.min(list)+
	 * " " + Collections.max(list); }
	 */
}
