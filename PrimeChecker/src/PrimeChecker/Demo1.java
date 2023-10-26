package PrimeChecker;

public class Demo1 {
        String PrimeCheck(int num1) {
        	if(num1<2) {
        		return "Not A Prime number";
        	}
        	for(int i=2;i<num1;i++) {
        		if(num1%i==0) {
        			return "Not prime";
        		}
        	}
        	return "Prime number";
        }
}

