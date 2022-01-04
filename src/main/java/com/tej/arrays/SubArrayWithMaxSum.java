package com.tej.arrays;

public class SubArrayWithMaxSum {
 public static void main(String[] args) {
	int[] a=new int[] {2, -3, 7, -4, 2, 5, -8, 6, -1};
	subArrayWithMaxSum(a);
}
 
 private static void subArrayWithMaxSum(int[] array) {
	 int currentSum=0;
	 int currentStart=0;
	 int bestSum=array[0];
	 int bestStart=0;
	 int bestEnd=0;
	 
	 
	 for(int i=0;i<array.length;i++) {
		 currentSum=currentSum+array[i];
		 
		 if(currentSum<0) {
			 currentSum=0;
			 currentStart=i+1;
		 }
		 
		 else if(currentSum>bestSum) {
			 bestSum=currentSum;
			 bestStart = currentStart;
			 bestEnd = i;
		 }
	 }
	 
	 for(int i=bestStart;i<=bestEnd;i++) {
		 System.out.print(array[i]+" ");
	 }
 }
}
