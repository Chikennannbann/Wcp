
public class Hero {
	private String name;
	int hp;
	Sword sword;
	
	public void attack(Monster m) {
		System.out.println(this.name + "は攻撃した！");
		m.hp -= 5;
		System.out.println("敵に5ポイントのダメージを与えた！");
	}
	
//	アクセス修飾飾を外すとpackage privateを指定したと見なされ同じパッケージに属するクラスからの呼び出しのみ可能
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した。");
	}
//	メソッド宣言にfinalをつけるとオーバーライド禁止（クラス宣言につけると継承禁止）
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	
	public void run() {
		System.out.println(this.name + "は、逃げ出した!");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした。");
	}
//	アクセス修飾飾がprivateでも同じクラス内のメソッドからはthisを使って呼び出し可能
	private void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}
	
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	
	public Hero() {
		this("ダミー");
//		このthisは同一クラスの別のコンストラクターを呼び出すためのもの
	}
	
//	getter(read only)
	public String getName() {
		return this.name;
	}
	
//	setter(write only)
	public void setName(String name) {
		this.name = name;
	}

}
