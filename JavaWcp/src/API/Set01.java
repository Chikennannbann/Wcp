package API;

import java.util.HashSet;
import java.util.Set;

public class Set01 {
//	Set API
//	重複のない要素を管理するコレクション
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		
		set1.add("スイカ");
		set1.add("メロン");
		
		System.out.println(set1.contains("スイカ"));
		System.out.println(set1.contains("なし"));
		System.out.println(set1.size());
		System.out.println(set1.remove("スイカ"));
		System.out.println(set1.remove("なし"));
		System.out.println(set1);
	}

}
