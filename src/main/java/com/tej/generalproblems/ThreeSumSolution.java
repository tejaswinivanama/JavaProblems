package com.tej.generalproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ThreeSumSolution {

	public static void main(String []argh)
    {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       in.nextLine();
       HashMap<String,Integer> map=new HashMap<>(n);
       for(int i=0;i<n;i++) {
    	   String name=in.next();
    	   int contact=in.nextInt();
    	   in.nextLine();
    	   map.put(name, contact);
       }
       while(in.hasNext()) {
    	   String toFind=in.nextLine();
    	   try {
    		   int con=map.get(toFind);
    		   System.out.println(toFind + "=" + con);
    	   }catch(Exception e) {
    		   System.out.println("Not Found");
    	   }
       }
    }
}