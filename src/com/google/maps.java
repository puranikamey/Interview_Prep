package com.google;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.HashMap;
import java.util.Map;
//import java.lang.Iterable;
public class maps {

	public static Map<Integer, String> mapred (String sd)
	{
		Map<Integer, String > mpd = new HashMap<Integer, String>();
		int i =0;
		
		if (sd.length()!=0) {
			
			mpd.put(i,sd);
					
		}
		
		return mpd;	
		
	}
	public static  void fileread () throws FileNotFoundException {
		
		try {
		String s="";
		String fileloc = "D:/root/sample.txt";
		FileReader fis =new FileReader(fileloc);
	    BufferedReader red = new BufferedReader(fis);
	   
	    while ((s=red.readLine()) != null) {
	    	
	    	
	    	s  += s;
	    }
	    System.out.println(mapred(s));
		red.close();
	    
	    }catch(Exception e) {
	    	System.out.println(e);
	    }
	   
			
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
     fileread();
	
	}	

}
