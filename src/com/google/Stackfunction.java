package com.google;

public class Stackfunction {
 
	static final int max = 10;
	int top;
	int s [] = new int [max];
			
	Stackfunction(){
		
		top=-1;
	}
	
	boolean push(int x) {
		
		if (top>=max) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			s[++top]=x;
			return true;
		}
			}
	
	int pop() {
		if (top< 0) {
			System.out.println("Stack underflow");
			return 0;
		}
		else {
			int x =s[top--];
			return x;
			
		}
		
		
		
	}
	
	public static void main (String args[]) {
		Stackfunction sf= new Stackfunction();
		sf.push(40);
		sf.push(4);
		
		
		System.out.println(sf.pop() + " Popped Item");
	}
	
	
	
}

