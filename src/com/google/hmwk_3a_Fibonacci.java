package com.google;

//Puranik, Amey J
//axp1390
//2018-April-12

public class hmwk_3a_Fibonacci {

	
	public static int Fibonacci(int n )
	{
		if (n==0) {
			return 0;
		}
		else {
		int d = (n<1) ? 1 : Fibonacci(n-1) + Fibonacci(n-2);
	
		return d;
		}
	}
	
	public static void main(String[] args) {
		
		for (int i=0; i<=15; i++)
		{
			System.out.println(" Fibonacci ("+i +") is :" + Fibonacci(i));
		}
		

	}

}
