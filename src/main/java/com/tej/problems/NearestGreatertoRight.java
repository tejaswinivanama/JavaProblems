package com.tej.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class NearestGreatertoRight {

	public static void main(String[] args) {
		int[] a= {1,3,2,4};
		System.out.println(Arrays.toString(findNearestGreatertoRightBF(a)));

	}
	
	private static int[] findNearestGreatertoRightBF(int[] a) {
		int n=a.length;
		int[] result=new int[n];
		
		for(int i=0;i<n-1;i++) {
			
			for(int j=i+1;j<n;j++) {
				
				if(a[j]>a[i]) {
					result[i]=a[j];
					break;
				}
			}
		}
		return result;
	}

	private static int[] findNearestGreatertoRight(int[] a) {
		//a[]-empty -1
		//traverse i 
		if(a==null) {
			return a;
		}

		int n=a.length;
		int[] opArr=new int[n];
		Stack<Integer> s = new Stack<>();
		Arrays.fill(opArr, -1);

		for(int i=a.length-1;i>=0;i--) {
			while(!s.empty()) {
				if(s.peek()<=a[i]) {
					s.pop();
				}
				else if(s.peek()>a[i]){
					opArr[i]=s.peek();
					break;
				}
			}
			s.push(a[i]);	
		}	
		return opArr;
	}

}
