package lesson1_18;
import java.util.Random;
public class Curriculum_New_1_18 {	
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。	
	public static void printData(String name, int age) {
		System.out.println(name + age); 
		System.out.println(" ");
	}
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	private static void keisan(int n1 ,int n2){
		System.out.println(n1 * n2);
		System.out.println(" ");
	}
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void printArrays(int[] arr){
		for(int i = 0;i < arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println(" ");
	}
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void num(double num1,double num2) {
		// 引数同士を和算する変数を定義
		double result = num1 + num2;
		// 結果をコンソールに出力
		System.out.println(result);
		System.out.println(" ");
	}
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int [] numbers(int number) {
		// 1~100までのランダムな数字を作成・格納 Random();クラスを呼び出す
		Random math = new Random();
		// 配列の変数名をRandonMix[]にする。
		int [] RandonMix = new int[number]; 
		// 引数の回数分作られたランダムな数字を順番にコンソールで出力
		for(int con= 0; con < RandonMix.length; con++) {
			System.out.println(RandonMix[con] = math.nextInt(100)+1);
		}
		// 格納した値を返す
		return RandonMix;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double average(int[] RandonMix){ // Q5の返り値を受け取る
		// 平均値を求めるためにRandonMixの中の値を足し算する
		int plusTotal = 0; 
		for(int number : RandonMix){
			plusTotal += number;
		}
		// 戻り値（足し算）の合計を　lengthを使って配列の数で割る
		double num = plusTotal/RandonMix.length;
		// 平均値をコンソールに出力する
		System.out.println("");
		System.out.println(num);
		// 平均値を返す
		return num;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static boolean bool(double num){
		if(num > 50){
			return true;
		}
		else {
			return false;
		}
	}
	// 作成したメソッドをここで呼び出してください
	public static void main(String[] args) {
		printData("Hello JavaSE ", 11);  // Q1
		keisan(8, 10);                   // Q2
		int[] arr = {3,1,5,4,6,2};       // Q3
		printArrays(arr);                // Q4
		// numbers(6);                   // Q5 
		// average(numbers(6));     　　　// Q6
		System.out.println(bool(average(numbers(6))));  // Q7
	}
}
