package com.tej.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortArrayElementsByFrequency {
	public static void main(String[] args) {
		SortArrayElementsByFrequency(new int[] {7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3});
	}

	static void SortArrayElementsByFrequency(int[] a) {

		HashMap<Integer,Integer> map=new HashMap<>();


		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}

		ArrayList<Entry<Integer,Integer>> aList=new ArrayList<>(map.entrySet());
		Collections.sort(aList,new Comparator<Entry<Integer,Integer>>(){
			public int compare(Entry<Integer,Integer> o1,Entry<Integer,Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		}
				);

		for(Map.Entry<Integer,Integer> m:aList) {
			int frequency=m.getValue();
			while(frequency>=1) {
				System.out.print(m.getKey() + " ");
				frequency--;
			}
		}
		//System.out.println(aList.toString());
	}
}
