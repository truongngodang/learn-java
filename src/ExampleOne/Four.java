package ExampleOne;

import java.util.Scanner;

public class Four {
	int a, b;
	
	public Four() {
		a = 0;
		b = 0;
	}
	
	void setA() {
		@SuppressWarnings("resource")
		Scanner scanner =  new Scanner(System.in);
		a = scanner.nextInt();
	}
	
	void setB() {
		@SuppressWarnings("resource")
		Scanner scanner =  new Scanner(System.in);
		b = scanner.nextInt();
	}
	
	int soSanh() {
		if (a > b) {
			return 1;
		} if (a < b) {
			return -1;
		} else {
			return 0;
		}
	}
}
