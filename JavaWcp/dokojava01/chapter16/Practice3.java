package chapter16;

import java.util.HashMap;
import java.util.Map;

public class Practice3 {
	public static void main(String[] args) {
		Hero h1 = new Hero("斉藤");
		Hero h2 = new Hero("鈴木");
		Map<Hero, Integer> action = new HashMap<Hero, Integer>();
		action.put(h1, 3);
		action.put(h2 ,7);
		
		for (Hero key : action.keySet()) {
			int value = action.get(key);
			System.out.println(key.getName() + "が倒した敵＝" + value);
		}
	}

}
