package problem3;

public class Prob3 {
	public static void main(String[] args) {
		int num = new java.util.Random().nextInt(100) + 1;
		if (num < 50) {
			System.out.println("50未満です");
		}  else {
			System.out.println(num);
		}
		
		
		if (num <= 10 || 90 <= num) {
			System.out.println("10以下か90以上です");
		} else {
			System.out.println(num);
		}
		
		
		if (20 <= num  || num < 80) {
			System.out.println("20以上80未満です");
		} else {
			System.out.println(num);
		}
	}

}
