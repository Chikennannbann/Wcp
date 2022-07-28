package extend.human;

public class Extend02 {
	public static void main(String[] args) {
		Human02 sugimoto = new Human02("杉本", 16);
		System.out.println("Humanクラスのメソッド：名前は" + sugimoto.getName());
		
		Student02 sato = new Student02("佐藤", 17, 70);
		System.out.println("Humanクラスのメソッド：名前は" + sato.getName());
		System.out.println("Studentクラスのメソッド：プロフィールを紹介します" + sato.getStudentProfile());
		
		Human02 human = new Employee02("田中", 28, "システム部");
		System.out.println("Humanクラスのメソッド：名前は" + human.getName());
		
		Employee02 tanaka = (Employee02) human;
		System.out.println("Employeeクラスのメソッド：プロフィールを紹介します" + tanaka.getEmployeeProfile());
		
		Extend02.printName(sugimoto);
		Extend02.printName(sato);
		Extend02.printName(tanaka);
	}
	
	public static void printName(Human02 human) {
		System.out.println("Humanクラスのメソッド：名前は、" + human.getName());
	}

}
