package question1_25a;
// Scannerクラスは、Javaで標準入力からデータを読み取るための便利なクラスです。
import java.util.Scanner;

import question1_25b.Sub;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成して、scannerという名前の変数に代入しています。
		Scanner scanner = new Scanner(System.in);
		// ユーザーが入力した次の行を読み取り、それを文字列として返します。ユーザーが入力した値を name 変数に格納します。
		String name = scanner.nextLine();
		// Sub クラスの新しいインスタンスを作成し、bbb という変数に代入しています。引数 name を使用して、Sub クラスの新しいインスタンスが生成されます。
		Sub bbb = new Sub(name);
		// bbb.setValue(); は、bbb というオブジェクトの setValue メソッドを呼び出しています。
		bbb.setValue();
		// 引数として渡されたオブジェクトの文字列表現を出力します。
		System.out.println(bbb);
	}
}

/*
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */
