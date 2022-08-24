package problem4;

public class practice {
	public static void main(String[] args) {
		int num = new java.util.Random().nextInt(10) + 1;
		if (num % 2 == 0) {
			for (int i = 1; i <= num; i++) {
			  
				System.out.println("★");
			}
		}
	}

}

// 3 8 11 16
