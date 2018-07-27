package com.google;



public class Insertionsort {
	
	 void insertionsort(int io[]) {
	
		 
		 int n=io.length;
		 for (int i=1;i<n-1;i++)
		 {
			 int key=i;
			 int j =i-1;
			 
			 while(io[j]!=0 && io[j]>io[key]) {
				 io[key]=io[j];
				 j=j-1;
				 
				 
			 }
			 key= j+1;
			
		 }		 
		 
	}
	 void display(int dis[]) {
			
			for (int i=0; i<=dis.length-1;i++) {
				
				System.out.println(dis[i]);
				
			}
			
		}

	public static void main(String[] args) {
    int arr[] = {64, 25, 12, 22, 11};
    Insertionsort ob = new Insertionsort();
    ob.insertionsort(arr);
    System.out.println("The sorted array");
	ob.display(arr);

	}

}
