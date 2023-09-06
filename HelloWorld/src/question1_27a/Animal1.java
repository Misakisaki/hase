package question1_27a;

public class Animal1 {
	// 動物名
	String name;
	String bodylength;
	String speed;
	String schoolname;

	public Animal1(String name, String array02, String array022) {

		super();
		// nameというインスタンス変数に、引数として渡されたnameという値を代入する役割を持ちます。
		this.name = name;
		// bodylengthというインスタンス変数に、引数として渡されたbodylengthという値を代入する役割を持ちます。
		this.bodylength = array02;
		// speedというインスタンス変数に、引数として渡されたspeedという値を代入する役割を持ちます。
		this.speed = array022;

		System.out.print(toString());

		switch (name) {
		case "ライオン":
			this.schoolname = "パンテラ レオ";
			System.out.println("\n学名：" + schoolname);

			// 値1に対する処理
			break;
		case "ゾウ":
			this.schoolname = "ロキソドンタ・サイクロティス";
			System.out.println("\n学名：" + schoolname);
			// 値2に対する処理
			break;
		case "パンダ":
			this.schoolname = "アイルロポダ・メラノレウカ";
			System.out.println("\n学名：" + schoolname);
			// 値3に対する処理
			break;
		case "チンパンジー":
			this.schoolname = "パン・トゥログロディテス";
			System.out.println("\n学名：" + schoolname);
			// 値3に対する処理
			break;
		case "シマウマ":
			this.schoolname = "チャップマンシマウマ";
			System.out.println("\n学名：" + schoolname);
			// 値3に対する処理
			break;
		// 追加のcase文
		default:
			this.schoolname = "不明";
			System.out.println("\n学名：" + schoolname);
			// 上記のいずれの値にも一致しない場合の処理
			break;
		}

	}

	// nameは文字列型の変数であると仮定します。getNameメソッドは、インスタンスのname変数の値を呼び出し元に返すためのコードです。
	public String getName() {
		return name;
	}

	// setNameメソッドは、nameという名前の変数の値を設定します。nameは文字列型の変数であると仮定します。setNameメソッドは、引数として渡されたnameの値をインスタンスのname変数に代入します。this.nameは、インスタンス
	public void setName(String name) {
		this.name = name;
	}

	public String getBodylength() {
		return bodylength;
	}

	public void setBodylength(String bodylength) {
		this.bodylength = bodylength;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	@Override
	public String toString() {
		return "\n動物名：" + getName() + "\n体長：" + getBodylength() + " m " + "\n速度：" + getSpeed() + " km/h ";
	}
}


/*

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