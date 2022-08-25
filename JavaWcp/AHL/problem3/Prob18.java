package problem3;

import java.util.Random;

public class Prob18 {
	public static void main(String[] args) {
		int num = new Random().nextInt(46) -10;
		System.out.println("摂氏" + num + "です");
		if (num >= 30) {
			System.out.println("真夏日です");
		} else if (25 <= num && num < 30) {
			System.out.println("夏日です");
		} else if (0 <= num && num <25) {
		} else {
			System.out.println("真冬日です");
		}
	}

}
