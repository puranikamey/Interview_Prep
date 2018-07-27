package com.google;

import java.util.HashMap;

public class arrayimp {

	public static void main(String[] args) {
		
	stud [] arr = new stud[5];
	HashMap <Integer, Integer> dd= new HashMap<Integer, Integer>();
	
	arr[0]= new stud(2);
	arr[1]= new stud(4);
	arr[2]= new stud(7);
	arr[3]= new stud(2);
	arr[4]= new stud(3);
	
	
	for (int i=0; i<=arr.length;i++) {
		
	//System.out.println(arr[i].x);
if (dd.containsKey(arr[i].x) ) {
		
		System.out.println("found the match : " + arr[i].x);
		
	}else {
		
		
		dd.put(arr[i].x, i);
	}
		
	}
		
	}

}
 class stud {
	
	public  int x;
	 stud (int x){
		 
		 this.x=x;
	 }
	
}
