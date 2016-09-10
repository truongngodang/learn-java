package LessonOne;

public class People {
	
	public String name;
	private String address;
	protected int age;
	static int numOfOject;
	
	public People(String name, int age, String address) {
		numOfOject++;
		this.name 		= name;
		this.age 		= age;
		this.address 	= address;
		
	}
	
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Adress: " + address);
	}
	
	void setAdrr(String address) {
		this.address = address;
	}
	
	public static void main(String[] args) {
		numOfOject = 0;
		People ngocTrinh = new People("Ngoc Trinh", 25, "43, Nguyen Chi Thanh, Ha Noi");
		People thuyVan = new People("Thuy Van", 23, "Ha Dong, Ha Noi");
		thuyVan.display();
		ngocTrinh.display();
		System.out.println("\nSo Luong Doi Tuong: " + numOfOject);
	}

}
