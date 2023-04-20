package lesson1_5;
public class DataTypeChange {
		// TODO 自動生成されたメソッド・スタブ
		    public static void main(String[] args) {
		    	
		        // Q1 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		        //  ローカル変数に代入し○○に入れてください
		        // 『山田太郎 18歳 170.5cm 62.2kg 寿司』
			
//					  String name = "「初めまして○○です」";
//					  int age = "「年齢は○○歳です」";
//					  double height  = "「身長は○○cmです」";
//					  double weight = "「体重は○○kgです」";
//					  String msg1 = "「好きな食べ物は○○です」";
//				
//					  System.out.println(name);
//					  System.out.println(age);
//					  System.out.println(height);
//					  System.out.println(weight);
//					  System.out.println(msg1);
				
		        // ↓↓format↓↓
		        // 「初めまして○○です」
		        // 「年齢は○○歳です」
		        // 「身長は○○cmです」
		        // 「体重は○○kgです」
		        // 「好きな食べ物は○○です」

		    	// Q1を下記に記載

				String name = "山田太郎";
				System.out.println(name);

				int age = 25;        // ←値を変更しながら実行
				System.out.println("年齢は" + age  + "です");

				
				double height  = 170.5;
				System.out.println("身長は"+ height+"cmです");
				

				double weight = 62.2;
				System.out.println("体重は"+weight+"kgです");	
				

				String msg1 = "寿司";
				System.out.println("好きな食べ物は" + msg1 + "です");	


		        // Q2 Q1で作成した自己紹介に続いて、BMIがコンソールに出力されるようにしてください
		    	// 「BMIは○○です」
		        // ただし計算は数値を直書きせず、全て変数を使ってすること

		        // Q2を下記に記載
				double bmi = weight / ((height / 100) * (height / 100));
		        // BMI値の出力
		        System.out.println("BMIは" + Math.ceil(bmi * 10) / 10+ "です");

		        // Q3 Q1で宣言した変数に再代入し、下記の通りコンソールに出力してください
		    	// 初めまして鈴木一郎です
		    	// 年齢は24歳です
		    	// 身長168.5cmです
		    	// 体重は64.2kgです
		    	// 好きな食べ物はオムライスです
		    	// BMIは22.6です
			

		        // Q3を下記に記載
		
				name = "鈴木一郎";		
				System.out.println("初めまして" + name + "です");
				// 年齢変数の宣言と初期化
				age = 25;        // ←値を変更しながら実行
				System.out.println("年齢は" + age  + "です");
		        height = 168.5;        // ←値を変更しながら実行
		        weight = 64.2;         // ←値を変更しながら実行
		        System.out.println("身長：" + height + "（cm）");
		        System.out.println("体重：" + weight + "（kg）");
		        // BMI値の算出と表示
		        // BMI変数の宣言と演算結果の格納
		        bmi = weight / ((height / 100) * (height / 100));
		        // BMI値の出力
		        System.out.println("BMIは" + Math.floor(bmi * 10) / 10 + "です");
		      
		        
				

		        // BMI値に応じた評価の出力
		    	// ↓↓コンソール最終結果↓↓
		    	
		    	//	初めまして山田太郎です
				//	年齢は18歳です
				//	身長170.5cmです
				//	体重は62.2kgです
				//	好きな食べ物は寿司です
				//	BMIは21.4です
				//	
				//	初めまして鈴木一郎です
				//	年齢は24歳です
				//	身長168.5cmです
				//	体重は64.2kgです
				//	好きな食べ物はオムライスです
				//	BMIは22.6です
		    	 
		    
		}
}
