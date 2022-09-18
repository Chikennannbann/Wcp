package chapter2;

import java.util.Scanner;

public class Code015 {
	public static void main(String[] aegs) {
		System.out.println("あなたの名前を入力してください");
		String name = new Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		int age = new Scanner(System.in).nextInt();
		System.out.println("ようこそ、" + age + "歳の" + name + "さん");
	}

}
