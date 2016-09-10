package ExampleOne;

import java.util.Scanner;

public class Two {
	
	private int n;
	public Two() {
		n = 0;
	}
	
	void setNumber() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
	}
	
	boolean checkLeg() {
		if (n%2 == 0)
			return true;
		return false;
	}
	
	boolean checkPlus() {
		if (n >= 0)
			return true;
		return false;
	}
	
	void show() {
		if (checkLeg()) {
			System.out.println(n + " là số chẵn");
		} else {
			System.out.println(n + " là số lẻ");
		}
		
		if (checkPlus()) {
			System.out.println(n + " là số dương");
		} else {
			System.out.println(n + " là số âm");
		}
	}
}
