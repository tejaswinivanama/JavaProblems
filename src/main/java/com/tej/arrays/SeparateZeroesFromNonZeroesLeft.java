package com.tej.arrays;

import java.util.Arrays;

public class SeparateZeroesFromNonZeroesLeft {

	public static void main(String[] args) {
		moveZeroesToLeft(new int[] {2,3,5,6,0,0});
	}

	private static void moveZeroesToLeft(int[] array) {
		int counter=array.length-1;
		for(int i=array.length-1;i>=0;i--) {
			if(array[i]!=0) {
				array[counter]=array[i];
				counter--;
			}
		}
		while(counter>=0) {
			array[counter]=0;
			counter--;
		}
		System.out.println(Arrays.toString(array));
	}
}
