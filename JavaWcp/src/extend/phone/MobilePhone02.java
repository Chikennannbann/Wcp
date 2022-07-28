package extend.phone;

public class MobilePhone02 implements Phone02, Camera02{
	private String number;
	
	public MobilePhone02(String number) {
		this.number = number;
	}
	
	public void takePicture() {
		System.out.println("写真を撮ります");
	}
	
	public void call(String number) {
		System.out.println(this.number + "から" + number + "に電話をかけます");
	}

}
