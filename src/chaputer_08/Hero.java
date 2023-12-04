package chaputer_08;

//勇者の金型を作成
public  class Hero {
		//フィールド（属性）
	public  String name;
	 static int hp;
	//メッソド（操作・能力）
	public void sleep() {
		this.hp = 100;
		//自分が持っているhpを100にする
		System.out.println(this.name+"は、眠って回復した");
	}
	public void sit (int sec) {
		this.hp += sec;
		System.out.println(this.name+"は"+sec+"秒座った");
		System.out.println(this.name+"HPが"+sec+"ポイント回復した");
	}
	public void slip() {
		//転ぶメッソド
		this.hp -= 5;
		System.out.println(this.name+"は"+"転んだ");
		System.out.println("5のダメージ!");
	}
	public void run() {
		//逃げるメッソド
		System.out.println(this.name+"は"+"逃げ出した");
		System.out.println("GAME OVER");
		System.out.println("最終HPは"+this.hp+"でした");
		System.out.println("神は言っている\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nここで死ぬ定めではないと…");
	}
}
