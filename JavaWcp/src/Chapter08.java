
public class Chapter08 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 5) {
			System.out.println(number * number);
			number++;
		}
		
		int[] array = { 1, 2, 3, 4 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		for (int val : array) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}
		
		
		// Chapter08 2回目
		int number1 = 1;
		while (number < 5) {
			System.out.println(number1 * number1);
			number1++;
		}
		
		int[] array1 = { 1, 4, 14, 25 };
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		for (int val1 : array1) {
			if (val1 % 2 == 0) {
				continue;
			}
			System.out.println(val1);
		}
	}

}
