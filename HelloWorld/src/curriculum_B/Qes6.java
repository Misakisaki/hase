package curriculum_B;

import java.util.Random;
// scannerをインポートする
import java.util.Scanner;

public class Qes6 {
	//  入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
	// ・拡張for文・Switch文・条件演算子を使用すること　※普通のif文は使用不可
	public static void main(String[] args) {
		// 「パソコン」「冷蔵庫」「扇風機」「洗濯機」「加湿器」「テレビ」「ディスプレイ」「その他商品」を代入
		// scannerを初期化
		Scanner scanner = new Scanner(System.in);
		// checkに入力した文字を受け取れるようにする　	// カンマを代入
		String[] checks = scanner.nextLine().split("、");
		// Randomを初期化する
		Random rand = new Random();

		// scannerを閉じる
		//	 scanner.close();

		// 製品名を記入した際に在庫数が出力される（0〜11台）
		for (String check : checks) {
			
			// switch文にcheckを挿入
			switch (check) {
			// itemがパソコンだった時のcaseを作成
			case "パソコン":
				// 「パソコンの残り台数はrand台です」と出力
				System.out.println("パソコンの残り台数は" + rand.nextInt(11) + "台です");
				break;
			// itemが冷蔵庫だった時のcaseを作成
			case "冷蔵庫":
				// 「冷蔵庫の残り台数はrand台です」と出力
				System.out.println("冷蔵庫の残り台数は" + rand.nextInt(11) + "台です");
				break;

			// itemが扇風機だった時のcaseを作成
			case "扇風機":
				// 「扇風機の残り台数はrand台です」と出力
				System.out.println("扇風機の残り台数は" + rand.nextInt(11) + "台です");
				break;

			// itemが洗濯機だった時のcaseを作成
			case "洗濯機":
				// 「洗濯機の残り台数はrand台です」と出力
				System.out.println("洗濯機の残り台数は" + rand.nextInt(11) + "台です");
				break;

			// itemが加湿器が入力された場合
			case "加湿器":
				// 「加湿器の残り台数はrand台です」と出力
				System.out.println("加湿器の残り台数は" + rand.nextInt(11) + "台です");
				break;

			// itemがテレビが入力された場合
			case "テレビ":
				// itemがディスプレイが入力された場合
			case "ディスプレイ":
				// テレビのランダム数をTV_randに代入
				int TV_rand = rand.nextInt(11);
				// Switch文内でテレビとディスプレイは続けて書くようにしてください、条件演算子で出力される値を変更してください
				int result = check.equals("テレビ") ? TV_rand : 11 - TV_rand;	 
				// テレビもしくはディスプレイの残り台数はresult台ですと出力
				System.out.println(check + "の残り台数は" + result + "台です");
				// switch文を中断する
				break;

			// いずれの場合でもなかった時の処理を作成
			default:
				// itemは指定の商品ではありませんを出力
				System.out.println("『 その他商品 』は指定の商品ではありません");
				
				break;
			}
		}
	}
}
