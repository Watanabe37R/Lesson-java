package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chapter7of2Exercises {

	public static void main(String[] args) {
		System.out.println("while文");
		Question7of2 question7of2 = new Question7of2();
		//問題１－１
		question7of2.Question1of1();
		//問題１－２
		question7of2.Question1of2();
		//問題１－３
		//scannerを使用しているため、デバッグのタイミングで
		//コメントアウトを外す
		//question7of2.Question1of3();
		System.out.println("do-while文");
		//問題２－１
		question7of2.Question2of1();
		//問題２－２
		question7of2.Question2of2();
		//問題２－３
		//scannerを使用しているため、デバッグのタイミングで
		//コメントアウトを外す
		//question7of2.Question2of3();
		System.out.println("for");
		//問題３－１
		question7of2.Question3of1();
		//問題３－２
		question7of2.Question3of2();
		//問題３－３
		question7of2.Question3of3();
		System.out.println("拡張for");
		//問題４－１
		question7of2.Question4of1();
		//問題４－２
		question7of2.Question4of2();
		//問題４－３
		question7of2.Question4of3();
		//問題４－４
		question7of2.Question4of4();
		//問題４－５
		question7of2.Question4of5();
		//問題４－６
		question7of2.Question4of6();
		System.out.println("break");
		//問題５－１
		question7of2.Question5of1();
		//問題５－２
		question7of2.Question5of2();
		//問題５－３
		question7of2.Question5of3();
	}
}

class Question7of2 {
	public void Question1of1() {
		int i = 0;
		System.out.print("問１：");
		while (i <= 10) {
			System.out.print(i + ",");
			i++;
		}
		System.out.println();
	}

	public void Question1of2() {
		int i = 0;
		int sum = 0;
		System.out.print("問２：");
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("合計は" + sum);
	}

	public void Question1of3() {
		System.out.println("問３　整数を好きなだけ入力\n０を入力すると終了します");
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		while (true) {
			num = scan.nextInt();
			if (num == 0) {
				System.out.println("合計は" + sum);
				break;
			}
			sum += num;
		}
	}

	public void Question2of1() {
		System.out.print("問１：");
		int i = 1;
		do {
			System.out.print(i + ",");
			i++;
		} while (i <= 10);
		System.out.println();
	}

	public void Question2of2() {
		System.out.print("問２：");
		int i = 1;
		int sum = 0;
		do {
			sum += i;
			i++;
		} while (i <= 100);
		System.out.println("合計は" + sum);
	}

	public void Question2of3() {
		System.out.println("問３　整数を好きなだけ入力\n０を入力すると終了します");
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		do {
			num = scan.nextInt();
			sum += num;
			if (num == 0) {
				System.out.println("合計は" + sum);
				break;
			}
		} while (true);
	}

	public void Question3of1() {
		System.out.print("問１：");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ",");
		}
		System.out.println();
	}

	public void Question3of2() {
		System.out.print("問２：");
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("合計は" + sum);
	}

	public void Question3of3() {
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		//初項
		System.out.print("問３：1,1,");
		for (int i = 0; i < 10 - 2; i++) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.print(num3 + ",");
		}
		System.out.println();
	}

	public void Question4of1() {
		System.out.print("問１：");
		int[] numList = { 1, 1, 4, 5, 1, 4 };
		for (int n : numList) {
			System.out.print(n + ",");
		}
		System.out.println();
	}

	public void Question4of2() {
		System.out.print("問２：");
		ArrayList<String> arr = new ArrayList<>(List.of(
				"西新井", "大師前"));
		for (String name : arr) {
			System.out.print(name + ",");
		}
		System.out.println();
	}

	public void Question4of3() {
		System.out.print("問３：");
		int[] numList = { 5, 7, 3 };
		int sum = 0;
		for (int n : numList) {
			sum += n;
		}
		System.out.println(sum);
	}

	public void Question4of4() {
		System.out.print("問４：");
		int[] numbers = { 1, 2, 3, 4, 5 };
		// ここに拡張for文を追加して、配列の要素を出力してください
		for (int n : numbers) {
			System.out.print(n + ",");
		}
		System.out.println();
	}

	public void Question4of5() {
		System.out.print("問５：");
		int[] numbers = { 1, 2, 3, 4, 5 };
		int sum = 0;
		// ここに拡張for文を追加して、配列の要素の合計を計算してください
		for (int n : numbers) {
			sum += n;
		}
		System.out.println("合計: " + sum);
	}

	public void Question4of6() {
		System.out.print("問６：");
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		// ここに拡張for文を追加して、リストの要素を出力してください
		for (String item : names) {
			System.out.print(item + ",");
		}
		System.out.println();
	}

	public void Question5of1() {
		System.out.print("問１：");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ",");
			if (i == 5) {
				break;
			}
		}
		System.out.println();
	}

	public void Question5of2() {
		System.out.print("問２：");
		int[] numList = new int[10];
		for (int i = 0; i < 10; i++) { //配列の初期化
			numList[i] = i + 1;
		}
		for (int n : numList) {
			System.out.print(n + ",");
			if (n == 7) {
				break;
			}
		}
		System.out.println();
	}

	public void Question5of3() {
		System.out.print("問３：");
		int[][] numList = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		boolean flug = false;
		for (int[] arrList : numList) {
			for (int arrayList : arrList) {
				System.out.print(arrayList + ",");
				if (arrayList == 5) {
					flug = true;
					break;
				}
			}
			if (flug)
				break;
		}
		System.out.println();
	}
}
