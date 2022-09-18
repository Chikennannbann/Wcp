package practiceChapter1;

public class Code8 implements Comparable<Code8> {
	int number;
	int zandaka;
	
	public int compareTo(Code8 obj) {
		if (this.number < obj.number) {
			return -1;
		}
		if (this.number > obj.number) {
			return 1;
		}
		return 0;
	}

}
