package question1_20_22a;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import question1_20_22b.Sushi;

public class Answer {

	public static void main(String[] args) {

		// Sushiクラスをインスタンス化する
		Sushi Sushi = new Sushi();

		// 〇〇の＝（Sushi.Javaのコンストラクタを呼び出す)セッターで引数に寿司を渡す
		Sushi.setSushiName("寿司");
		// 〇〇の＝（Sushi.Javaのコンストラクタを呼び出す)セッターで引数に日本を渡す
		Sushi.setKuniName("日本");
		// 〇〇の＝（Sushi.Javaのコンストラクタを呼び出す)セッターで引数に和食を渡す
		Sushi.setName("和食");

		// ゲッターを呼び出して変数に代入し、各内容をコンソールに出力してください。
		// こんにちは！ここは日本です！
		System.out.println("こんにちは！ここは" + Sushi.getKuniName() + "です! ");
		// この寿司はうまい
		System.out.println("この" + Sushi.getSushiName() + "はうまい");
		// 寿司は和食です
		System.out.println(Sushi.getSushiName() + "は" + Sushi.getName() + "です");
		// Calendarクラスのオブジェクトを生成する
		Calendar cl = Calendar.getInstance();
		// SimpleDateFormatクラスでフォーマットパターンを設定する
		SimpleDateFormat sdf = new SimpleDateFormat("今の現在日時はyyyy/MM/dd H:m:sです");
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		System.out.println(sdf.format(cl.getTime()));
	}
	/*
	 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です
	
	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
	*/

}