package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {
		// 課題5
		// 1~20の入った変数の定義

		// 変数0の定義、１ずつ足していく処理　1の段9の段まで表示
		for (int i = 1; i < 10; i++) {
			// 変数0の定義、１ずつ足していく処理 10の段から20の段まで表示
			for (int j = 1; j < 21; j++) {
				// 掛け算の式と答え
				int answer = i * j;
				// 1の段が20より小さい場合まで繰り返す処理
				if (j >= 20) {
					// 3桁で0埋めして出力処理
					System.out.printf("%03d * %03d = %03d %n", j, i, answer);
				} else {
					// 3桁で0埋めして出力処理
					System.out.printf("%03d * %03d = %03d || ", j, i, answer);
				}
			}
		}
	}
}
