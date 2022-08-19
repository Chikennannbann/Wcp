package chapter5;

public class practice2 {
//	public static void main(String[] args) {
//		email();
//	}
//	
//	public static void email() {
//		String title = "ミナト";
//		String address = "gmail.com";
//		String text = "こんにちは";
//		System.out.println(title + "に、以下のメールを送信しました");
//		System.out.println("件名:" + address);
//		System.out.println("本文:" + text);
//		
//	}
	
	public static void main(String[] args) {
		String title = "ミナト";
		String address = "gmail.com";
		String text = "こんにちは";
		email(title, address, text);
		email(address, text);
	}
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
	
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:" + text);
	}

}
