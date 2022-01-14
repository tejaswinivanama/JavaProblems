package com.tej.problems;

import java.util.ArrayList;

public class FibonacciNth {
	public static void main(String[] args) {
		System.out.println(findNthFibonacci(5));
	}
	private static int findNthFibonacci(int n) {
		ArrayList<Integer> aL=new ArrayList<>();
		int res=0;
		int f1=0;
		int f2=1;
		int f3=0;
		aL.add(0);
		aL.add(f1);
		aL.add(f2);
		while(f3<100) {
		f3=f1+f2;
		f1=f2;
		f2=f3;
		//System.out.println(f3);
		aL.add(f3);
		}
		res=aL.get(n);
		return res;
	}
}
