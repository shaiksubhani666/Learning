package Recurtion;

public class Demo {
  int Gcd(int m,int n) {
	  if(n==0) {
		  return m;
	  }
	  else {
		  return Gcd(n,m%n);
	  }
  }
}
