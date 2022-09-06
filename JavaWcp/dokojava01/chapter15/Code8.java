package chapter15;

public class Code8 {
	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String w = s.replaceAll("[beh]","X");
		System.out.println(w);
	}

}

//　replaceFirstで最初の1つだけを置換できる
