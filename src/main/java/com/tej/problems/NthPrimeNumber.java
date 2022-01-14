package com.tej.problems;

import java.util.ArrayList;

public class NthPrimeNumber {
	public static void main(String[] args) {
		System.out.println(findNthPrime(5));
	}

	private static int findNthPrime(int n) {
		int res=0;

		ArrayList<Integer> primeList=new ArrayList<>();

		for(int i=2;i<100;i++) {
			if(primeList.size()<=n && isPrime(i)) {
				primeList.add(i);
			}
		}
		System.out.println(primeList.toString());
		res=primeList.get(n);
		return res;

	}

	private static boolean isPrime(int number) {
		boolean primeFlag=true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				primeFlag=false;
				break;
			}
		}
		return primeFlag;

	}
}
