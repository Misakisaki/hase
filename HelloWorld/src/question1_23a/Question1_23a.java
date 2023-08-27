package question1_23a;

import question1_23b.Question1_23b;

public class Question1_23a {

	public static void main(String[] args) {

		// Question1_23bクラスをインスタンス化する
		Question1_23b Question1_23b = new Question1_23b();
		// セッターを呼び出す
		// 動物名：ライオン
		Question1_23b.setname1("ライオン");
		// 体長：2.1m
		Question1_23b.setBodylength("2.1");
		// 速度：80km/h
		Question1_23b.setSpeed("80");
		// ゲッターを呼び出して変数に代入し、各内容をコンソールに出力してください。
		System.out.println(Question1_23b);
	}
}
