package chapter3;

public class practice3 {
	public static void main(String[] args) {
		int isHungry = 1;
		String food = "いも";
		System.out.println("こんにちは");
		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("腹ペコです");
		}
//		8~12行目を１行でも表すことができる
//		System.out.println(isHungry == 0? "お腹がいっぱいです" : "腹ペコです");
		if (isHungry == 1) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ご馳走様でした");
		
	}

}
