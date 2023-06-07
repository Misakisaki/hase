package curriculum_B;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qes1_3 {
	public static void main(String[] args) {
		// コンソールにユーザー名を入力できるようにしてください
		Scanner scanner = new Scanner(System.in);
		// 1行を読み込んで返却
		String str = scanner.nextLine();
		// 正規表現のパターンを作成
		Pattern p = Pattern.compile("^[A-Za-z0-9]+$");
		Matcher m = p.matcher(str);
		// ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		if (str.length() > 10) {
			System.out.println("名前を10文字以内にしてください");
		}
		// ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		else if (str.length() <= 0 && str.isEmpty()) {
			System.out.println("名前を入力してください");
		}
		// ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
		else if (!m.find()) {
			System.out.println(str + "「半角英数字のみで名前を入力してください」");
		}
		// ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
		// ユーザー名「name」を登録しました
		else {
			System.out.println("「ユーザー名「" + str + "」を登録しました」");

			int count = 0;
			Scanner stdIn = new Scanner(System.in);
			Random rand = new Random();
			String[] hands = { "グー", "チョキ", "パー" };
			int retry = 1;
			do {
				int comp = rand.nextInt(3); // コンピューター側の手をランダムに選ぶ
				int user;
				do {
					System.out.println("じゃんけんゲーム！");
					// じゃんけんをランダムで行う
					for (int i = 0; i < 3; i++) {
						// (0)グー (1)チョキ (2)パー 　で　じゃんけんの表現
						System.out.printf("(%d)%s ", i, hands[i]);
					}
					// (0)グー (1)チョキ (2)パーの後ろにUserが入力できるように補助[：]
					System.out.print("：");

					user = stdIn.nextInt(); // ユーザー側に入力を促す
				} while (user < 0 || user > 2); // 0、1、2以外の数字が選ばれたら「コンピューター側の手をランダムに選ぶ」を繰り返す

				// 勝つまでにかかった合計回数のカウント
				count++;
				System.out.printf("あなた：%s\n相手：%s\n", hands[user], hands[comp]);
				// じゃんけんの三つの全てのパターンで勝つ
				if ((user == 2) && (comp == 0) || ((user == 0) && (comp == 1) || ((user == 1) && (comp == 2)))) {
					System.out.println("やるやん\r\n次は俺にリベンジさせて");
					System.out.println("勝つまでにかかった合計回数は" + count + "回です");
					// じゃんけんで勝ったら止めるブレークで止める。
					break;
					// 自分がじゃんけんでグーに負けた場合
				} else if ((user == 0) && (comp == 2)) {
					System.out.println("俺の勝ち！\r\n負けは次につながるチャンスです！\r\nネバーギブアップ！");
					// 自分がじゃんけんでチョキに負けた場合
				} else if ((user == 1) && (comp == 0)) {
					System.out.println("俺の勝ち！\r\nたかがじゃんけん、そう思ってないですか？\r\nそれやったら次も、俺が勝ちますよ");
					// 自分がじゃんけんでパーに負けた場合
				} else if ((user == 2) && (comp == 1)) {
					System.out.println("俺の勝ち！\r\nなんで負けたか、明日まで考えといてください。\r\nそしたら何かが見えてくるはずです");
					// あいこの場合
				} else if (user == comp) {
					System.out.println("DRAW あいこ もう一回しましょう！");
				}
				// 勝つまでじゃんけんを続ける。
			} while (retry == 0); 
		}
	}
}
