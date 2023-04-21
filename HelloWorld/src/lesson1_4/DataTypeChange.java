package lesson1_4;

public class DataTypeChange {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	
		    	 
			     // Q1 下記9個をローカル変数として宣言のみしてください
			     //		・バイト型・短整数型・整数型・長整数型
			     // 	・単精度浮動小数点数型・倍精度浮動小数点数型
			     //   	・文字型・文字列型
			     //	 	・ブーリアン型 

		 byte i ;
		 short sh ;
		 int nt;
		 long l;
		 float f;
		 double d;
		 char ch;
		 String  st;
		 boolean  b;
		    	 
			     // Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
		    	

				 i = 0;
				 
				 sh = 0;

				 nt = 0;
				
				 l = 0L;

				 f = 0.0f;

				 d= 0.0d;
				
				 ch = '\u0000';
	
				 st =  null;
				 
				 b  = false;
				 

				
		

				
			     // Q3 初期化をしたそれぞれの変数に下記の値を代入してください
			
			     // ・バイト型                 10
			     // ・短整数型                 100
			     // ・整数型                	 1000
			     // ・長整数型                 10000
			     // ・単精度浮動小数点数型   	 9.5
			     // ・倍精度浮動小数点数型		 10.5
			     // ・文字型                   a
			     // ・文字列型              	 ハロー
			     // ・ブーリアン型          	 true

				 i = 10;
				 sh = 100;
				 nt = 1000;
				 l = 10000L;
				 f = 9.5f;
				 d = 10.5d;
				 ch  = 'a';
				 st = "ハロー";
				 b =  true;

			    	 
			     // Q4 下記の通りにコンソール出力されるようにしてください
			     // 必ず変数を使用すること
			
			     // 11110
			     // 20.0
			     // a ハロー true
			     // 11130.0                    数字を全て足す
			     // 10000000000                小数点以外の数字を全てかける
			     // 0.105                      10.5割る100をする
			     // -90                        10引く100をする

			
				 System.out.println(i + sh + nt + l); 
				 

				 System.out.println(f+ d); 

				 
				 System.out.println(ch + st + b);
				 
				 
				 System.out.println(i + sh + nt + l + f + d); 
				 
				 
				 System.out.println(i * sh * nt * l ); 
				 

				 System.out.println(d / sh); 
				 
				 
				 System.out.println(i - sh); 
				 
				 

				    	 
		    	// Q5 
		    	// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		    	//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		 		int num = 20;
		 		int num1 = 23;
		 		System.out.println("ハローJAVA" + (num + num1));
		 		
//		 		
//		 		String num = "20"; から　int num = 20;　へ　変更
		}
	}


