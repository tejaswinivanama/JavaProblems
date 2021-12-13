package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = new ArrayList<>();

		for(int i=0;i<10;i++) {
			listOfIntegers.add(i);
		}

		for(int j=0;j<5;j++) {
			listOfIntegers.add(j);
		}


		List<Integer> output=findDuplicates(listOfIntegers); 
		for(int j:output) {
			System.out.println(j + ""); }

	}


	public static List<Integer> findDuplicates(List<Integer> dup) {

		Set<Integer> fullSet = new HashSet<Integer>();
		List<Integer> dupSet = new	ArrayList<>();

		for(int i : dup) { 
			if(!fullSet.add(i)) 
			{
				dupSet.add(i); 
			}
		}

		return dupSet; 
	}


}
