package problem3;

public class Prob16 {
	public static void main(String[] args) {
		int num = new java.util.Random().nextInt(100) + 1;
		if (num % (2 * 3) == 0) {
			System.out.println("2と3の公約数です");
		} else if (num % 3 == 0) {
			System.out.println("3の倍数です");
		} else if (num % 2 == 0) {
			System.out.println("2の倍数です");
		} else {
			System.out.println(num);
		}
	}

}
//公約数は先に記述する！
