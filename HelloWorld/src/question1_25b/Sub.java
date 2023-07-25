package question1_25b;

// SubクラスがSuperクラスを継承しており
public class Sub extends Super {
	// Subクラスのコンストラクタは親クラスSuperのコンストラクタを呼び出しています。
	public Sub(String name) {
		super(name);
	}

	// アノテーションが付いている場合、変数やメソッドが未使用であっても警告が表示されなくなります。
	@SuppressWarnings("unused")
	// privateなので同じクラス内からのみ呼び出すことができます
	private void set名前(String name) {
		// TODO 自動生成されたメソッド・スタブ
	}
}