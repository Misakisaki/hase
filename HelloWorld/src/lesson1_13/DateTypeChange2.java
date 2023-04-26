package lesson1_13;

public class DateTypeChange2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		①配列aを作成し、1～5を格納してください。

		②参照型配列bを作成し、3を表示してください。
			出力結果：3

		③配列a[3]を10で上書きし表示してください。
			出力結果：10

		④配列aの要素数を「配列aの要素数は、○です。」という形で表示してください。
			出力結果：配列aの要素数は、５です。
		 */
		// 配列aを作成し、1~5を格納
		int[] a = {1, 2, 3, 4, 5};
		
		// 参照型配列bを作成し、３を表示する
		int[] b = a;
		System.out.println(b[2]);
		
		// 配列a[3]を10で上書きし表示
		a[3] = 10;
		System.out.println(a[3]);
		
		// 配列aの要素数を「配列aの要素数は、○です。」という形で表示
		System.out.println("配列aの要素数は、" + a.length + "です。");
	}
}




