package curriculum_B;

import java.util.StringJoiner;

public class Qes4 {
	public static void main(String[] args) {
		// 課題４
		// 1~9の入った変数の定義
		int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// 変数0の定義、１ずつ足していく処理
		for (int i = 0; i < number.length; i++) {
			// 変数0の定義、１ずつ足していく処理
			for (int j = 0; j < number.length; j++) {
				// 掛け算の式
				int answer = number[i] * number[j];
				// StringJoinerを使用した文字列の連結方法
				StringJoiner sj = new StringJoiner(" ", " ", " || ");
				sj.add(String.format("%02d", number[i])).add("*").add(String.format("%02d", number[j]))
						.add("=").add(String.format("%02d", answer));
				// 掛け算の結果出力
				System.out.print(sj);
				// 改行
				System.out.println();
			}
		}
	}
}