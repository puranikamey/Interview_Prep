package com.google;

import java.util.*;
import java.io.*;
import java.util.Iterator;
import java.util.Map.Entry;
public class Mapsimpe {

	
public static   HashMap <String, String> hm = new HashMap <String, String>();
public static LinkedHashMap<String, String> lhm = new LinkedHashMap <String, String>();

	public static void main(String[] args) {
     new Mapsimpe().file_reader();
    System.out.println("Hashmap values===");
    Mapsimpe.iterator(lhm);
    System.out.println("Linkedmap values===");
    hm.putAll(lhm);
    Mapsimpe.iterator(hm);
    
    lhm.get("22");
    System.out.println("Linkedmap values===");
    Mapsimpe.iterator(lhm);
     
     
	}
	
	public static  void file_reader() {
		
		
		String loc ="D:/root/root.txt";
		try {
		
		FileReader fre = new  FileReader(loc);
		BufferedReader br= new BufferedReader(fre);
		String s =br.readLine();
		while((s=br.readLine())!=null) 
		  {
			
			String key = String.valueOf(s.substring(0, 2));
		String Value = s.substring(3, s.length()-1);
		lhm.put(key, Value);
		
			System.out.println(key + Value);
			
	       }
	
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static void iterator(HashMap <String, String> h) {
		for (HashMap.Entry<String, String> entry : h.entrySet()  ) {
			System.out.println("Key=" + entry.getKey() + "  value : " + entry.getValue() );	
		}

			
		};
		
		
		

	
	
	
	
}
