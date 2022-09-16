package chapter1;

public class Code11 {
	public static void main(String[] aegs) {
		Hero h1 = new Hero("ミナト", 100, 90);
		Sword s = new Sword("はがねの剣");
		
		h1.setSword(s);
		System.out.println("装備:" + h1.getSword().getName());
		System.out.println("Clone()で複製します");
		Hero h2 = h1.clone();
		
		System.out.println("コピー元の勇者の剣の名前を変えます");
		h1.getSword().setName("ヒノキの棒");
		System.out.println("コピー元とコピー先の勇者の装備を表示します");
		System.out.println("コピー元:" + h1.getSword().getName() + "コピー先:" + h2.getSword().getName());
	}
}

// 深いコピー:そのインスタンスが参照しているインスタンスを含めて複製する。
// これで勇者と剣の両方が正しく複製される
