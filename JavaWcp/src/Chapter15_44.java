
public class Chapter15_44 {
	public static void main(String[] args) {
		for (int i = 1; i <= 2; i++) {
			
			ThreadSample02 mt = new ThreadSample02(i);
			Thread thread = new Thread(mt);
			thread.start();
		}
		
		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Chapter15_4のスレッド：" + i + "回目");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
