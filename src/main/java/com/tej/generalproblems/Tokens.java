package com.tej.generalproblems;

import java.util.Scanner;

public class Tokens {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        // Write your code here.
	        String delimiters="[!?.,_'@\\s]+";
	        
	        String[] c=s.split(delimiters);
	        System.out.println(c.length);
	        for(String c1:c){
	            System.out.println(c1);
	        }
	        scan.close();
	    }
}
