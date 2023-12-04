package yuusya;

public class run {

int count=0;
int x=0;
int y =0;
int b =0;
int c =0;

static int [][] map=new int [18][18];//使うマス+2分
          //壁の判定をrunningの中に入れているのでマップの広さで変更が必要  
public static int running(int x,int y) {
	String cmd ;
	
	int count=0;
	int b =0;
	int c =0;
//イベント格納
	map[4][6]= 2;
	map[8][5]= 2;
	map[2][5]= 7;
	map[5][5]= 7;
while(true) {
 System.out.println("ここは  しろ");
cmd = new java.util.Scanner(System.in).nextLine();

if (cmd.equals("w")) {b=1;c=0;	}
else if(cmd.equals("s")){b=-1;c=0;}
else if(cmd.equals("a")){c=-1;b=0;}
else if(cmd.equals("d")){c=1;b=0;}
x+=b;
y+=c;

	

 int a= new java.util.Random().nextInt(99);
 System.out.println(a);

 if (cmd.equals("end")) {
	  System.out.println(count);
		break;}
 else if( 7<=x){x=7;
		  System.out.println("かべだ")
		  ;}
 if( -7>=x){x=-7;
 System.out.println("かべだ")
 ;}
  if( 7<=y){y=7;
 System.out.println("よこが かべだ")
 ;}
  if( -7>=y){y=-7;
 System.out.println("よこが かべだ")
 ;}
		 else if(x==10){System.out.println("てきだ");}
		
//ここまで移動の処理
//配列の中身を確認
 
 x+=7;
 y+=7;
if(map [x][y]==0) {
	x-=7;
	y-=7;
	System.out.println("現在の位置X"+x+"Y"+y);
	//配列の中身を確認
	}else {
		
		System.out.println("イベント発生");
		
		map[17][17]=Flag.encount(x,y);
		//開いたマップの配列を使用＊要検討
		
		x-=7;
		y-=7;
	
    
		System.out.println("イベント後の位置X"+x+"Y"+y);
		
		
		break;
	}

      }
return map[17][17];
}
}





