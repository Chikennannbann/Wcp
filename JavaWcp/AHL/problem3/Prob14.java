package problem3;

public class Prob14 {
	public static void main(String[] args) {
		int a = new java.util.Random().nextInt(10) + 1;
		int b = new java.util.Random().nextInt(10) + 1;
		if (a > b) {
			System.out.println("aの方が大きいです。");
		} else if (a < b) {
			System.out.println("bの方が大きいです。");
		} else {
			System.out.println("等しいです。");
		}
	}

}
