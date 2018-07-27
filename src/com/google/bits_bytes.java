package com.google;

public class bits_bytes {
	
	public static void main(String[] args) {
	
		new bits_bytes().bite(2099999999);
	}
	
	public void bite (int i) {
		int d=0;
		int r=0;
		String s="";
		 while (i>0) {
		s= ((i%2)==0 ? "0" : "1") + s;
		if (i%2==0) {
			
			d++;
		}
		else
		{
			r++;
		}
		i=i/2;
		
		 }	
		 
		 System.out.println(s);
		 System.out.println("Number of zeros in the Binary String " + d);
		 System.out.println("Number of Ones in the Binary String " + r);
	}
	
}
