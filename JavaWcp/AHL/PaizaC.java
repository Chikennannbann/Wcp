public class PaizaC {
	public static void main(String[] args) {
		String S = new java.util.Scanner(System.in).nextLine();
		int i;
		for (i = 1; i <= S.length() + 2; i++) {
			System.out.print("+");
		}
		System.out.println();
		System.out.println("+" + S + "+");
		for (i = 1; i <= S.length() + 2; i++) {
			System.out.print("+");
		}
	}

}
