package chapter5;

public class Practice02 {
	public static void main(String[] args) {
		String title = "次の日曜日";
		String address = "gmail.com";
		String text = "キャンプ行こう";
		email(title, address, text);
		
//		practice03 オーバーロード
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
