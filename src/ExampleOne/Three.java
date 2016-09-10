package ExampleOne;

import java.util.Scanner;

public class Three {
	private Double a, b;
	
	public Three() {
		a = (double) 0;
		b = (double) 0;
	}
	
	void setA() {
		@SuppressWarnings("resource")
		Scanner scanner =  new Scanner(System.in);
		a = scanner.nextDouble();
	}
	void setB() {
		@SuppressWarnings("resource")
		Scanner scanner =  new Scanner(System.in);
		b = scanner.nextDouble();
	}
	
	Double tong() {
		return a + b;
	}
	
	Double hieu() {
		if (a > b) {
			return a - b;
		} if (b > a) {
			return b - a;
		} else {
			return (double) 0;
		}
	}
	
	Double tich() {
		return a*b;
	}
	
	Double thuong() {
		return a/b;
	}

}
