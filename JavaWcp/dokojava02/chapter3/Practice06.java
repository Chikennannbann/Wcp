package chapter3;

import java.util.Random;
import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		System.out.println("[数あてゲーム]");
		int ans = new Random().nextInt(10);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("0~9の数字を入力してください");
			int num = new Scanner(System.in).nextInt();
			if (num == ans) {
				System.out.println("あたり！");
				break;
			} else {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");
		System.out.println("ランダムで生成された数字は" + ans + "でした");
	}

}
