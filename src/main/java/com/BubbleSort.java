package com;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a= {64, 34, 25, 12, 22, 11, 90};
		int[] result=bubbleSort(a);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+ " ");
		}
	}
	
	private static int[] bubbleSort(int[] x) {
		
		
		for(int i=0;i<x.length-1;i++) {
			for(int j=0;j<x.length-i-1;j++) {
				if(x[j]>x[j+1]) {
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		
		
		return x;
	}
}
