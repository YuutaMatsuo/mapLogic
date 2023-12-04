package geust;

public class Monster {
	public String name;
	int hp;
	int mp;
	int power;
	int shield;
	
	public Monster(String name,int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public void attack(Hero h) {
		System.out.println(this.name + "のこうげき");
		h.hp -= this.power;
	}

}
