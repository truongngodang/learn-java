package ExampleOne;

public class Start {

	public static void main(String[] args) {
		
		TamGiac example = new TamGiac();
		if (example.checkExist()) {
			switch (example.checkShape()) {
			case 1:
				System.out.println("Ğây laÌ tam giaìc thıõÌng!");
				break;
			case 2:
				System.out.println("Ğây laÌ tam giaìc cân!");
				break;
			case 3:
				System.out.println("Ğây laÌ tam giaìc vuông!");
				break;
			case 4:
				System.out.println("Ğây laÌ tam giaìc vuông cân!");
				break;
			case 5:
				System.out.println("Ğây laÌ tam giaìc ğêÌu!");
				break;
			default:
				break;
			}
		} else {
			System.out.println("Ğây không phaÒi laÌ môòt tam giaìc!");
		}
		
	}

}
