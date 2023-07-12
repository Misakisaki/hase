package question1_23b;
public class Question1_23b {

	private String name = "ライオン";
	private String bodylength = "2.1";
	private String speed = "80";

	public String getname() {
		return name;
	}

	public void setライオン(String name) {
		this.name = name;
	}

	public String getBodylength() {
		return bodylength;
	}

	public void setBodylength(String bodylength) {
		this.bodylength = bodylength;
	}

	public String getSpeed() {
		return getSpeed();
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	public String toString() {
		return "動物名：" + name + "\n" + "体長：" + bodylength + "m" + "\n速度：" + speed + "km/h";
	}

	public void setname(String string) {
		// TODO 自動生成されたメソッド・スタブ
		
	}}

/*

下記がコンソールに出力されるように作成してください
※thisとsetterとgetterとフィールドを使ってください

動物名：ライオン
体長：2.1m
速度：80km/h

*/