package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		ArrayList<Integer> aList=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			aList.add(i);
		}
		for(int i=0;i<5;i++) {
			aList.add(i);
		}
		findDuplicates(aList);
	}

	private static void findDuplicates(ArrayList<Integer> list) {

		HashMap<Integer,Integer> map=new HashMap<>();
		if(list.isEmpty()) {			
			return;
		}
		for(int i=0;i<list.size();i++) {
			if(map.containsKey(list.get(i))) {
				map.put(list.get(i), map.get(list.get(i))+1);
			}else {
				map.put(list.get(i), 1);
			}
		}
		System.out.println(map);
		for(Map.Entry<Integer, Integer> m:map.entrySet()) {
			if(m.getValue()>1) {
				System.out.println(m.getKey() + "  " + m.getValue());
			}
		}

	}
}
