package com.tej.arrays;

import io.jsonwebtoken.lang.Objects;

public class CheckEqualityArrays {

	public static void main(String[] args) {
		int[] a1= {3,1,4,5};
		int[] a2= {3,1,4,5};
		checkEqualityOfTwoArrays(a1,a2);
	}

	private static void checkEqualityOfTwoArrays(int[] b1,int[] b2) {
		boolean flag=true;

		if(b1.length!=b2.length) {
			return;
		}
		if(b1==null || b2==null) {
			return;
		}
		for(int i=0;i<b1.length-1;i++) {
			if(b1[i]!=b2[i]) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("equal");
		}else {
			System.out.println(" not equal");
		}
	}
}
