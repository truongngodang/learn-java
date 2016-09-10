package ExampleOne;
import java.util.Scanner;

public class PhuongTrinhBacNhat {
	
	private float a, b;
	
	public PhuongTrinhBacNhat() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextFloat();
		b = scanner.nextFloat();
	}

	boolean checkStatus() {
		if (a == 0) {
			return false;
		} return true;
	}
	float nghiemPT() {
		return -b/a;
	}
}
