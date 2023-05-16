package question1_19;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	// 変数の定義
	String AnimalName;
	// Q2：フィールドに動物の数の変数を定義してください。
	int AnimalMath;
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	//コンストラクタに関する記述 
	public Dog() {
		this.AnimalName = "犬";
	}
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public Dog(int head) {
		AnimalMath = head;
	}
}