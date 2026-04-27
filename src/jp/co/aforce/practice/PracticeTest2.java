package jp.co.aforce.practice;

//型
public class PracticeTest2 {

	public static void main(String[] args) {
		//問１
		final int TAX = 10;

		//問２
		int x = 480;
		double price = x * TAX / 100;	//xとTAXの積をpriceに代入
		price += x; 					//税込み金額を作成
		System.out.println("税込み金額は：" + price);

		//問３
		String name="渡邉涼太";
		System.out.println(name);
		
		//問４
		String preposition="この商品の値段は";
		String postfix="円です";
		System.out.println(preposition+price+postfix);
	}

}
