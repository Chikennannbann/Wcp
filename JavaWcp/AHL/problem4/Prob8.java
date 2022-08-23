package problem4;

public class Prob8 {
	public static void main(String[] args) {
	    int num = 1;
		while (num != 10) {
			num = new java.util.Random().nextInt(10) + 1;
			System.out.println(num);
		}
		System.out.println("終了します");
	}

}
