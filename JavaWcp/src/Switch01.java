
public class Switch01 {
	public static void main(String[] args) {
		int val = 2;
		switch (val) {
		case 3:
			System.out.println("よくできました");
			break;
		case 2:
			System.out.println("普通でした");
			break;
		default:
			System.out.println("頑張ろう");
		}
	}

}
// Switch：変数とcaseの値が一致する場合、ブロック内の処理を実行
// default分は必須ではない。
// caseに一致しなければ何もしないという処理を実行したければ記入なし

// if分でも可能だが変数の値に対して単純な分岐はswitch分がわかりやすい
// public static void main(String[] args) {
//    int val = 2;
//   if (val == 3) {
//        System.out.println("よくできました！");
//    } else if (val == 2) {
//        System.out.println("ふつうでした！");
//    } else {
//        System.out.println("がんばろう！");
//    }
//}