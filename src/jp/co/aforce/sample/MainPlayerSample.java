package jp.co.aforce.sample;

public class MainPlayerSample {

	public static void main(String[] args) {
		//プレイヤー１のインスタンス生成
		PlayerSample p1 =new PlayerSample();
		//プレイヤー２のインスタンス生成
		PlayerSample p2 =new PlayerSample();	
		
		System.out.println("初期状態");
		System.out.println("p1.hp="+p1.hp);
		System.out.println("p2.hp="+p2.hp);
		
		//p1がダメージを受ける
		p1.hp-=30;
		
		System.out.println("\nダメージ後");
		System.out.println("p1.hp="+p1.hp);
		System.out.println("p2.hp="+p2.hp);
	}

}
