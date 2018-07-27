package com.google;

import java.util.ArrayList;
import java.util.HashMap;

public class testtoday {
	
	public class multiply{


		public String  s[]= null;
		public String  d[]= null;
		public ArrayList<Integer> al = new ArrayList<Integer>();

		public static String multiply(String a, String b)
		{
		 //long h = Long.parselong(a);
		for(char d : a)
		{
		int result1 =  ((int) d - ‘0’) * (int) (b.charAt(b.length-1) - ‘0’);
		// ‘0’

		s = String.valueOf(result);
		//10 /12
		}

		for(char d : a)
		{
		int result2 =  ((int) d - ‘0’) * (int) (b.charAt(b.length-2) - ‘0’);
		// ‘0’

		d = String.valueOf(result);
		//10 /12
		}


		for (int i=0; i<=s.length-1; i++){

		for (char a: s[i] )
		  int result = (int) a + (int) (s[i+1].charAt(0) - ‘0’);
		  al.put(result);
		  

		}
		for (int j=0; j<=s.length-1; j++){

		for (char a: d[i] )
		  int result = (int) a + (int) (d[i+1].charAt(0) - ‘0’);
		  al.put(result);
		  

		}
		int finalresult =0;
		Iterator <Integer> ite= al.Iterator();
		while(ite.hasNext())
		{
		finalresult = ite.next();
		finalresult += finalresult;


		}

		System.out.println(finalresultresult);


		}

		}

	public static void main(String[] args) {
		
		int t []= {2, 4, 1, 6, 5, 40, -1};
		
		//int d= 3;
		
		new testtoday().dd(t);
       
      
		
	}

}
