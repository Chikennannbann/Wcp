package problem4;

public class Prob3 {
	public static void main(String[] args) {
		int num = new java.util.Random().nextInt(10) + 1;
		int i = 1;
		System.out.println("数:" + num);
		do {
			System.out.print("■ ");
			i++;
		} while (i <= num);
	}

}
