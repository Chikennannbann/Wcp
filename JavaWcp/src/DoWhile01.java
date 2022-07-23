
public class DoWhile01 {
	public static void main(String[] args) {
		int number = 1;
		do {
			number *= 2;
			System.out.println("DoWhile01 = " + number);
		} while (number < 50);
	}

}
// 条件式をブロックの実行後に評価するため、number = 100に変えて実行すると200が出る
