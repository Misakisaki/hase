package lesson1_11;

public class DateTypeChange {
	
	  public static void main(String[] args) {
	         int month = 1;
	         int days; 
	 
	         switch (month) { 
	         	case 2:
	         		days = 28; 
	         		break;
	         	case 4:
	         	case 6:
	         	case 9:
	         	case 11:
	                days = 30; 	
	                break;
	         	default:      
	                 days = 31; 
	                 break;
	         }
	         System.out.println(month + " 月は " + days + " 日です。"); 
	     }
	 }
	/*
	問題．switch文を使用し、以下のプログラムを作成してください。
			変数に数値を代入
			
		①2の場合は、「（変数）月は28日です。」
			出力結果：2月は28日です。
			
		②4，6，9，11の場合は、「（変数）月は30日です。」
			出力例：4月は30日です。
			
		③その他の場合は、「（変数）月は31日です。」
			出力例：1月は31日です。
*/




