
public class PoisonMatango extends Matango{
	int poisonCount = 5;
	
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	public void attack(Hero02 h) {
		super.attack(h);
		if (this.poisonCount > 0) {
			System.out.println("さらに毒の胞子をばら撒いた！");
			int dmg = h.getHp() / 5;
			h.setHp(h.getHp() - dmg);
			System.out.println(dmg + "ポイントのダメージ！");
			this.poisonCount--;
		}
	}

}
