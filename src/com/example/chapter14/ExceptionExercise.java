package com.example.chapter14;

import java.util.Scanner;

public class ExceptionExercise {

	public static void main(String[] args) {
		//問１
		//ScanNumber scan = new ScanNumber();

		//問２
		try {
			int result = 10 / 0;
			System.out.println("計算結果: " + result);
		} catch (ArithmeticException e) {
			System.out.println("例外が発生しました: " + e.getMessage());
		}
		System.out.println("プログラム終了");

		//問３
		try {
			String str = null;
			System.out.println(str.length());
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException が発生しました");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException が発生しました");
		} catch (Exception e) {
			System.out.println("Exception が発生しました");
		}

		//問４
		try {
			System.out.println("try ブロック開始");
			throw new RuntimeException("エラー発生");
		} catch (Exception e) {
			System.out.println("catch ブロック: " + e.getMessage());
		} finally {
			System.out.println("finally ブロック");
		}
		System.out.println("プログラム終了");

		//問５
		int n = 10;
		try {
			double ans = n / 0;
			System.out.println("答えは：" + ans);
		} catch (ArithmeticException e) {
			System.out.println("0で割ることはできません");
		}
		System.out.println("処理終了");

		//問６
		int numArr[] = new int[] { 1, 2, 3 };
		try {
			for (int i = 0; i <= numArr.length; i++) {
				System.out.print(numArr[i] + " ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の範囲外です");
		}

		//問７

		ScanNumber2 scan = new ScanNumber2();
	}
}

//問１
class ScanNumber {
	public ScanNumber() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("整数を入力してください：");
			String input = scan.next();
			int n = Integer.parseInt(input);
			double quotient = n / 2.0;
			System.out.println(n + "を２で割った値は" + quotient);
		} catch (NumberFormatException e) {
			System.out.println("整数以外が入力されました");
		} finally {
			scan.close();
		}
	}
}

//問７
class ScanNumber2 {
	public ScanNumber2() {
/*		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("整数を入力してください：");
			String input = scan.next();
			int n = Integer.parseInt(input);
			int quotient = 10 / n;
			System.out.println("10を" + n + "で割った値は" + quotient);
		} catch (ArithmeticException e) {
			System.out.println("0が入力されているため、除算できません");
		} catch (NumberFormatException e) {
			System.out.println("整数以外が入力されました");
		} finally {
			scan.close();
		}*/
		
		//try-with-resource+catch
		try(Scanner scan = new Scanner(System.in))
		 {
			System.out.print("整数を入力してください：");
			String input = scan.next();
			int n = Integer.parseInt(input);
			int quotient = 10 / n;
			System.out.println("10を" + n + "で割った値は" + quotient);
		} catch (ArithmeticException e) {
			System.out.println("0が入力されているため、除算できません");
		} catch (NumberFormatException e) {
			System.out.println("整数以外が入力されました");
		}
	}
}