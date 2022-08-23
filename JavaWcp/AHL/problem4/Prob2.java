package problem4;

public class Prob2 {
	public static void main(String[] args) {
		int num = new java.util.Random().nextInt(10) + 1;
		int i = 1;
		System.out.println("数:" + num);
		while  (i <= num) {
			System.out.print("■ ");
			i++;
		}
	}

}
