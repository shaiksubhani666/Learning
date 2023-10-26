package Methods;

public class LenearMethod {
  int lenear(int arr[],int key) {
	  int index=0;
	  for(int i=0;i<=arr.length-1;i++) {
		  if(key==arr[i]) {
			   index=i;
			   
		  }
	  }
	  return index;
  }
}
