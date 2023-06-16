package curriculum_B;

import java.util.StringJoiner;

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

				// StringJoinerを使用した文字列の連結方法
				StringJoiner sj = new StringJoiner(" ", " ", " ||");
				// 左辺が9の段までは2桁で0埋め　左辺が10の段以降は3桁で0埋めする
				if (j > 9) {
					sj.add(String.format("%03d", j)).add("*").add(String.format("%02d", i))
							.add("=").add(String.format("%03d", answer));

					// それ以外は2桁で0埋め、答えは3桁で0埋めする
				} else {
					sj.add(String.format("%02d", j)).add("*").add(String.format("%02d", i))
							.add("=").add(String.format("%03d", answer));
				}
				// 掛け算の結果出力
				System.out.print(sj);
				// 改行
				System.out.println();
			}
		}
	}
}
