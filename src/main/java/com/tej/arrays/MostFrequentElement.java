package com.tej.arrays;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
	public static void main(String[] args) {
		int[] a=new int[] {4, 5, 8, 7, 4, 7, 6,7};
		System.out.println(mostFrequentElementProgram(a));
	}

	public static int mostFrequentElementProgram(int[] array) {
		int max=0;
		int frequentElement=0;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++) {
			if(map.containsKey(array[i])) {
				map.put(array[i],map.get(array[i])+1);
			}else {
				map.put(array[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue()>max) {
				max=entry.getValue();
				frequentElement=entry.getKey();
			}
		}
		
		System.out.println(map.toString());
		return frequentElement;
	}
}


