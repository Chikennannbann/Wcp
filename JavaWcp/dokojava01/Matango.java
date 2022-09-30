
public class Matango extends Monster {
	int hp = 50;
	final int LEVEL = 10;
	char suffix;
	
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}
	
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public void attack(Hero02 h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.setHp(h.getHp() - 10);
	}

}
