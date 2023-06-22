package curriculum_B;

public class Qes4 {
	public static void main(String[] args) {
		// 課題5
		// 1~20の入った変数の定義
		// 変数0の定義、１ずつ足していく処理、1の段9の段まで表示
		for (int i = 1; i < 10; i++) {
			// 変数0の定義、１ずつ足していく処理 10の段から20の段まで表示
			for (int j = 1; j < 10; j++) {
				// 掛け算の式と答え
				int answer = i * j;
				// 1の段が9より小さい場合まで繰り返す処理
				if (j >= 9) {
					// 左辺が9の段までは2桁で0埋め、左辺が10の段以降は3桁で0埋めして出力
					System.out.printf("%02d * %02d = %02d %n", j, i, answer);
				} else {
					// それ以外は2桁で0埋め、答えは3桁で0埋めして処理
					System.out.printf("%02d * %02d = %02d || ", j, i, answer);
				}
			}
		}
	}
}