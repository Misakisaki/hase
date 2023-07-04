package question1_25b;

import java.util.Random;

public class Super {

	private String name;
	private int hp;
	private int mp;
	private int power;
	private int agility;
	private int defense;

	public Super(String name) {
		this.name = name;
	}
	

	public void setValue() {
		Random rand = new Random();
		hp = rand.nextInt();
		mp = rand.nextInt();
		power = rand.nextInt();
		agility = rand.nextInt();
		defense = rand.nextInt();
	}

	public int getagility() {
		return agility;
	}

	public void setagility(int agility) {
		this.agility = agility;
	}

	public int getdefense() {
		return defense;
	}

	public void setdefense(int defense) {
		this.defense = defense;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	

	public String toString() {
		return "こんにちは 「" + name + "」 さん\n" + "ステータス\n" + "HP：" + hp + "\nMP：" + mp + " \n攻撃力："
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
