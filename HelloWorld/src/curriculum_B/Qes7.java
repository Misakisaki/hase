package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args) {
		// 全教科の配列の箱を作成
		String[] subjects = { "英語", "数学", "理科", "社会" };
		// 生徒の人数を入力してください（2以上)：3
		System.out.print("生徒の人数を入力してください（2以上)：");
		// コンソールに入力された文字を取得して表示できるようにする
		Scanner stdIn = new Scanner(System.in);
		// 入力された生徒の人数定義
		int stuNumber;
		// 入力された生徒の人数を取得して表示できるようにして改行
		stuNumber = stdIn.nextInt();
		// スコア点数 = 入力された生徒の人数定義 全教科の配列
		int[][] scores = new int[stuNumber][subjects.length];
		// iは生徒の数stuNumberは入力された生徒の人数分を繰り返す処理
		for (int i = 0; i < stuNumber; i++) {
			// 教科一覧の回数分繰り返す処理
			for (int j = 0; j < subjects.length; j++) {
				// 生徒の人数分の教科一覧の点数を入力して出力処理
				System.out.print((i + 1) + "人目の生徒の『" + subjects[j] + "』の点数を入力して下さい:");
				// スコア点数を出力する処理
				scores[i][j] = stdIn.nextInt();
			}
			// 改行
			System.out.println();
		}
		// クローズ処理
		stdIn.close();
		// 生徒毎の全ての教科の合計の平均点を繰り返す処理
		for (int a = 0; a < scores.length; a++) {
			// 全ての教科の合計の平均点
			int sum = 0;
			for (int score : scores[a]) {
				sum += score;
			}
			// 生徒毎の各教科の合計点数の平均点の出力
			System.out
					.println((a + 1) + "人目の生徒の平均点は:" + String.format("%.2f", (double) sum / scores[a].length) + "点です。");
		}
		// 改行
		System.out.println();

		// 科目毎の平均点
		for (int k = 0; k < subjects.length; k++) {
			// 全ての教科の合計の平均点
			int sum = 0;
			// 科目毎の全ての合計の平均点を繰り返す処理
			for (int l = 0; l < scores.length; l++) {
				// 生徒の人数毎に教科の点数を格納する。
				sum += scores[l][k];
			}
			// 各教科の合計点数の平均点の出力
			System.out.printf(subjects[k] + "の平均点は" + String.format("%.2f", (double) sum / scores.length) + "点です。");
			System.out.println();
		}
		// 全体の平均点、小数点第二位まで表示
		System.out.printf(
				"全体の平均点は" + String.format("%.2f", (double) stuNumber * scores.length * subjects.length) + "点です。");
	}
}
//  ☆変数一覧☆
// subjects　　 ：教科一覧
// stuNumber　　：生徒の数
// scores　　　 ：生徒毎に教科の点数を格納する。
