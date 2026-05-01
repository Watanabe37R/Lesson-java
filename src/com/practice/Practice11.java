package com.practice;

import java.util.ArrayList;

public class Practice11 {

	public static void main(String[] args) {
		//各書籍を格納
		ArrayList<Book> bookList = new ArrayList<>();
		bookList.add(new Book("Python入門", "山田太郎", 1500, 2500));
		bookList.add(new Book("データ分析の基礎", "鈴木花子", 1200, 3000));
		bookList.add(new Book("AI技術最前線", "佐藤一郎", 800, 4000));
		bookList.add(new Book("Webデザイン講座", "田中美咲", 2000, 2000));
		bookList.add(new Book("はじめての機械学習", "中村健一", 900, 3500));

		//実装した機能を使う場所
		int allBookUriage = 0;	//総売り上げ
		double mostGoodBook=0;	//最も価格あたりの販売数係数がいいものの係数を入れる箱
		Book goodBook = null;	//最も価格あたりの販売数係数がいいものの本体を入れる箱
		Calculagle calculagle = new Calculagle();
		for (Book b : bookList) {
			//総売り上げ計算
			allBookUriage += calculagle.soUriage(b);
			//1000冊以上の販売数か
			if(calculagle.over1000(b)) {
				System.out.println(b.getBookName()+"は販売数1000冊以上です");
			}
			//最も価格あたりの販売効率がいい本は？
			if(calculagle.goodBooks(b)>mostGoodBook) {
				mostGoodBook=calculagle.goodBooks(b);
				goodBook=b;
			}
			
		}
		System.out.println("全書籍の総売り上げは；"+allBookUriage+"円");
		System.out.println("最も価格あたりの販売効率がよいのは、"+goodBook.getBookName()+"であり、\n"
				+ "その係数は"+mostGoodBook+"冊/円です");
	}

}

/* ****************************************** *
 * 1.書籍の情報を格納するクラスです。
 * インスタンス作成時にデータを格納します。
 * 各データは以下の通りです
 * 書籍名：bookName
 * 著者名：writeName
 * 販売数：uriage
 * 価格：price
 * また、各データはゲッターによってその値を取得できます
 * ****************************************** */
class Book {
	private String bookName;
	private String writerName;
	private int uriage;
	private int price;

	Book(String bookName, String writerName, int uriage, int price) {
		this.bookName = bookName;
		this.writerName = writerName;
		this.uriage = uriage;
		this.price = price;
	}

	String getBookName() {
		return bookName;
	}

	String getWriterName() {
		return writerName;
	}

	int getUriage() {
		return uriage;
	}

	int getPrice() {
		return price;
	}
}

/* *************************************** *
 * 2.各種計算用のクラスです。
 * 各本の総売り上げ：soUriage
 * 販売数が1000札を超えているか判定：over1000
 * ※超えていた場合はtrueを返す
 * 価格当たりの販売効率指数を求める：goodBooks
 * ※販売効率指数は(販売数/価格)で指定
 * *************************************** */
class Calculagle {
	int soUriage(Book book) {
		return book.getUriage() * book.getPrice();
	}

	boolean over1000(Book book) {
		return book.getUriage() >= 1000;
	}

	double goodBooks(Book book) {
		return book.getUriage() / book.getPrice();
	}
}