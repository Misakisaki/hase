package curriculum_B;

import java.util.Random;
// スキャナーをインポートする
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// スキャナークラスを生成
		Scanner scanner = new Scanner(System.in);
		// 変数に入力した製品名にカンマを代入して受け取れるようにする
		String[] checks = scanner.nextLine().split("、");
		// ランダムクラスを生成
		Random rand = new Random();

		// テレビの残り台数をランダムな台数に代入
		int tv_rand = rand.nextInt(12);

		// 製品名を記入した際に在庫数が出力される（0〜11台）
		for (String check : checks) {

			// 繰り返し文に製品名を挿入
			switch (check) {
			// 製品名がパソコンが入力された場合
			case "パソコン":
				// ランダムクラスを使用し、パソコンの残り台数をランダムな値でコンソールにて出力
				System.out.println("パソコンの残り台数は" + rand.nextInt(12) + "台です");
				break;
			// 製品名が冷蔵庫が入力された場合
			case "冷蔵庫":
				// ランダムクラスを使用し、冷蔵庫の残り台数をランダムな値でコンソールにて出力
				System.out.println("冷蔵庫の残り台数は" + rand.nextInt(12) + "台です");
				break;

			// 製品名が扇風機が入力された場合
			case "扇風機":
				// ランダムクラスを使用し、扇風機の残り台数をランダムな値でコンソールにて出力
				System.out.println("扇風機の残り台数は" + rand.nextInt(12) + "台です");
				break;

			// 製品名が洗濯機が入力された場合
			case "洗濯機":
				// ランダムクラスを使用し、洗濯機の残り台数をランダムな値でコンソールにて出力
				System.out.println("洗濯機の残り台数は" + rand.nextInt(12) + "台です");
				break;

			// 製品名が加湿器が入力された場合
			case "加湿器":
				// ランダムクラスを使用し、加湿器の残り台数をランダムな値でコンソールにて出力
				System.out.println("加湿器の残り台数は" + rand.nextInt(12) + "台です");
				break;

			// 製品名がテレビが入力された場合
			case "テレビ":
				// 製品名がディスプレイが入力された場合
			case "ディスプレイ":

				// 条件演算子を使いテレビとディプレイのうちテレビですか？という条件
				int result = check.equals("テレビ") ? tv_rand : 11 - tv_rand;
				// テレビもしくはディスプレイの残り台数を出力
				System.out.println(check + "の残り台数は" + result + "台です");
				// 繰り返し処理を中断する
				break;

			// いずれの場合でもなかった時の処理を作成
			default:

				// 条件に含まない家電は「指定の商品ではありません」を出力
				System.out.println("『" + check + "』は指定の商品ではありません");

				break;
			}
		}
		// スキャナーを閉じる
		scanner.close();
	}
}
