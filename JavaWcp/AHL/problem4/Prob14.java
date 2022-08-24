package problem4;

import java.util.Random;

public class Prob14 {
	public static void main(String[] args) {
		int num = new Random().nextInt(10) + 1;
		if (num % 2 == 0) {
			for (int i = 1; i <= num; i++) {
				System.out.println("★");
			}
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.println("☆");
			}
		}
	}

}
