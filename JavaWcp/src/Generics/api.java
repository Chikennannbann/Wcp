package Generics;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class api {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(1);
//		型違いコンパイルエラー
//		set.add("Two");
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Taro");
		map.put(2, "Hanako");
//		型違いコンパイルエラー
//		int value = map.get(0);
		
		System.out.println(set);
		System.out.println(map);
		
	}

}
