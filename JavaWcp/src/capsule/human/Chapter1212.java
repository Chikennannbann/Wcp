package capsule.human;

public class Chapter1212 {
	public static void main(String[] args) {
		CapsuleMan02 man = new CapsuleMan02("小林", 32);
		System.out.println("名前は" + man.getName() + "です");
		System.out.println("年齢は" + man.getAge() + "です");
		
		man.setAge(33);
		System.out.println("誕生日を迎えたので年齢が" + man.getAge() + "になりました");
	}

}
