package com.kodnest.Array.Level3;

public class KodnestSearchSort {
	int lenearSearch(int arr[],int key) {
		 for(int i=0;i<=arr.length-1;i++) {
			 if(key==arr[i]) {
				 
				 return i;
			 }
			 
			 
		 }
		 return -1;
	  }
	int binarySearch(int arr[],int key) {
		   int low=0;
		   int high=arr.length-1;
		   while(low<=high) {
			   int mid=(low +high)/2;
			   if(key==arr[mid]) {
				   return mid;
			   }
			   else if(key>arr[mid]) {
				 low=mid+1;
			   }
			   else {
				 high=mid-1;
			   }
			   
		   }
			return -1;
	   }
	 void bobbleSortAssending(int arr[]) {
		   for(int i=0;i<=arr.length-2;i++) {
			   for(int j=0;j<=arr.length-2-i;j++) {
				   if(arr[j]>arr[j+1]) {
				   int help=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=help;
				   }
			   }
		   }
	   }
	 void bobbleSortDesending(int arr[]) {
		   for(int i=0;i<=arr.length-2;i++) {
			   for(int j=0;j<=arr.length-2-i;j++) {
				   if(arr[j]<arr[j+1]) {
				   int help=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=help;
				   }
			   }
		   }
	   }
	 void selectionSortAssending(int arr[]) {
	    	int min;
	    	int pos;
	    	for(int i=0;i<=arr.length-2;i++) {
	    		 min=arr[i];
	    		 pos=i;
	    		
	    		for(int j=i+1;j<=arr.length-1;j++) {
	    		    if(arr[j]<min) {
	    		    	min=arr[j];
	    		    	pos=j;
	    		    }
	    		}
	    		int help=arr[i];
	    		arr[i]=arr[pos];
	    		arr[pos]=help;
	    	}
	    }
	 void selectionSortDessending(int arr[]) {
	    	int min;
	    	int pos;
	    	for(int i=0;i<=arr.length-2;i++) {
	    		 min=arr[i];
	    		 pos=i;
	    		
	    		for(int j=i+1;j<=arr.length-1;j++) {
	    		    if(arr[j]>min) {
	    		    	min=arr[j];
	    		    	pos=j;
	    		    }
	    		}
	    		int help=arr[i];
	    		arr[i]=arr[pos];
	    		arr[pos]=help;
	    	}
	    }
	 void insertionSortAssending(int arr[]) {
		   for(int i=1;i<=arr.length-1;i++) {
			   int item=arr[i];
			   int j=i-1;
			   while(j>=0&&arr[j]>item) {
				   arr[j+1]=arr[j];
				   j--;
			   }
			   arr[j+1]=item;
		   }
	   }
	 void insertionSortDessending(int arr[]) {
		   for(int i=1;i<=arr.length-1;i++) {
			   int item=arr[i];
			   int j=i-1;
			   while(j>=0&&arr[j]<item) {
				   arr[j+1]=arr[j];
				   j--;
			   }
			   arr[j+1]=item;
		   }
	 }
	 int maxArray(int arr[]) {
			int max=arr[0];
			for(int i=1;i<=arr.length-1;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
			return max;
		}
	 int minArray(int arr[]) {
		 int min=arr[0];
		 for(int i=1;i<=arr.length-1;i++) {
			 if(arr[i]<min) {
				 min=arr[i];
			 }
		 }
		 return min;
	 }
}
	 
		 
	 

