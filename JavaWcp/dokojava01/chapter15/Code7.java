package chapter15;

public class Code7 {
	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String[] words = s.split("[,:]");
		for (String w : words) {
			System.out.print(w + "->");
		}
 	}

}

//　カンマかコロンの場所で文字列を分割
