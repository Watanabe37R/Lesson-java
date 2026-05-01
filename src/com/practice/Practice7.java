package com.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

//問７
public class Practice7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("年齢を入力してください：");
		try {
			int age = scan.nextInt();
			//０歳未満と200歳以上は不正な値とした
			if (age < 0 || age > 200) {
				throw new IllegalArgumentException("入力が不正です");
			}
			//３以下
			if (age <= 3) {
				System.out.println("３歳以下は入場料無料です");
			}
			//４～１２
			if (age >= 4 && age <= 12) {
				System.out.println("４～１２歳は入場料５００円です");
			}
			//１３～１７
			if (age >= 13 && age <= 17) {
				System.out.println("１３～１７歳は入場料８００円です");
			}
			//１８～５９
			if (age >= 18 && age <= 59) {
				System.out.println("１８～５９歳は入場料１２００円です");
			}
			//６０以上
			if (age >= 60) {
				System.out.println("６０歳以上は入場料７００円です");
			}
			//０歳未満、２００歳以上の時例外
		} catch (IllegalArgumentException e) {
			System.out.println("例外が発生しました：" + e.getMessage());
			//数値以外が入力された際の例外
		} catch (InputMismatchException e) {
			System.out.println("数値以外が入力されました：：" + e.getMessage());
		} finally {
			scan.close();
		}

	}

}
