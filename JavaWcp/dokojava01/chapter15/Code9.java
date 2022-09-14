package chapter15;

public class Code9 {
	public static void main(String[] args) {
		int year = 2021;
		String str = String.format("今年は%d年です", year);
		System.out.println(str);
		
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s = String.format(FORMAT, "Minato", "Yamamoto", 6000);
		System.out.println(s);
		
		System.out.printf("製品番号%s-%02d", "SUV", 3);
	}
}
	