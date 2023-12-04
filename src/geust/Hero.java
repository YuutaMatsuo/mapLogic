package geust;

public class Hero {
	public static String name;
	public int pointx;
	public int pointy;
	int hp;
	int mp;
	int power;
	int shield;

	public Hero(String name) {
		this.name = name;
		this.hp = 100;
		this.mp = 100;
		this.power = 100;
		this.shield = 100;
	}

	// 回復
	public void selfcare() {
		this.hp += 100;
		System.out.println(this.name + "は、回復した");
		System.out.println("HP:" + this.hp);
	}

	// 攻撃
	public  void attack(geust.Monster mo) {
		System.out.println(mo.name+ "が、現れた！");
		
		do{
		int a = new java.util.Random().nextInt(0, 51);
		System.out.println(this.name+"のこうげき!\n");
		System.out.println(mo.name + "に" + a + "のダメージ");
		mo.hp -= a;
		}while(mo.hp > 0);
		if (mo.hp > 0) {
			System.out.println(geust.Hero.name + "は" + mo.name + "を倒した！");
		}
		
	}

	public int choose() {

		System.out.println("▼選択してください");
		System.out.println(" 1：攻撃 \n 2:逃げる");

		int choose = new java.util.Scanner(System.in).nextInt();
		return choose;

	}
}
