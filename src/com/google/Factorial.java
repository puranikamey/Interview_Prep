package com.google;

//Puranik, Amey J
//axp1390
//2018-April-19
import java.util.function.Function;

public class Factorial {

   static Function<Long, Long> factorial;
   
   public static void main(String[] args) {
       
	   factorial = (n) -> { return n == 0 ? 1 : n * factorial.apply(n-1); };
	   
       for(int i = 0; i <= 15; i++){
    	   
           System.out.println("facrotial(" + i + ") is " + factorial.apply((long) i));
           
       }
   }
}