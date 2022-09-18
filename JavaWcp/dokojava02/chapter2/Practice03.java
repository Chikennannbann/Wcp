package chapter2;

import java.util.Random;
import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		
		int fortune = new Random().nextInt(4) + 1;
//		int fortune = new Random().nextInt(3);
//		fortune++;
		
		System.out.println("占いの結果が出ました");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");
	}

}
