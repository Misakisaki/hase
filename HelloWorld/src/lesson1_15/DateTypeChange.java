package lesson1_15;

public class DateTypeChange {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		①配列int test[][]に以下の成績を格納し、表示してください。
			出力結果：生徒1：国語64点、数学73点、英語69点
					  生徒2：国語58点、数学81点、英語75点
					  生徒3：国語86点、数学68点、英語79点
					  生徒4：国語72点、数学55点、英語80点

		②それぞれの教科の平均点を表示してください。
			出力結果：国語の平均点は○○点です。
					  数学の平均点は○○点です。
					  英語の平均点は○○点です。
		 */
		int test[][];
		test = new int[4][4];
		String[] subjects = {"英語", "国語", "数学"};
		test = new int[4][subjects.length];

		test[0][0] = 64;
		test[0][1] = 73;
		test[0][2] = 69;

		test[1][0] = 58;
		test[1][1] = 81;
		test[1][2] = 75;

		test[2][0] = 86;
		test[2][1] = 68;
		test[2][2] = 79;

		test[3][0] = 72;
		test[3][1] = 55;
		test[3][2] = 80;

		// iは生徒の数(4) 　for文は二個
		for(int i = 0; i < 4; i++){
			// jは教科の数（国語、数学、英語)
			String stu = "生徒";
			System.out.print(stu+(i+1)+"：");
			for(int j = 0; j < 3; j++){
				// 配列の何番目かを表すのは[]
				System.out.print(subjects[j]+test[i][j]+"点、");
			}
			System.out.println();
		}
		// 科目毎の平均点 　subjectsは（国語、数学、英語)
		for (int i = 0; i < subjects.length; i++) {
			int sum = 0;
			// testは点数　
			for (int j = 0; j < test.length; j++) {
				// 足し算と代入をまとめてやる演算子+=
				sum += test[j][i];
			}
			//それぞれの教科の平均点を表示
			System.out.println(subjects[i] + "の平均点:" + (int) sum / test.length + "点");
		}
	}
}

