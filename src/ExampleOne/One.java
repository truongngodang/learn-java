package ExampleOne;

import java.util.Scanner;

public class One {
	String context;
	public One() {
		
	}
	void setContext() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		context = scanner.nextLine();
	}
	void showContext() {
		System.out.println(context);
	}

}
