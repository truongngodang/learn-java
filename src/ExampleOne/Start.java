package ExampleOne;

public class Start {

	public static void main(String[] args) {
		
		TamGiac example = new TamGiac();
		if (example.checkExist()) {
			switch (example.checkShape()) {
			case 1:
				System.out.println("��y la� tam gia�c th���ng!");
				break;
			case 2:
				System.out.println("��y la� tam gia�c c�n!");
				break;
			case 3:
				System.out.println("��y la� tam gia�c vu�ng!");
				break;
			case 4:
				System.out.println("��y la� tam gia�c vu�ng c�n!");
				break;
			case 5:
				System.out.println("��y la� tam gia�c ���u!");
				break;
			default:
				break;
			}
		} else {
			System.out.println("��y kh�ng pha�i la� m��t tam gia�c!");
		}
		
	}

}
