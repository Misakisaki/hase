package lesson1_16;
public class DataTypeAndMemory {

	// TODO 自動生成されたメソッド・スタブ
	// Q1：「A」という文字列を変数に代入してコンソールに出力してください。

	// Q2：「Hello Java」という文字列を変数に代入してコンソールに出力してください。

	// Q3：富士山の標高を整数で変数に代入してコンソールに出力してください。

	// Q4：円周率を小数点第二位まで変数に代入してコンソールに出力してください。

	// Q5：変数numsに「10, 100, 1000」が格納された配列を代入して、コンソールにメモリの番地が1のデータを出力してください。

	// Q6：Q5で作成した変数numsを変数bに代入し、その後変数bのメモリの番地が1のデータを「8」に上書きさせて
	//     コンソールに変数numsと変数bのメモリの番地が1のデータを出力させて、変数nums値が変わることを確認してください。

	//	基本データ型と参照型
	//	型とメモリの関係
	public static void main(String[] args) {
		// 「A」という文字列を変数に代入
		String strVar１ = "A";
		System.out.println(strVar１);

		// 「Hello Java」という文字列を変数に代入
		String strVar２ = "Hello Java";
		System.out.println(strVar２);

		// 富士山の標高を整数で変数に代入
		int mt = 3776;
		System.out.println(mt);

		// 円周率を小数点第二位まで変数に代入
		double v1 = 3.14;
		System.out.println(v1);

		// 変数numsに「10, 100, 1000」が格納された配列を代入し、メモリの番地が1のデータを出力
		int[] nums = { 10, 100, 1000};
		System.out.println(nums[1]);

		// Q5で作成した変数numsを変数bに代入し、その後変数bのメモリの番地が1のデータを「8」に上書きさせて
		// コンソールに変数numsと変数bのメモリの番地が1のデータを出力させて、変数nums値が変わることを確認してください。
		int[] b = nums;
		b[1] = 8;
		System.out.println(b[1]);
		System.out.println(nums[1]);
	}
}






