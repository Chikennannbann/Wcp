package chapter6;

public class Code010 {
	public static void main(String[] args) {
		int[] heights = {100, 200, 300, 400, 500};
		java.util.Arrays.sort(heights);
		for (int h : heights) {
			System.out.println(h);
		}
	}

}
