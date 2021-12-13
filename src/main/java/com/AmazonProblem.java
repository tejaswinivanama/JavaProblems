package com;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class AmazonProblem {

	//Write a code that takes in a country and 
	//returns the correct amazon URL for that country.
	//You can assume that there is some sort of library where all the URLs are stored.
	
	public static void getCountryURL(String countryName) {
		//select url from c where name="india"
		Map<String,String> countries = new HashMap<String,String>();
		for(String iso:Locale.getISOCountries()) {
			Locale l = new Locale("",iso);
			countries.put(l.getDisplayCountry(), iso);
		}
		System.out.println(countries.get(countryName));
	}
	
	public static void main(String[] args) {
		getCountryURL("United States");
	}
}
