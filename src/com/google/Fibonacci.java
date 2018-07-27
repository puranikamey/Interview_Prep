package com.google;

//Puranik, Amey J
//axp1390
//2018-April-19
import java.util.function.Function;

public class Fibonacci{

   static Function<Integer, Integer> fibonacci;

   public static void main(String[] args) {
       fibonacci = (n) -> { return n > 1 ? fibonacci.apply(n-1) + fibonacci.apply(n-2) : n; };

       for(int i = 0; i <= 15; i++){
           System.out.println("fibonacci(" + i + ") is " + fibonacci.apply(i));
       }
   }
}