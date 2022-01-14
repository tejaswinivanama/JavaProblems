package com.tej.generalproblems;

import java.util.Arrays;
import java.util.HashMap;

public class Leetcode347 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(topKFrequent(new int[] {1,1,1,2,2,3},2)));
		
	}
	public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int j=0,m=0;
        int[] a=new int[20] ;
        int[] res=new int[k];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        System.out.println(map.toString());
        
        for(int i:map.values()){
            a[j]=i;
            j++;
        }
        Arrays.sort(a);
        int p=a.length;
       while(m<k) {
    	   res[m]=map.get(a[p-1]);
    	   p--;
    	   m++;
       }
        return res;
    }
}
