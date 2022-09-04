package chapter14;

public class Main {
	public static void main(String[] args) {
//		Empty e = new Empty();
//		String s = e.toString();
//		System.out.println(s);
		
//		全てのクラスis a ObjectだからObject方の変数にはどんなインスタンスでも代入できる
//		(intやlongなどは格納できない)
		Object o1 = new Empty();
		System.out.println(o1);
		Object o2 = "こんにちは";
		System.out.println(o2);
	}

}
