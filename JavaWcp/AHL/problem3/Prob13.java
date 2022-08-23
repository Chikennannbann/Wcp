package problem3;

public class Prob13 {
	public static void main(String[] args) {
		int num = new java.util.Random().nextInt(3) + 1;
		if (num == 1) {
			System.out.println("グー");
		} else if (num == 2) {
			System.out.println("パー");
		} else {
			System.out.println("チョキ");
		}
	}
	

}
