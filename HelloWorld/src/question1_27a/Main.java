package question1_27a;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成して、scannerという名前の変数に代入しています。
		Scanner scanner = new Scanner(System.in);
		// ユーザーが入力した次の行を読み取り、それを文字列として返します。ユーザーが入力した値を name 変数に格納します。
		String name = scanner.nextLine();
		// いろんな処理...
		scanner.close();
		// 変数 nameが null以外の時だけ toUpperCase()メソッドを呼び出し(try-catch文も利用できる）
		if (name != null) {
			toUpperCase(name);
		} else {
			// "変数nameはnullです"
			System.out.println("null");
		}
	}

	private static void toUpperCase(String name) {
		// TODO 自動生成されたメソッド・スタブ
		// ストリングでarray01にスプリット（カンマ）でsplit　区切りたい文字列を 配列array01を代入
		String[] array01 = name.split(",");
		System.out.print("コンソールに文字を入力してください");
		// for文で 大きな枠組みで区切った配列を繰り返す
		for (int i = 0; i < array01.length; i++) {
			// array01の配列のi番目のライオンを呼び出して(ライオン:2.1:80)　array02に代入   名前、体長、速度が順番に出る
			String[] array02 = array01[i].split(":");
			// for (初期化 ; 条件式 ; 変化式) {
			// Animalクラスをインスタンス化する
			Animal1 Animal1 = new Animal1(array02[0], array02[1], array02[2]);
		}
	}
}

/*
 コロン：　カンマ,　区切る
（ライオン・ゾウ・パンダ・チンパンジーetc...）　配列に入れあと
（パンテラ レオ   ロキソドンタ・サイクロティス  アイルロポダ・メラノレウカetc...） 配列にする 
question1_27bを呼び出す
配列をもとに
for文　動物名と体長と速度と学名　セットして出力までが１セット
ライオンの場合　パンテラ レオ（学名）を出す処理
学名だけif文


コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	
コンソール出力結果
	
コンソールに文字を入力してください
動物名：ライオン
体長：2.1m
速度：80km/h
学名：パンテラ レオ

動物名：ゾウ
体長：3.2m
速度：40km/h
学名：ロキソドンタ・サイクロティス

動物名：パンダ
体長：1.9m
速度：30km/h
学名：アイルロポダ・メラノレウカ

動物名：チンパンジー
体長：0.94m
速度：25km/h
学名：パン・トゥログロディテス

動物名：シマウマ
体長：2.4m
速度：65km/h
学名：チャップマンシマウマ

動物名：インコ
体長：0.1m
速度：50km/h
学名：不明


*/