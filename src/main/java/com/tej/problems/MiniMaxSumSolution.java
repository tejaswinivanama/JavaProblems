package com.tej.problems;

import java.util.Scanner;

public class MiniMaxSumSolution {
	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
		long[] m = new long[arr.length];
		long sum = 0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
		for(int i = 0; i < arr.length; i++){
			m[i] = sum - arr[i];
		}
		long min = m[0];
		long max = m[0];
		for(int k=1;k<arr.length;k++){
			if(m[k]<min){
				min=m[k];
			}
			if(m[k]>max){
				max=m[k];
			}
		}
		System.out.print(min + " " + max);
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println("Enter nums");
		//String[] arrItems = scanner.nextLine().split(" ");
		//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 5; i++) {
			//int arrItem = Integer.parseInt(arrItems[i]);
			arr[i]=scanner.nextInt();
			
		}

		miniMaxSum(arr);

		scanner.close();
	}
}
