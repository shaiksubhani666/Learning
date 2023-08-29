package powern;

public class DemoApp {
	int Power(int num, int n) {
		int finalnum = 1;
		for (int i = 1; i <= n; i++) {
			finalnum = finalnum * num;

		}
		return finalnum;
	}
}
