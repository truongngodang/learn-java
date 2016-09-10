package ExampleOne;

import java.util.Scanner;

public class Five {
	
	float a, b, c, d;
	public Five() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		c = scanner.nextFloat();
		d = scanner.nextFloat();
	}
	
	float max() {
		float max = a;
		if (a == b && b == c && c == d) {
			return 0;
		}
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}
		return max;
	}

}
