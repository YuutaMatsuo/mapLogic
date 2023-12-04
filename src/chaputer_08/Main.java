package chaputer_08;

public class Main {

	public static void main(String[] args) {
		//1,勇者をインスタンス化
		Hero h = new Hero();//クラスを参照する
		Cleric c = new Cleric();
		//2.フィールドへの値セット
		h.name ="ミナト";
		h.hp =100;
		c.name ="正雄";
		c.hp =200;
		System.out.println("勇者"+h.name+"(hp"+h.hp+")"+"が誕生した");
		//マタンゴをインスタンス化
		Matango m1 = new Matango();
		m1.hp=50;
		m1.suffix = 'A';
		Matango m2 = new Matango();
		m2.hp= 48;
		m2.suffix ='B';
		
		
		//3.勇者を操作(メソッドの呼び出し)
		c.selfAid();
		h.slip();
		
		System.out.println("勇者が"+h.name+"のHP"+h.hp);
		m1.run();
		
		m2.run();
		c.pray(2);
		h.run();
		
	}

}
