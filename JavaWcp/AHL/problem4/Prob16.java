package problem4;

public class Prob16 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int m = i * j;
				System.out.print(i + "*" + j + "=" + m + " ");
			}
			System.out.println();
		}
	}

}
