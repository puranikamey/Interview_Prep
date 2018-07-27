package com.google;

//Puranik, Amey J
//axp1390
//2018-April-19

import java.util.function.BinaryOperator;

public class Gcdl {

   static BinaryOperator <Integer> gcd;

   public static void main(String[] args) {
       gcd = (n, k) -> { return k == 0 ? n : gcd.apply(k, n%k); };

       for(int i = 1; i <= 10; i++){
    	   for (int j= 1; j<=10; j++) {
    		   
    		   System.out.println("gcd(" + i + ","+ j + ") is " + gcd.apply(i,j));
    	   }
          
       }
   }
}