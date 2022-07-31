
public class ThreadSample02 implements Runnable {
	int num;
	
	public ThreadSample02(int num) {
		this.num = num;
	}
	
	public void run() {
		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("ThreadSample" + num + "のスレッド：" + i + "回目");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
