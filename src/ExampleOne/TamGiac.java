package ExampleOne;

import java.util.Scanner;

public class TamGiac {
	
	private float a, b, c;
	
	public TamGiac() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		c = scanner.nextFloat();
	}
	
	boolean checkExist() {
		if (a + b > c || b + c > a || a + c > b) {
			return true;
		} else
			return false;
	}
	
	int checkShape() {
		if (checkExist()) {
			if (a == b && b == c) {
				return 5;
			}
			if (a == b || a == c || b == c) {
				if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == b*b + a*a) {
					return 4;
				} else {
					return 2;
				}
			} if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == b*b + a*a) {
				return 3;
			}
			return 1;
		}
		return 0;
	}

}
