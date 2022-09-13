package chapter17;

import java.io.FileWriter;

public class Code10 {
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("data.txt");) {
			fw.write("hello");
		} catch (Exception e) {
			System.out.println("なんらかの例外が発生");
		}
	}

}
