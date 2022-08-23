package problem4;

public class Prob9 {
	public static void main(String[] args) {
		int num = 1;
		while (num % 10 != 0) {
			num = new java.util.Random().nextInt(100) + 1;
			System.out.println(num);
		}
		System.out.println("終了します");
	}

}
