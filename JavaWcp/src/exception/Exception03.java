package exception;

public class Exception03 {
	public static void main(String[] args) {
		try {
			Exception03.division(100, 0);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException例外が発生");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalException例外が発生");
			// キャッチした例外インスタンスをスロー
			throw e;
		}
		// finallyブロックでないので処理が実行されない
		System.out.println("プログラム終了");
	}
	
	public static void division(int a, int b) {
		System.out.println(a + "÷" + "は？");
		if (b == 0) {
			// 割り算で例外が発生するので、意図的にIllegalArgumentException例外をスロー
			throw new IllegalArgumentException("引数が不正です");
		}
		int result = a / b;
		System.out.println("計算結果" + result);
	}
}
// throw文は、意図的に例外を発生させたい場合に使用します。
//（この事を「例外をスローする」と表現します。）

//例外インスタンスをスロー
// throw 例外インスタンス;

//例外インスタンスを生成してスロー
// throw new 例外クラス;