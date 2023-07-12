package question1_20_22b;

public class Sushi {

	// Q1：フィールドに値の名前の変数を定義してください。
	private String SushiName = "寿司";
	private String Country = "日本";
	private String food = "和食";
	

	// 値をセットする（setter)
	// "日本";
	public void setKuniName(String Country) {
		this.Country = Country;
	}

	// "寿司";
	public void setSushiName(String SushiName) {
		this.SushiName = SushiName;
	}

	// "和食";
	public void setName(String food) {
		this.food = food;
	}

	public String getSushiName() {
		return SushiName;
	}

	public String getKuniName() {
		return Country;
	}

	public String getName() {
		return food;
	}
	// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

	//SimpleDateFormatクラスでフォーマットパターンを設定する
}
// メイン処理

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
	
[値]
	・日本・寿司・和食・2023/03/09 10:23:39
	・Sushiクラスに変数宣言
	・Answerクラスで出力

	クラス：Answer
	     　Sushi
	
	・出力担当
	・値を代入担当
	
*/
