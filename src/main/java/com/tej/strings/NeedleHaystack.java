package com.tej.strings;

import java.util.ArrayList;

public class NeedleHaystack {

	 public static int strStr(String haystack, String needle) {
	        ArrayList<String> sL=new ArrayList<>();
	        int found=-1;
	        if(needle.isEmpty() || haystack.isEmpty()){
	            found=0;
	        }
	        for(int i=0; i<haystack.length(); i++){
	        	for(int j=i+1;j<=haystack.length();j++) {
	        		sL.add(haystack.substring(i,j));
	        	}
	            
	        }
			
			  for(int i=0;i<sL.size();i++) {
				  System.out.println(sL.get(i));
				  }
			 
	        for(int i=0;i<sL.size();i++){
	        	String s1=sL.get(i);
	            if(s1.equals(needle)){
	                found= haystack.indexOf(s1);
	            }
	        }
	        return found;
	    }
	 
	 public static void main(String[] args) {
		 System.out.println(strStr("hello","ll"));
	}
}
