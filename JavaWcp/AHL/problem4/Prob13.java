package problem4;

public class Prob13 {
	public static void main(String[] args) {
		int num = new java.util.Random().nextInt(10) + 1;
		if (num >= 5) {
		    for (int i = 1; i <= num; i ++) {
			    System.out.println("★");
		    }
		} else {
			System.out.println("発生した数値:" + num);
		}
	}

}
