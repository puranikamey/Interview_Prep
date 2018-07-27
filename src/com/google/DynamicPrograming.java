package com.google;

import java.util.ArrayList;
import java.util.Iterator;

public class DynamicPrograming {
	public static ArrayList <Long> store = new ArrayList <Long>();
	
	 static void dp(long io1, long io2) {
		
		long j;
		int Limit =0;
		
		j=io1 + io2 ;
		store.add(j);
		utility(io2, j);
		//return dp(io2, j);
		
		
		//return j; 
	} 
	
	 static void utility(long io1, long io2) {
		
		 long j;
			int Limit =0;
			
			j=io1 + io2 ;
			store.add(j);
	      dp(io2, j);
		
	}
	
	 static void uti() {
			
			Iterator <Long>il= store.iterator();
			while(il.hasNext()){
				long d= il.next();
				System.out.println(d);
				
			}
			
		}
	
	public static void main(String[] args) {
		long i=2;
		long m=3;
		store.add(i);
		store.add(m);
		new DynamicPrograming().dp(i, m);
		uti();

	}

}
