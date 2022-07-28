package extend.phone;

public interface Flying02 {
	
	void fly();
	
	default void powerOff() {
		System.out.println("飛んでいる場合は落下します");
	}

}
