package extend.human;

public class Student02 extends Human02 {
	private int score;
	
	public Student02(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	
	public String getStudentProfile() {
		String profile = "年齢は" + super.age + "です";
		profile += "学生で、テストの点数は" + this.score + "点です";
		return profile;
	}

}
