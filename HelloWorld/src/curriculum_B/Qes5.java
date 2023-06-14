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
				// String.format(書式文字列, 値);
				// %02d
				// %・・・書式文字列であることを表す指示子
				// 0・・・埋める文字。この場合ゼロ
				// 2・・・桁数。2桁
				// d・・・出力する値の型。この場合整数(decimal)
				// j*iの掛け算を2桁で0埋めする
				sj.add(String.format("%02d", j)).add("*").add(String.format("%02d", i))
						// 3・・・桁数。掛け算の答えを3桁で0埋めする
						.add("=").add(String.format("%03d", answer));
				// 掛け算の結果出力
				System.out.print(sj);
			}
			System.out.println();
		}
	}
}
