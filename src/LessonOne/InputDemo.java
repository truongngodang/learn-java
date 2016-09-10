package LessonOne;

import java.io.*;
import java.util.*;

public class InputDemo {

	public static void main(String[] args) throws IOException {
		int a, b;
		float f;
		double d;
		char ch;
		byte byt;
		short sht;
		String str1, str2;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		byt = scanner.nextByte();
		System.out.println("byte: " + byt);
		sht = scanner.nextShort();
		System.out.println("short: " + sht);
		ch = scanner.next().charAt(0);
		System.out.println("char: " + ch);
		a = scanner.nextInt();
		System.out.println("a: " + a);
		b = scanner.nextInt();
		System.out.println("b: " + b);
		f =  scanner.nextFloat();
		System.out.println("f: " + f);
		d =  scanner.nextDouble();
		System.out.println("d: " + d);
		str1 = scanner.next();
		System.out.println("str1: " + str1);
		scanner.nextLine(); // Doc bo bo dem
		str1 = scanner.nextLine(); // Doc ca dong
		System.out.println("str1: " + str1);
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		str2 = bufferedReader.readLine();
		System.out.println("str2: " + str2);

	}

}
