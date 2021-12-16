package com;

import java.util.ArrayList;

import org.apache.http.util.Asserts;

import io.jsonwebtoken.lang.Assert;

public class StringSplit {
	public static void main(String[] args) {
		String str="#tom@100#steve@200#tej@300";
		ArrayList<String> nameArray=new ArrayList<>();
		ArrayList<String> numberArray= new ArrayList<>();
		String[] inner= {};
		String[] outer=str.split("#");
		for(int i=0;i<outer.length;i++) {
			//System.out.println(outer[i]);
			inner=outer[i].split("@");


			for(int j=0;j<inner.length;j++) {
				System.out.println(inner[j]);

				if(inner[j].matches("[a-zA-Z]+")) { 
					nameArray.add(inner[j]); 
				}else  { 
					numberArray.add(inner[j]); 
				
				}

			}

		}
		for(String s:nameArray) {
			System.out.println(s);
		
		}
		for(String s1:numberArray) {
			System.out.println(s1);
		}
		
	}
}
