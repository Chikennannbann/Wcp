package problem4;

public class Prob1 {
	public static void main(String[] args) {
		int num = new java.util.Random().nextInt(10) + 1;
		System.out.println("数:" + num);
		for (int i = 1; i <= num; i++) {
			System.out.print("■ ");
		}
	}

}
