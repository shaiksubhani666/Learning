package Arraysum_diagonal;

public class Demo {
	public static int SumOfDiagonals(int [][]arr1) {
		int leftDsum=0;
	    int rightDsum=0;
	   
	    for(int i=0;i<=arr1.length-1;i++) {
	    	for(int j=0;j<=arr1[i].length-1;j++) {
	    		if(arr1[i]==arr1[j]) {
	    			leftDsum+=arr1[i][j];
	    		}
	    	}
	    }
	    for(int i=0;i<=arr1.length-1;i++) {
	    	for(int j=0;j<=arr1[i].length-1;j++) {
	    		if(i+j==arr1.length-1) {
	    			rightDsum+=arr1[i][j];
	    		}
	    	}
	    }
	    int res=leftDsum+rightDsum;
	    return res;
	    		
	}

}
