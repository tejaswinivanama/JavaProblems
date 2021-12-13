package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDuplicateswithMap {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			listOfIntegers.add(i);
		}
		
		for(int i=0;i<5;i++) {
			listOfIntegers.add(i);
		}
		
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		findDuplicateswithMap(listOfIntegers);
		
		
	}
	
	public static void findDuplicateswithMap(List<Integer> dup){
		Map<Integer,Integer> intMap=new HashMap<Integer,Integer>();
		if(dup.isEmpty()) {
			return;
		}
		
		if(dup.size()==1) {
			return;
		}
		
		
		for(int x : dup) {
			if(intMap.containsKey(x)) {
				intMap.put(x,intMap.get(x)+1);
				
			}else {
				intMap.put(x,1);
			}
		}
		for(Map.Entry<Integer,Integer> m1:intMap.entrySet()) {
			if(m1.getValue()>1) {
				
			System.out.println(m1.getKey() + " " + m1.getValue());
		}
		}
	}
}
