package com.tej.generalproblems;

import java.util.Scanner;

public class printMultiplcationTable {

	public static void main(String []argh){
		
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int n=0,a=0,b=0;
        for(int i=0;i<t;i++){
             a = in.nextInt();
             b = in.nextInt();
             n = in.nextInt();
             for(int j=0;j<n;j++){
            a+=b;
            if(j>0){
                System.out.print(" ");
            }
            System.out.print(a);
            b=b*2;
        }
        System.out.println("");
        }
        in.close();
        
    }
}
