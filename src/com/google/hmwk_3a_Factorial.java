package com.google;

//Puranik, Amey J
//axp1390
//2018-April-12
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.BinaryOperator;



public class hmwk_3a_Factorial {
	
	static  UnaryOperator<Integer> factorial;
	{
	factorial = (Integer x) ->{ return x == 0 ? 1 : x * factorial.apply(x - 1 ); };
	
	
	}
	
	static long Factorial(int n)
    {
        long result;

        result=(n==0) ? 1 : n * Factorial(n-1);
        return result;
       
    }
	public static void main(String[] args) {
		
		for (int i=0; i<=15; i++)
		{
	//	System.out.format("Factorial",factorial.say(i));
		}

	}

}
