package problem4;

public class Prob17 {
	public static void main(String[] args) {
//		行
		for (int i = 1; i <= 10; i++) {
//			列
			for (int j = 1; j <= 10; j++) {
				if (j <= i) {
					System.out.print("■" + " ");
				} else {
					System.out.print("□" + " ");
				}
			}
			System.out.println();
		}
	}

}
