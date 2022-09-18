package practiceChapter1;

import java.util.Objects;

public class Hero implements Cloneable{
	private String name;
	private int hp, mp;
	Sword sword;
	
	public Hero(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
//	toString()をオーバーライド。これがないとObjectのtoString()が適用されてしまう
	public String toString() {
		return "勇者(名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
	}
	
	public int hashCode() {
		return Objects.hash(this.name, this.hp);
	}
	
	public Sword getSword() {
		return this.sword;
	}
	
	public void setSword(Sword sword) {
		this.sword = sword;
	}
	
	public Hero clone() {
		Hero result = new Hero(name, hp, hp);
		result.name = this.name;
		result.hp = this.hp;
		result.mp = this.mp;
		result.sword = this.sword.clone();
		return result;
	}
}
