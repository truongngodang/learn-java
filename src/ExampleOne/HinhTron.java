package ExampleOne;

import java.util.Scanner;

public class HinhTron {

	private double banKinh;
	public static double PI = 3.14159265358979;
	
	public HinhTron() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		banKinh = scanner.nextDouble();
	}
	
	double chuVi() {
		return 2*PI*banKinh;
	}
	
	double dienTich() {
		return banKinh*banKinh*PI;
	}

}
