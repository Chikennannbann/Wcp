package polymorphism.human;

public class Polymorphism0101 {
	public static void main(String[] args) {
		Human02 human1 = new Student02("佐藤", 17, 70);
		System.out.println("Humanクラスのメソッド：プロフィールを紹介します" + human1.getProfile());
		
		Human02 human2 = new Employee02("田中", 28, "システム部");
		System.out.println("Humanクラスのメソッド：プロフィールを紹介します" + human2.getProfile());
	}

}
