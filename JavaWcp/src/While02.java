
public class While02 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 50) {
			number *= 2;
			System.out.println("While02 = " + number);
		}
		
		do {
			number += 2;
			System.out.println("DoWhile02 = " + number);
		} while (number < 50);
		
		
		// 再帰処理ver
		int number1 = 1;
		printNum(number1);
	}
	
	public static int printNum(int number1) {
		if (number1 < 50) {
			number1 *= 2;
			System.out.println("While02 = " + number1);
			printNum(number1);
		}
		return number1;
	}

}
