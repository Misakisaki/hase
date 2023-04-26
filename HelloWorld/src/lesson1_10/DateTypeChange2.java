package lesson1_10;
public class DateTypeChange2 {
	/*	
	問題.for文を使用して九九の計算を出力してください。
		※出力例 	1×1=1 1×2=2…1×9=9
					2×1=2 2×2=4…2×9=18
							・
							・
							・
					9×1=9 9×2=18…9×9=81
	 */

	public static void main(String[] args) {

		int start_num = 1;
		int end_num = 9;
		for(int i = start_num; i <= end_num; i++){
			for(int j = start_num; j <= end_num; j++){
				System.out.print( i+"×"+j+"="+i*j+"　");
			}
			System.out.println();
		}
	}
}
