package lebledNestedDowhile;

public class Demo {
    public static void main(String[] args) {
		  int i=1;
		 subhani: do {
			  int j=1;
			  do {
				  System.out.println("Kodnest");
				  break subhani;
			  }while(j<=5);
			  
			  
		  }while(i<=5);
		  
	}
}
