package yuusya;

public class Main {
	

	public static void main(String[] args) {
		//主人公に座標が必要
		//run=マップを移動するクラス
		geust.Hero h = new geust.Hero("・Δ・");
		
		
		System.out.println(h.name+"がうまれた！");
		run.running(0, 0);
		int a =run.map [17][17];//四桁になっている座標を変換
		h.pointx= a/100;
		h.pointy= a-h.pointx*100;
		System.out.println("冒険再開！");
		run.running(h.pointx-7,h.pointy-7 );
		
		System.out.print("ゴンは滅びた"+"\n\n\n\n\nEND");
		System.out.println("Thak you forplaying"+h.name);
		
		


	}
}
