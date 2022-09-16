package chapter1;

import java.util.ArrayList;
import java.util.List;

public class Code3 {
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<>();
		
		Hero h1 = new Hero("ミナト", 100, 90);
		list.add(h1);
		System.out.println("要素数" + list.size());
		
		h1 = new Hero("ミナト", 100, 90);
		list.remove(h1);
		System.out.println("要素数" + list.size());
	}

}
