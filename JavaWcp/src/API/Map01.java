package API;

import java.util.HashMap;
import java.util.Map;

public class Map01 {
//	Map API
//	キーと値の組み合わせで要素を管理するコレクション
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(0, "ぶどう");
		map1.put(3, "もも");
//		登録済みのキーで追加すると上書きされる
		map1.put(0, "マスカット");
		
		System.out.println(map1);
		System.out.println(map1.get(0));
//		存在しないキーを指定した場合戻り値がnull
		System.out.println(map1.get(1));
		System.out.println(map1.containsKey(0));
		System.out.println(map1.containsValue("ぶどう"));
		System.out.println(map1.size());
		System.out.println(map1.remove(0));
		System.out.println(map1.remove(3, "もも"));
//		要素がなければ何もせずエラーも発生しない
		System.out.println(map1.remove(1));
		System.out.println(map1.remove(3, "なし"));
		System.out.println(map1);
	}

}
