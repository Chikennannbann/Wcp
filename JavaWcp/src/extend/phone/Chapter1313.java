package extend.phone;

public class Chapter1313 {
	public static void main(String[] args) {
		MobilePhone02 mobilePhone = new MobilePhone02("000-1111-2222");
		mobilePhone.takePicture();
		Chapter1313.staticCall(mobilePhone, "99-8888-7777");
		mobilePhone.powerOff();
		
		FlyingPhone02 flyingPhone = new FlyingPhone02(5);
		flyingPhone.fly();
		Chapter1313.staticCall(flyingPhone, "000-1111-2222");
		flyingPhone.powerOff();
	}
	
	public static void staticCall(Phone02 phone, String number) {
		phone.call(number);
	}

}
