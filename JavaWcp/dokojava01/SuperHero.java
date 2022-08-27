
public class SuperHero extends Hero {
	boolean flying;
	
	public void attack(Matango m) {
		super.attack(m);
		if (this.flying) {
			super.attack(m);
		}
	}
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
//	オーバーライド：親クラスのメンバを子クラス側で上書きすること
	public void run() {
		System.out.println(this.name + "は撤退した");
	}

}
