package com.google;

public class Selectionsort {
	
	
	 void selectionsort(int arr[]) {
		
		 
		 int n= arr.length;
		 
		for (int i=0; i<=(n-1);i++) {
			
			for (int j=i+1; j<=n-1; j++) {
				
				//System.out.println( "i=" +i+": j= "+ j);
				if (arr[j] < arr[i]) {
				
				int temp = arr[j];
				arr[j]= arr[i];
				arr[i]=temp;	
				                }			
				
			 }		
		      }
	
	
		
	}
	
	 void display(int dis[]) {
		
		for (int i=0; i<=dis.length-1;i++) {
			
			System.out.println(dis[i]);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int io [] = {64, 25,12,22,11};
		Selectionsort ob = new Selectionsort();
		
		ob.selectionsort(io);
		System.out.println("The sorted array");
		ob.display(io);
		

	}

}
