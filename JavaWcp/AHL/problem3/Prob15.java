package problem3;

public class Prob15 {
	public static void main(String[] args) {
		int score = new java.util.Random().nextInt(100) + 1;
		if (score >= 80) {
			System.out.println("優");
		} else if (70 <= score && score < 80) {
			System.out.println("良");
		} else if (60 <= score && score < 70) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
	}

}
