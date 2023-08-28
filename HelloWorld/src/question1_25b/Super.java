package question1_25b;

// Javaでjava.util.Randomクラスをインポートしていることを示しています。
import java.util.Random;

// public class Super：publicは、このクラスがどのクラスからでもアクセス可能であることを示します。
public class Super {
	// 名前（フィールド）
	private String name;
	// HP：849
	private int hp;
	// MP：862
	private int mp;
	// 攻撃力：375
	private int power;
	// 素早さ：937
	private int agility;
	// 防御力：24
	private int defense;

	// コンストラクタがどのクラスからでもアクセス可能なクラスString型の引数nameを受け取ります。
	public Super(String name) {
		// コンストラクタの引数nameの値をクラスのフィールドnameに代入することです。
		this.name = name;
	}

	// setValue()メソッドは整数の値を設定し、それをコンソールに出力するだけの処理を行います。
	public void setValue() {
		// 新しいRandomクラスのインスタンスを作成
		Random rand = new Random();
		// hpという名前の変数に1から1000までの範囲のランダムな整数を代入する
		hp = rand.nextInt(1000) + 1;
		// mpという名前の変数に1から1000までの範囲のランダムな整数を代入する
		mp = rand.nextInt(1000) + 1;
		// powerという名前の変数に1から1000までの範囲のランダムな整数を代入する
		power = rand.nextInt(1000) + 1;
		// agilityという名前の変数に1から1000までの範囲のランダムな整数を代入する
		agility = rand.nextInt(1000) + 1;
		// defenseという名前の変数に1から1000までの範囲のランダムな整数を代入する
		defense = rand.nextInt(1000) + 1;
	}

	// gethpメソッドはhpという名前の変数の値を返します。
	public int gethp() {
		return hp;
	}

	// sethpメソッドはhpという名前の変数の値を設定します。
	public void sethp(int hp) {
		this.hp = hp;
	}
	
	// getmpメソッドはmpという名前の変数の値を返します。
	public int getmp() {
		return mp;
	}

	// setmpメソッドはmpという名前の変数の値を設定します。
	public void setmp(int mp) {
		this.mp = mp;
	}
	
	// getpowerメソッドはpowerという名前の変数の値を返します。
	public int getpower() {
		return power;
	}

	// setpowerメソッドはpowerという名前の変数の値を設定します。
	public void setpower(int power) {
		this.power = power;
	}
	
	// getagilityメソッドはagilityという名前の変数の値を返します。
	public int getagility() {
		return agility;
	}

	// setagilityメソッドはagilityという名前の変数の値を設定します。
	public void setagility(int agility) {
		this.agility = agility;
	}
	
	// getdefenseメソッドはdefenseという名前の変数の値を返します。
	public int getdefense() {
		return defense;
	}

	// setdefenseメソッドはdefenseという名前の変数の値を設定します。
	public void setdefense(int defense) {
		this.defense = defense;
	}

	// getName()メソッドはnameフィールドの値を返します。クラス内部でフィールドにアクセスする際には、このようなアクセスメソッドを利用することで、カプセル化を実現します。
	public String getName() {
		return name;
	}

	// ClassNameはクラス名を表し、instanceはそのクラスのインスタンスです。setNameメソッドを呼び出すことで、instanceのname変数に値"John"が設定されます。
	public void setName(String name) {
		this.name = name;
	}

	// toString()メソッドは以下のような文字列を返します：「 名前 」 さん ステータスHP：10   MP：20 攻撃力：30   素早さ：40  防御力：50   さあ冒険に出かけよう！
	public String toString() {
		return "こんにちは 「 " + name + " 」 さん\n" + "ステータス\n" + "HP：" + hp + "\nMP：" + mp + " \n攻撃力："
				+ power + "\n素早さ：" + agility + "\n防御力：" + defense + "\n\nさあ冒険に出かけよう！";
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
