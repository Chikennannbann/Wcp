package chapter4;

public class code5 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[5];
//		int[] scores = new int[5];も同じ
		scores[1] = 30;
		System.out.println(scores[1]);
		
		int[] num = new int[] {20, 30, 40, 50, 80};
//		int[] num = {20, 30, 40, 50, 80}も同じ
		System.out.println(num[3]);
	}

}
