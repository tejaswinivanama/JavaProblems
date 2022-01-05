package com.tej.generalproblems;


import java.util.Arrays;

public class Arrayproblem {


	public static void main(String[] args) {
		int a[]= {0,0,9,9,1};

		nthLargest(a, 2);
	}

	public static void nthLargest(int a[],int n) {

		/*
		 * Arrays.sort(a); System.out.println(a[n-1]);
		 */
		if(a== null) {
			System.out.println("no aray passed");
		}
		if(a.length==1) {
			System.out.println(a);
		}

		int t=0;

		for(int j=0;j<a.length;j++)
		{ 
			for(int k=0;k<a.length;k++)
			{
				if(a[j]>a[k]) {
					t=a[j]; 
					a[j]=a[k]; 
					a[k]=t; 
				} 
			} 
		} 
		if(n<=a.length) { 
			System.out.println(a[n]);

		}else {
			System.out.println("out f bounds");
		}

	}
}
