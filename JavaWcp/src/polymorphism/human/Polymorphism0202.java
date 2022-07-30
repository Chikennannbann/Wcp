package polymorphism.human;

public class Polymorphism0202 {
	public static void main(String[] args) {
		Human02 human = new Student02("佐藤", 17, 70);
		
		Polymorphism0202 polymorphism = new Polymorphism0202();
		
		polymorphism.printName();
		polymorphism.printName("松本");
		polymorphism.printName("松本", "清水");
		polymorphism.printName(human);
	}
	
	public void printName() {
		System.out.println("中川です");
	}
	
	public void printName(String name) {
		System.out.println(name + "です");
	}
	
	public void printName(String name1, String name2) {
		System.out.println(name1 + "と" + name2 + "です");
	}
	
	public void printName(Human02 human) {
		System.out.println(human.getName() + "です");
	}

}
