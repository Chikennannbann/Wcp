package chapter15;

public class Code10 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(start);
		
		try {
		Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end);
	}

}

// longでは人間は中身が分からない→Code11
