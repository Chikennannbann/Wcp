package API;
import java.util.ArrayList;
import java.util.List;

public class List01 {
//	コレクションAPI List
	
	public static void main(String[] aergs) {
	List<String> list1 = new ArrayList<String>();
//	List<Integer> list2 = new LinkedList<Integer>();
	
	list1.add("りんご");
	list1.add("みかん");
	list1.add(1, "バナナ");
	
//	コレクションの要素数より多いとエラー
//	list1.add(5, "ドリアン");

	System.out.println(list1);
	System.out.println(list1.get(0));
	System.out.println(list1.contains("なし"));
	System.out.println(list1.size());
	System.out.println(list1.remove("バナナ"));
	System.out.println(list1);
	System.out.println(list1.remove(0));
	System.out.println(list1);
	}
}
