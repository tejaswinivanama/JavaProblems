package com.tej.arrays;

public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		int n = arr.length;

		quickSort(arr, 0, n - 1);

	}

	private static void swap(int[] arr ,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	private static void quickSort(int[] arr,int low,int high) {
		if(low<high) {
			int p=partition(arr,low,high);
			quickSort(arr,low,p-1);
			quickSort(arr,p+1,high);
		}
	}
	
	private static int partition(int[] arr,int low,int high ) {
		
		int pivot=arr[high];
		int i=low-1;
		
		for(int j=low;j<high-1;j++) {
			if(arr[j]<pivot) {
				i++;
				
				
			}
			swap(arr,i,j);
					
		}
		return(i+1);
	}
}
