package chapter17;

import java.io.FileWriter;
import java.io.IOException;

public class Code2 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("hello");
			fw.close();
		} catch (IOException e) {
			System.out.println("エラーが発生しました" + e.getMessage());
		}
	}

}