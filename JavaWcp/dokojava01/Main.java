
public class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
//		Hero h = new Hero();
//		h.hp = 100;
		Hero02 h = new Hero02("ミナト");
		h.sword = s;
		
		Wizard w = new Wizard();
		w.setName("アサカ");
		w.setHp(30);
		
		Monster m = new Matango('A');
		
		PoisonMatango pm = new PoisonMatango('C');
		
		SuperHero sh = new SuperHero();
		sh.run();
		
		System.out.println("勇者" + h.getName() + "を生み出しました！");
		System.out.println("現在の武器は" + h.sword.name);
		
//		h.sit(5);
//		h.slip();
//		h.sit(25);
//		h.run();
		h.attack(m);
		h.slip();
//		w.heal(h);
		m.run();
		
		pm.attack(h);
		
		h.run();
		
//		多様性と配列を組み合わせる
		
		Monster[] monsters = new Monster[3];
		monsters[0] = new Slime();
		monsters[1] = new Goblin();
		monsters[2] = new DeathBat();
		for (Monster mon : monsters) {
			mon.run();
		}
		
		System.out.println(h.toString());
		
		Hero02 h2 = new Hero02("モモ");
		h2.setHp(100);
		Hero02 h3 = new Hero02("モモ");
		h3.setHp(100);
		if (h2.equals(h2) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}
		
//		＊newせずとも静的フィールド(static付)は利用可能
		Hero02.money = 100;
		System.out.println(Hero02.money);
		System.out.println(h2.money);
		h2.money = 300;
		System.out.println(h3.money);
		
		Hero02.setRandomMoney();
		System.out.println(Hero02.money);
		Hero02 h4 = new Hero02();
		System.out.println(h4.money);
		
	}
}
