package problem4;

public class Prob10 {
	public static void main(String[] args) {
		int max = 0;
		int min = 100;
		
		for (int i = 1; i <= 5; i++) {
			int num = new java.util.Random().nextInt(100) + 1;
			System.out.println(num);
			
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		System.out.println("最大値は" + max);
		System.out.println("最小値は" + min);
		System.out.println("終了します");
	}

}
