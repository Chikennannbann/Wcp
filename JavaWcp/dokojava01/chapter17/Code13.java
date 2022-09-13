package chapter17;

public class Code13 {
	public static void main(String[] args) {
		try {
			throw new Unsupported("未対応のファイルです");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
