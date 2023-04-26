package lesson1_13;
public class DateTypeChange1 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		int型の配列aを作成してください。
		配列aに1～5の数字を格納してください。
		繰り返し処理を使用し、
		配列aの数字を順番に表示させてください。

		出力結果：1
				  2
				  3
				  4
				  5
		 */
		// 1~5を入れるための配列宣言
		int[] a = {1, 2, 3, 4, 5};
		// 配列aから順番に数字を表示する処理
		for(int i = 0;  i <= 4; i++){
			System.out.println(a[i]);
		}
	}
}
