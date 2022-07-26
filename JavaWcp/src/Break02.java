
public class Break02 {
	public static void main(String[] args) {
		for (int count = 0; count < 5; count++) {
			if (count == 2) {
				break;
			}
			System.out.println("Break02 = " + count);
		}
		
		// continue文
		for (int count1 = 0; count1 < 5; count1++) {
			if (count1 == 2) {
				continue;
			}
		System.out.println("Continue = " + count1);
		}
	}

}
