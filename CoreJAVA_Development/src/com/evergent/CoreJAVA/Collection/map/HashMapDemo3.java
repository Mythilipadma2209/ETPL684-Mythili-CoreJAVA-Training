package com.evergent.CoreJAVA.Collection.map;
import java.util.HashMap;
public class HashMapDemo3 {

	public static void main(String[] args) {
		HashMap<String,String> CapitalCities=new HashMap<String,String>();
		CapitalCities.put("India","Delhi");
		CapitalCities.put("USA","Wahington");
		CapitalCities.put("Germany","Berlin");
		CapitalCities.put("India","Delhi");
		System.out.println(CapitalCities);
	    for (String i : CapitalCities.keySet()) {
	    	System.out.println(i);
	    }
	}
}
