package question1_19;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Animal1 {
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		// Dogクラスをインスタンス化する
		Dog bbb = new Dog();
		System.out.println(bbb.AnimalName);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog aaa = new Dog(6);
		System.out.println(aaa.AnimalMath);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		//Calendarクラスのオブジェクトを生成する
		Calendar cl = Calendar.getInstance();
		//SimpleDateFormatクラスでフォーマットパターンを設定する
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		System.out.println(sdf.format(cl.getTime()));
	}
}