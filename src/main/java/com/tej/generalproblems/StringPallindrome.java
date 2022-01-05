package com.tej.generalproblems;

import java.util.Scanner;

public class StringPallindrome {

public static void main(String[] args) {
        
	 Scanner sc=new Scanner(System.in);
     String A=sc.next();
     boolean flag=false;
         if(A!=null && A.length()>1){
         int mid=A.length()/2;
         for(int i=0;i<mid;i++) {
             flag=false;
             if(A.charAt(i)==A.charAt(A.length()-i-1)) {
                 flag=true;
             }
             
         }if(flag) {
             System.out.println("Yes");
         }else {
             System.out.println("No");
         }
         }else{
             System.out.println("Yes");
         }sc.close();
     }
}