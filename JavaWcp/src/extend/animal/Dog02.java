package extend.animal;

public class Dog02 extends Animal02 {
	public Dog02() {
		this.name = "犬";
	}
	
	public void cry() {
		System.out.println(this.name + "が吠えました");
	}

}
