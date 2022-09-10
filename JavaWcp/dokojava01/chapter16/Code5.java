package chapter16;

import java.util.Set;
import java.util.TreeSet;

public class Code5 {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for (String s : words) {
			System.out.print(s + "→");
		}
	}

}
// 自然順序String型の複数の文字列をTreeSetに格納すると辞書順で取り出すことができる
