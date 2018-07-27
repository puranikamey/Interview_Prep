package com.google;

//Puranik, Amey J
//axp1390
//2018-April-12

public class hmwk_3a_GCD {
	
	
	public static int gcd(int first, int second)
	{
		int d= (second==0) ? first : gcd(second, first % second);
		return d;
		
	}

	public static void main(String[] args) {
		
		for (int i =1; i<=10; i++) {
			
			for (int j =1; j<=10; j++) {
				
				System.out.println(" GCD :( "+i +","+j +") is : "  + gcd(i,j));
				
				
			}
			
			
		}
		
	
	}

}
