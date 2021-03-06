package com.tej.generalproblems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr=new int[] {2,7,11,15};
		int target=9;
		int[] resArray=findTwoSumHM(arr,target);
		System.out.println(Arrays.toString(resArray));
		int[] result=findpattern(arr);
		System.out.println(Arrays.toString(result));
	}
	
	
	static int[] findTwoSum(int[] a,int target) {
		
		//int[] result= new int[2];
		boolean flag=false;
		
		for(int i=0;i<a.length-1;i++) {
			int twoSum=a[i]+a[i+1];
			if(target==twoSum) {
				
				return new int[]{i,i+1};
			}
		}return new int[] {};
		
		
	}
	
	
	static int[] findTwoSumHM(int[] a,int target) {
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<a.length-1;i++) {
			int complement=target-a[i]; 
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
			}else {
				map.put(a[i],i);
			}
		}
		return new int[] {};
	}
	
	
static int[] findpattern(int[] a) {
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<a.length-1;i++) {
			int req=2*i; 
			if(map.containsKey(req)) {
				return new int[] {map.get(req),i};
			}else {
				map.put(a[i],i);
			}
		}
		return new int[] {};
	}
}
