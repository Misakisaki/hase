package curriculum_B;

public class Qes5 {
	public static void main(String[] args) {
		// 課題5
		// 1~20の入った変数の定義

		// 変数0の定義、１ずつ足していく処理　1の段9の段まで表示
		for (int i = 1; i < 10; i++) {
			// 変数0の定義、１ずつ足していく処理 10の段から20の段まで表示
			for (int j = 1; j < 21; j++) {
				// 掛け算の式
				int answer = i * j;

				// 左辺が9の段までは2桁で0埋め　左辺が10の段以降は3桁で0埋めする
				if (j >= 20) {
					System.out.printf("%03d * %03d = %03d %n", j, i, answer);

					// それ以外は2桁で0埋め、答えは3桁で0埋めする
				} else {
					System.out.printf("%03d * %03d = %03d || ", j, i, answer);

				}
			}
		}
	}
}
