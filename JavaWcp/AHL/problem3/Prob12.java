package problem3;

public class Prob12 {
	public static void main(String[] args) {
//		int num = (int)(Math.random()* 6) + 1;
		int num = new java.util.Random().nextInt(21) - 10;
		if (num < 0) {
			System.out.println("負の値です");
		} else if (num == 0) {
			System.out.println("0です");
		} else {
			System.out.println("正の値です");
			System.out.println(num);
		}
	}

}
