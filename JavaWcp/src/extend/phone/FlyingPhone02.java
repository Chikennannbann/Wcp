package extend.phone;

public class FlyingPhone02 implements Phone02, Flying02 {
	private int minutes;
	
	public FlyingPhone02(int minutes) {
		this.minutes = minutes;
	}
	
	public void call(String number) {
		System.out.println(number + "に電話します。通話できるのは飛んでいる間だけです");
	}
	
	public void fly() {
		System.out.println(minutes + "分間飛びます");
	}
	
	public void powerOff() {
		Flying02.super.powerOff();
	}

}
