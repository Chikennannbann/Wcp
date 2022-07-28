package extend.human;

public class Employee02 extends Human02 {
	private String department;
	
	public Employee02(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}
	
	public String getEmployeeProfile() {
		String profile = "年齢は" + this.age + "です";
		profile += "サラリーマンで、部署は" + this.department + "です";
		return profile;
	}

}
