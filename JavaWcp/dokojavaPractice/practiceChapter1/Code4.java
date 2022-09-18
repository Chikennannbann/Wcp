package practiceChapter1;

import java.util.Arrays;

public class Code4 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {1, 2, 3, 4, 5};
		
		System.out.println("誤った判定:" + a.equals(b));
		System.out.println("正しい判定:" + Arrays.equals(a, b));
	}

}

// 配列同士を比較しようろすると等値判定が行われてしまう
// ２つの配列を等価判定したい場合はjava.util.Arraysクラスの静的メソッドequals()を使用
