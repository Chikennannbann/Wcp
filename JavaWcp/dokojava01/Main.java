
public class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
//		Hero h = new Hero();
//		h.hp = 100;
		Hero h = new Hero("ミナト");
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
		
		Hero h2 = new Hero("モモ");
		h2.setHp(100);
		Hero h3 = new Hero("モモ");
		h3.setHp(100);
		if (h2.equals(h2) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}
	}
}
