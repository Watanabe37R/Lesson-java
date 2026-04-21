package jp.co.aforce.sample;

import java.time.LocalDate;
import java.util.Scanner;

public class Chapter3Exercises {

	public static void main(String[] args) {
		//問１
		int num = 10;
		System.out.println("問１：" + num);
		//問２
		int a = 8;
		int b = 5;
		int sum = a + b;
		System.out.println("問２：" + sum);
		//問３
		int width = 7;
		int height = 4;
		int area = width * height;
		System.out.println("問３：" + area);
		//問４
		String name = "Java";
		double version = 17.0;
		boolean isFun = true;
		System.out.println("問４　name:" + name + " version:" + version + " isFun:" + isFun);
		//問５
		Scanner scanner = new Scanner(System.in);
		String scan = scanner.nextLine();
		System.out.println("問５：こんにちは" + scan + "さん！");
		scanner.close();
		//問６
		LocalDate birthday = LocalDate.of(96, 8, 3);
		String strFormat = String.format("問６　名前:%s、年齢:%d、誕生日:%tF", "名前", 30, birthday);
		System.out.println(strFormat);
		//問７
		String product = "Laptop";
		int price = 1200;
		int quantity = 3;
		String result = String.format("問７　商品：%sは、価格：%d円なので、%d個買うと%d円です。", product, price, quantity, price * quantity);
		System.out.println(result);
		//問８
		Question question = new Question();
		int result8 = question.Question8();
		System.out.println("問８：" + result8);
		//問９
		int result9 = question.Question9();
		System.out.println("問９：" + result9);
		//問11
		int result11 = question.Question11();
		System.out.println("問11：" + result11);
		//問13
		int result13 = question.Question13();
		System.out.println("問13：" + result13);
	}
}

class Question {
	public int Question8() {
		int a = 5;
		int b = 10;
		int c = 15;
		int result = (a + b) * c / (a - b);
		return result;
	}

	public int Question9() {
		double x = 4.0;
		double y = 2.0;
		double z = Math.pow(x, y) - Math.sqrt(y);
		//System.out.println((int)z);
		return (int) z;
	}

	//問10
	public void Question10() {
		//int a = "10"; //エラー！
		double b = 3.14;
		//String c = 'Java'; //エラー！
		int x = 100;
	}

	public int Question11() {
		int x = 5;
		x++;
		x--;
		return x;
	}

	//問12
	public void Question12() {
		final int MAX = 100;
		//MAX = 200; //エラー！
		System.out.println(MAX);
	}

	public int Question13() {
		double d = 9.7;
		int i = (int) d;
		return i;
	}
	//問14
	public void Question14() {
		int x;
		//System.out.println(x); //エラー！
	}
}
