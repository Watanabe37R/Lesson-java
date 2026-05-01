package com.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

//問９
public class Practice9 {

	public static void main(String[] args) {
		//各種変数の初期化
		int price = 0;				//単価価格
		int quantity = 0;			//個数
		int priceOriginal = 0;		//値引き前の価格合計
		int priceOfNebiki = 0;		//単価による値引き額
		int quantityOfNebiki = 0;	//個数による値引き額
		int resultNebiki = 0;		//値引き額の合計
		int resultPrice = 0;		//税抜き価格の合計
		int resultPriseAddTax = 0;	//税込み価格の合計
		
		//try-with-resourseで自動cloceかつ、try-catchも行う
		try (Scanner scan = new Scanner(System.in);) {
			//1.単価入力
			System.out.print("商品の単価を入力してください：");
			price = scan.nextInt();
			if (price < 0)
				throw new IllegalArgumentException("価格の入力が不正です");
			//2.個数入力
			System.out.print("購入個数を入力してください：");
			quantity = scan.nextInt();
			if (quantity < 0)
				throw new IllegalArgumentException("個数の入力が不正です");

			//3.割引き前での合計金額
			priceOriginal = price * quantity;
			System.out.println("値引き前の価格(合計)は：" + priceOriginal);

			//4.割引き計算
			Nebiki nebiki = new Nebiki();
			//価格に対しての値引き額
			if (price >= 10000) {
				priceOfNebiki = nebiki.percent10(price);
			} else if (price >= 5000) {
				priceOfNebiki = nebiki.percent5(price);
			}
			//個数に対しての値引き額
			if (quantity >= 5) {
				quantityOfNebiki = nebiki.quantityNebiki5(quantity);
			} else if (quantity >= 3) {
				quantityOfNebiki = nebiki.quantityNebiki3(quantity);
			}
			//5.値引き額の合計
			resultNebiki = priceOfNebiki + quantityOfNebiki;

			//6.合計金額の算出
			//(税抜き合計＝値引き前ー値引き額)
			resultPrice = priceOriginal - resultNebiki;
			
			//消費税の計算
			resultPriseAddTax = (int) (resultPrice * 1.1);

			//7.出力
			System.out.println("商品の単価：" + price +
					"\n購入個数：" + quantity +
					"\n割引き前の合計金額：" + priceOriginal +
					"\n割引額：" + resultNebiki +
					"\n割引き後の価格：" + resultPrice +
					"\n消費税額：" + (resultPriseAddTax - resultPrice) +
					"\n税込み価格：" + resultPriseAddTax);
			
			//マイナスの値が入力された際の例外
		} catch (IllegalArgumentException e) {
			System.out.println("例外が発生しました：" + e.getMessage());
			//数値以外が入力された際の例外
		} catch (InputMismatchException e) {
			System.out.println("数値以外が入力されました：：" + e.getMessage());
		}
	}
}

//割引き用
class Nebiki {
	//5,000円以上の時
	int percent5(int p) {
		return (int) (p * 0.05);
	}

	//10,000円以上の時
	int percent10(int p) {
		return (int) (p * 0.1);
	}

	//3個以上の時
	int quantityNebiki3(int q) {
		return q * 50;
	}

	//5個以上の時
	int quantityNebiki5(int q) {
		return q * 100;
	}
}