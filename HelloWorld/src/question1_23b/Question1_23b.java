package question1_23b;

public class Question1_23b {
	// name変数定義
	private String name;
	// bodylength変数定義
	private String bodylength;
	// speed変数定義
	private String speed;

	// getterとは、setterでセットしたフィールドのnameの値を取得して、returnで呼び出し元に値を返すメソッドのことを指しています。
	public String getname() {
		return name;
	}

	// setterは呼び出し元のメソッドから値を引数で受け取り、引数のnameの値をthisを使ってフィールドにセットしています
	public void setname1(String name) {
		this.name = name;
	}

	// getterとは、setterでセットしたフィールドのBodylengthの値を取得して、returnで呼び出し元に値を返すメソッドのことを指しています。
	public String getBodylength() {
		return bodylength;
	}

	// setterは呼び出し元のメソッドからBodylengthの値を引数で受け取り、引数の値をthisを使ってフィールドにセットしています
	public void setBodylength(String bodylength) {
		this.bodylength = bodylength;
	}

	// getterとは、setterでセットしたフィールドのSpeedの値を取得して、returnで呼び出し元に値を返すメソッドのことを指しています。
	public String getSpeed() {
		return getSpeed();
	}

	// setterは呼び出し元のメソッドからSpeedの値を引数で受け取り、引数の値をthisを使ってフィールドにセットしています
	public void setSpeed(String speed) {
		this.speed = speed;
	}

	// returnで呼び出し元に代入された値を返し出力するメソッド
	public String toString() {
		return "動物名：" + name + "\n" + "体長：" + bodylength + "m" + "\n速度：" + speed + "km/h";
	}

	public void setname(String string) {
		// TODO 自動生成されたメソッド・スタブ

	}
}

/*

下記がコンソールに出力されるように作成してください
※thisとsetterとgetterとフィールドを使ってください

動物名：ライオン
体長：2.1m
速度：80km/h

*/