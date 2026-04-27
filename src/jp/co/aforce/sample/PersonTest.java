package jp.co.aforce.sample;

public class PersonTest {

	public static void main(String[] args) {
		//nameにAlice、ageに30を設定してPeasonクラスのオブジェクトを生成
		PersonSample person = new PersonSample("Alice", 30);
		//PersonクラスのdisplayInfoメソッドを呼び出している。
		person.displayInfo();
	}

}
