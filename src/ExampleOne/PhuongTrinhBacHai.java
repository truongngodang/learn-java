package ExampleOne;

import java.util.Scanner;

public class PhuongTrinhBacHai {

	
	private float a, b, c;
	private double n, n1, n2;
	public PhuongTrinhBacHai() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		c = scanner.nextFloat();
		n = 0;
		n1 = 0;
		n2 = 0;
	}
	
	double getN() {
		return n;
	}
	
	double getN1() {
		return n1;
	}
	
	double getN2() {
		return n2;
	}
	
	public double delta() {
		return b*b - 4*a*c;
	}
	
	boolean checkExist() {
		if (delta() < 0) {
			return false;
		}
		return true;
	}
	void nghiemPT() {
		if (checkExist()) {
			if (delta() == 0) {
				this.n = -b/(2*a);
			} if (delta() > 0) {
				this.n1 = (-b + Math.sqrt(delta()))/(2*a);
				this.n2 = (-b - Math.sqrt(delta()))/(2*a);
			}
		}
	}
}
