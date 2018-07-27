package com.google;

public class Quicsort {

	public int partation (int arr[], int low , int high) {
	
		int pivot=arr[high];
		int i=(low-1);
		for (int j =low; j<high; j++) {
			
			if (arr[j]<=pivot) {
				i++;
				
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			
		}
		
		int swap= arr[i+1];
		arr[i+1]= arr[high];
		arr[high]= swap;
		
		
		return i+1;
	}
	
	public void qsort(int arr[], int low, int high)
	{
		
		if (low<high) {
			
			int pindex= partation(arr, low, high);
			qsort(arr,low, pindex-1 );
			qsort(arr, pindex+1, high);
			
		  }		
	}
	
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
	

	public static void main(String[] args) {
		
		int  arr[]= {10, 7, 8, 9, 1, 5};
		Quicsort ob= new Quicsort();
		int n=arr.length;
		ob.qsort(arr, 0, n-1);
		System.out.print("Sorted array ");
		ob.printArray(arr);

	}

}
