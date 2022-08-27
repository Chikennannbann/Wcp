
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
		w.name = "アサカ";
		w.hp = 30;
		
		Matango m = new Matango('A');
		
		PoisonMatango pm = new PoisonMatango('C');
		
		SuperHero sh = new SuperHero();
		sh.run();
		
		System.out.println("勇者" + h.name + "を生み出しました！");
		System.out.println("現在の武器は" + h.sword.name);
		
//		h.sit(5);
//		h.slip();
//		h.sit(25);
//		h.run();
		h.attack(m);
		h.slip();
		w.heal(h);
		m.run();
		
		pm.attack(h);
		
		h.run();
		
		
	}
}
