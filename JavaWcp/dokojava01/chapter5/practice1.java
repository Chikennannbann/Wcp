package chapter5;

public class practice1 {
//	public static void main(String[] args) {
//		System.out.println(introduceOneself("ミナト"));
//		System.out.println(introduceOneself(20));
//		System.out.println(introduceOneself(155.5));
//		System.out.println(introduceOneself('子'));
//	}
//	
//	public static String introduceOneself(String name) {
//		return name;
//	}
//	public static int introduceOneself(int age) {
//		return age;
//	}
//	public static double introduceOneself(double tall) {
//		return tall;
//	}
//	public static char introduceOneself(char eto) {
//		return eto;
//	}
	
	public static void main(String[] args) {
		introduceOneself();
	}
	
	public static void introduceOneself() {
		String name = "ミナト";
		int age = 20;
		double height = 155.5;
		char zodiac = '子';
		System.out.println("名前は" + name);
		System.out.println("年齢は" + age);
		System.out.println("身長は" + height);
		System.out.println("干支は" + zodiac);
	}

}
