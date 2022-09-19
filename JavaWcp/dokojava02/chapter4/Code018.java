package chapter4;

public class Code018 {
	public static void main(String[] aegs) {
		int[][] scores = new int[2][3];
		scores[0][0] = 40;
		scores[0][1] = 50;
		scores[0][2] = 60;
		scores[1][0] = 80;
		scores[1][1] = 60;
		scores[1][2] = 70;
		System.out.println(scores[1][1]);
		
		
		int[][] num = {{40, 50, 60}, {80, 60, 70}};
		System.out.println(num.length);
		System.out.println(num[0].length);
	}

}
