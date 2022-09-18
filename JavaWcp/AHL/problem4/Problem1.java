package problem4;

import java.util.Random;

public class Problem1 {
	public static void main(String[] args) {
//		int num = new Random().nextInt(10) + 1;
//		System.out.println(num);
//		for (int i = 0; i < num; i++) {
//			System.out.print("■" + " ");
//		}
		
//		int num = new Random().nextInt(10) + 1;
//		int i = 1;
//		System.out.println(num);
//		while (i <= num) {
//			System.out.print("■" + " ");
//			i++;
//		}
		
		
//		int num = new Random().nextInt(10) + 1;
//		int i = 1;
//		System.out.println(num);
//		do {
//			System.out.print("■" + " ");
//			i++;
//		} while (i <= num);
		
		
		int num = 1;
		while (num != 10) {
			num = new Random().nextInt(10) + 1;
			System.out.println(num);
		}
		System.out.println("終了します");
	}

}
