package polymorphism.human;

public class Student02 extends Human02 {
	private int score;
	
	public Student02(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	@Override
	public String getProfile() {
		String profile = "年齢は" + super.age + "です";
		profile += "学生で、テストの点数は" + this.score + "です";
		return profile;
	}

}
