package pattern;

public class DemoApp {
	public static void main(String[] args) {
		Pattern1();
		Pattern2();
		Pattern3();
		Pattern4();
		
		
	}
	public static void Pattern1() {
		System.out.println("*");
		
	}
	public static void Pattern2() {
		for(int i=1;i<=4;i++) {
			System.out.print("* ");
		}
	}
	public static void Pattern3() {
		System.out.println(" * ");
		
		
	}
	public static void Pattern4() {
		for(int i=1;i<=5;i++) {
		System.out.print(" * ");
		
		}
		System.out.println();
	}
	

}
