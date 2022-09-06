package chapter15;

public class Code4 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		System.out.println(s);
		
		
		String str = "こんにちはJava";
		char[] data1 = str.toCharArray();
		byte[] data2 = str.getBytes();
		System.out.println(data1[1]);
		System.out.println(data2[3]);
		
	}

}

// StringBuilderの方が演算子より4000倍早い
// 数回程度であれば性能に大差なし、+演算子で可読性をあげると良い
