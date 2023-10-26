package Methods;

public class BinarySearchMethod {
	int binarySearch(int arr[],int key){
	   int low=0;
	   int high=arr.length-1;
	   int index=0;
	  
	   while(low<=high) {
		   int mid=(low+high)/2;
		   if(key==arr[mid]) {
			    index=mid;
			    break;
		   }
		   else if(key>arr[mid]) {
			   low+=mid;
		   }
		   else if(key<arr[mid]) {
			   high-=mid;
		   }
		   
	   }
	   return index;
	   
   }
}
