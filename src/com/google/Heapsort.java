package com.google;

public class Heapsort {

	public void sort (int arr[]) {
	int n=arr.length;
	for (int i=n/2-1;i>=0;i--) { // 
		System.out.println(i);
		
		heap(arr, n,i);
	}
	
	for (int j=n-1; j>=0;j--) {
		int swap= arr[0];
		arr[0]=arr[j];
		arr[j]=swap;
		heap(arr, j, 0);
		
		
	}
		
	}
	
	public void heap(int arr[], int n,int i){
		int largest = i;
		int l = 2*i+1;
		int r= 2*i+2;
		
		if (l<n && arr[l]>arr[largest])
		{
			largest=l;
		}
		if (r<n&& arr[r]>arr[largest])
		{
			largest=r;
		}		
		
		if (largest!=i)
		{
			int temp = arr[i]; 
			arr[i]=arr[largest];
			arr[i]=arr[largest];
			
			heap(arr, n,largest);
			
		}
		
	}
	
	public void printaa(int arr[]) {
		int n= arr.length;
		
		for (int i=0; i<=n;++i) {
			
		//	System.out.println(arr[i]);
		}
		
	}
	

	
	public static void main(String[] args) {
		int  arr[]= {12, 11, 13, 5, 6, 7};
		Heapsort ob=new Heapsort();
		ob.sort(arr);
	//	System.out.println("Sorted array");
	   ob.printaa(arr);
		
		
	}

}
