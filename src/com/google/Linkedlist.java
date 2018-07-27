package com.google;

import java.util.LinkedList;
import java.util.Iterator;

public class Linkedlist {

	public static LinkedList <String> ll = new LinkedList <String>();
	
	public static void main(String[] args) {
	
		ll.add("amey");
		ll.add("nimrik");
		ll.add("vineet");
		ll.add("sachin");
		Iterator <String> itr= ll.iterator();
		String Ss= ll.getLast();
		int size = ll.size();
		
		System.out.println(Ss + size);
		while (itr.hasNext()) {
			String S= itr.next();
			
			System.out.println(S);
			
		}
		
		

	}

}
