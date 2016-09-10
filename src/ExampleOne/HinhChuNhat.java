package ExampleOne;

import java.util.Scanner;

public class HinhChuNhat {
	
	private float canhOne, canhTwo;
	
	public HinhChuNhat() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		canhOne = scanner.nextFloat();
		canhTwo = scanner.nextFloat();
	}
	
	float chuVi() {
		return canhOne + canhTwo;
	}
	
	float dienTich() {
		return canhOne*canhTwo;
	}

}
