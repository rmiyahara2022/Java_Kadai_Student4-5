
public class Student5 {
	private String name;
	private int score;
	// int score; privateを指定しなければ、setScoreを使わずに直接scoreの値を外部から変更できてしまう=範囲外の値を直接設定できてしまう
	
	public Student5(String n) {
		name = n;
	}
	public void setScore(int s) {
		if(0 <= s && s <= 100) {
			score = s;
		} else {
			System.out.println(name + "さんの点数が範囲外です");
			score = 0;
		}
	}
	void display() {
		System.out.println(name + "さん" + score + "点");
	}
}
