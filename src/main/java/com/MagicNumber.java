package com;

public class MagicNumber {
	
	    public static int magicNumber(int n) {
	    	int sum=0;
	    	int x=0;
	        while(n>9){	 
	        	 x=n;
	        	while(x!=0) {
		            sum=sum+(x%10);
		            x=x/10;
	        }
	        	n=sum;
	        }
	        return sum;
	    }
	    public static void main(String[] args) {
	    	System.out.println(magicNumber(39));
		}
	    
}
