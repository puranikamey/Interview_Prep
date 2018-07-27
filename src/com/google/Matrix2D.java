package com.google;

import java.util.HashSet;

class Matrix2D {
	static HashSet<Integer> set = new HashSet<>(); ;
	public static void mat(int [] first, int []second ) {
		
		for(int i =0; i<first.length; i++) {
			
			set.add(first[i]);
		}
		ma(second);	
	}
	public static void ma ( int []sd) {
		int count=0;
		for (int j=0; j<sd.length; j++) {
		
			if (set.contains(sd[j])) {
				count ++;
			}	
		}
		if (count==0) {
			
			System.out.println("Yes!! it is disjoint");
		}
		else {
			System.out.println("Nope!! it is not disjoint");
		}
		}
    public static void main(String args[]) 
    {
     int [] fst = {13, 14, 15, 19, 20};	
     int [] sec = {3, 4, 5, 9, 0};	
     mat(fst,sec); 
     
    }
}