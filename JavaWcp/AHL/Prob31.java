//import java.util.Random;

public class Prob31 {
	public static void main(String[] args) {
		int num = new java.util.Random().nextInt(10) + 1;
		if (num > 5) {
			System.out.println(num);
			System.out.println("5以上です");
		} else if (num != 1){
			System.out.println("1ではありません");
		} else {
			System.out.println(num);
		}
	}

}
