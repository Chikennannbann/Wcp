package chapter4;

public class code18 {
	public static void main(String[] args) {
		int[][] scores = new int[2][3];
		scores[0][0] = 40;
		scores[0][1] = 50;
		scores[0][2] = 60;
		scores[1][0] = 80;
		scores[1][1] = 60;
		scores[1][2] = 70;
		System.out.println(scores[1][1]);
		
		int[][] points = {{40, 50, 60}, {80, 60, 70}};
		System.out.println(points.length);
		System.out.println(points[0].length);
		System.out.println(points[1][1]);
	}

}
