package lesson1_14;
public class practice {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//		string型の配列を作成し、アルファベットa～jまでを格納してください。
		//		brake文を使用し、a～dまで表示してください。
		//	
		//		 出力結果：a
		//		           b
		//		           c
		//		           d
		//		          
		//		cotinue文を使用し、i以外を表示してください。
		//	
		//		 出力結果：a
		//		           b
		//		           c
		//		           d
		//		           e
		//		           f
		//		           g
		//		           h
		//		           j
		String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

		// iはindex番号をループ処理 for文と配列は相性が抜群
		for (int i = 0; i < alpha.length; i++) {
			if(i == ４) {
				// 強制的に終了し次の処理へ移る
				break;
			}else {
				System.out.println(alpha[i]);
			}
		}

		for (int j = 0; j < alpha.length; j++) {
			// カウンタ変数iをインデックスとして利用
			if(j == 8) {
				continue;
				// for文のループをcontinue文でスキップする
			}else {
				System.out.println(alpha[j]);
			}
		}
	}
}