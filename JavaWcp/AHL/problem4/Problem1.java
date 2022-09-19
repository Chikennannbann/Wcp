package problem4;

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
		
		
//		int num = 1;
//		while (num != 10) {
//			num = new Random().nextInt(10) + 1;
//			System.out.println(num);
//		}
//		System.out.println("終了します");
		
		
//		int max = 0;
//		int min = 100;
//		for (int i = 0; i < 5; i++) {
//			int num = new Random().nextInt(100) + 1;
//			System.out.println(num);
//			if (max < num) {
//				max = num;
//			}
//			if (min > num) {
//				min = num;
//			}
//		}
//		System.out.println("最大値:" + max);
//		System.out.println("最小値:" + min);
		
		
//		int num = new Random().nextInt(10) + 1;
//		if (num >= 5) {
//			for (int i = 0; i < num; i++) {
//				System.out.print("★" + " ");
//			}
//		} else {
//			System.out.println("発生した数値:" + num);
//		}
		
		
//		for (int i = 1; i <= 100; i++) {
//			if (i % 10 == 0) {
//				System.out.println(i);
//			} else {
//				System.out.print(i + " ");
//			}
//		}
		
		
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				int mul = i * j;
//				if (j == 9) {
//					System.out.println(j + "*" + i + "=" + mul);
//				} else {
//					System.out.print(j + "*" + i + "=" + mul + " ");
//				}
//			}
//		}
		
		
//		for (int i = 1; i <= 10; i++) {
//			for (int j = 1; j <= 10; j++) {
//				if (j <= i) {
//					System.out.print("■" + " ");
//				} else {
//					System.out.print("□" + " ");
//				}
//			}
//			System.out.println();
//		}
		
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i == j) {
					System.out.print("□" + " ");
				} else {
					System.out.print("■" + " ");
				}
			}
			System.out.println();
		}
		
	}

}
