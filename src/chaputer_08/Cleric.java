package chaputer_08;

public class Cleric {
	String name;
	int hp=50;
	final int maxHp=50;
	int mp=10;
	 final int maxMp=10;
	
 //メソッド
	 public  void selfAid(){
		 System.out.println(name+"は回復した");
		 this.mp-=5;
		 System.out.println("mpが"+this.mp+"になった。");
		 this.hp=this.maxHp;
		 System.out.println("hpが"+this.hp+"になった。");
	 }
	 public int pray (int a){
		 int x = new java.util.Random().nextInt(3);
		 System.out.println("じいは、"+a+"秒祈った");
		 
		 this.mp+=a+x;
		 if(this.maxHp<this.hp) {
			 this.hp=this.maxHp;
		 }else
		 System.out.println("じいは、"+"mpが"+this.hp+"になった");
		 return a+x;
	 }
}
