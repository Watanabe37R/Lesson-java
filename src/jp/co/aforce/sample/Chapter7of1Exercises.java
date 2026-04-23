package jp.co.aforce.sample;

import java.util.Scanner;

public class Chapter7of1Exercises {

	public static void main(String[] args) {
		System.out.println("if文");
		Question7of1 question7of1 = new Question7of1();
		//問題１－１～１－４、２－３～２－５は
		//scannnerが悪さするので、１つずつコメントを外してデバッグ
		//問題１－１
		//question7of1.Question1of1();
		//問題１－２
		//question7of1.Question1of2();
		//問題１－３
		//question7of1.Question1of3();
		//問題１－４
		//question7of1.Question1of4();
		//問題１－５
		question7of1.Question1of5();
		//switch文
		//問題２－１
		System.out.println("問１：");
		question7of1.Question2of1();
		//問題２－２
		System.out.println("問２：");
		question7of1.Question2of2();
		//問題１－１～１－４、２－３～２－５は
		//scannnerが悪さするので、１つずつコメントを外してデバッグ
		//問題２－３
		//question7of1.Question2of3();
		//問題２－４
		//question7of1.Question2of4();
		//問題２－５
		question7of1.Question2of5();
	}
}

class Question7of1 {
	public void Question1of1() {
		System.out.print("問１　整数を入力：");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}
		scan.close();
	}

	public void Question1of2() {
		System.out.print("問２　整数を入力：");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num > 0) {
			System.out.println("正の数です");
		} else if (num < 0) {
			System.out.println("負の数です");
		} else {
			System.out.println("０です");
		}
		scan.close();
	}

	public void Question1of3() {
		System.out.println("問３　整数を３つ入力：");
		Scanner scan = new Scanner(System.in);
		int num[] = new int[3];
		for (int i = 0; i < 3; i++) {
			num[i] = scan.nextInt();
		}
		scan.close();
		//各辺の長さを長い順に並べる
		int edge1 = 0;
		int edge2 = 0;
		int longSide = 0;
		if (num[0] >= num[1]) {
			longSide = num[0]; //長い方をlongSideに入れる
			edge1 = num[1]; //短い方をedgeに入れる
			if (num[0] >= num[2]) {
				edge2 = num[2]; //短い方をedgeに入れる
			} else {
				edge2 = num[0]; //短い方をedgeに入れる
				longSide = num[2]; //長い方をlongSideに入れる
			}
		} else {
			longSide = num[1]; //長い方をlongSideに入れる
			edge1 = num[0]; //短い方をedgeに入れる
			if (num[1] >= num[2]) {
				edge2 = num[2]; //短い方をedgeに入れる
			} else {
				edge2 = num[1]; //短い方をedgeに入れる
				longSide = num[2]; //長い方をlongSideに入れる
			}
		}
		if (longSide < edge1 + edge2) {//三角形は長辺<短辺＋短辺の時に成り立つ
			System.out.println("三角形の偏として正しい組み合わせです");
		} else {
			System.out.println("三角形の偏として正しくない組み合わせです");
		}
	}

	public void Question1of4() {
		System.out.print("問４　年齢を入力：");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if (age <= 12 && age >= 0) {
			System.out.println("１２歳以下は無料です");
		} else if (age >= 60) {
			System.out.println("６０歳以上は５００円です");
		} else if (age >= 13 && age <= 59) {
			System.out.println("１３歳～５９歳は１０００円です");
		} else {
			System.out.println("負の数が入力されています");
		}
		scan.close();
	}

	public void Question1of5() {
		int number = 10;

		/*if (number = 5) {	//ここでコンパイルエラー！(正しくは"number==5")
			System.out.println("numberは5です");
		} else {
			System.out.println("numberは5ではありません");
		}*/
	}

	public void Question2of1() {
		int num = 3;
		switch (num) {
		case 1:
			System.out.println("One");
		case 2:
			System.out.println("Two");
		case 3:
			System.out.println("Three");
		default:
			System.out.println("Other");
		}
	}

	public void Question2of2() {
		String season = "Spring";

		switch (season) {
		case "Spring":
			System.out.println("花が咲く季節です");
			break;
		case "Summer":
			System.out.println("暑い季節です");
			break;
		case "Autumn":
			System.out.println("紅葉の季節です");
			break;
		case "Winter":
			System.out.println("寒い季節です");
			break;
		default:
			System.out.println("不明な季節です");
		}
	}

	public void Question2of3() {
		System.out.print("問３　１～７の整数を入力：");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String dayOfTheWeek = switch (num) {
		case 1 -> "日曜日です";
		case 2 -> "月曜日です";
		case 3 -> "火曜日です";
		case 4 -> "水曜日です";
		case 5 -> "木曜日です";
		case 6 -> "金曜日です";
		case 7 -> "土曜日です";
		default -> "１～７以外の数値を入力しています";
		};
		System.out.println(num + "は" + dayOfTheWeek);
	}

	public void Question2of4() {
		System.out.print("問４　１～１２の整数を入力：");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String japaneseMonth = switch (num) {
		case 1 -> "睦月です";
		case 2 -> "如月です";
		case 3 -> "弥生です";
		case 4 -> "卯月です";
		case 5 -> "皐月です";
		case 6 -> "水無月です";
		case 7 -> "文月です";
		case 8 -> "葉月です";
		case 9 -> "長月です";
		case 10 -> "神無月です";
		case 11 -> "霜月です";
		case 12 -> "師走です";
		default -> "１～１２以外の数値を入力しています";
		};
		System.out.println(num + "は" + japaneseMonth);
	}

	public void Question2of5() {
		System.out.print("問５　A,B,C.D.Fのいずれかを入力：");
		Scanner scan = new Scanner(System.in);
		String grades = scan.nextLine();
		String message1 = "";
		String message2 = "";
		switch (grades) {
		case "A":
			message1 = "あなたはの成績は優です";
			message2 = "80点以上で、あなたは合格です";
			break;
		case "B":
			message1 = "あなたはの成績は良です";
			message2 = "70点～80点で、あなたは合格です";
			break;
		case "C":
			message1 = "あなたはの成績は可です";
			message2 = "60点～70点で、あなたは合格です";
			break;
		case "D":
			message1 = "あなたはの成績は不可です";
			message2 = "59点以下なので、再履修してください";
			break;
		case "F":
			message1 = "あなたはこの単位取得を中止しています";
			message2 = "もし、再度受講をする場合は再履修手続きを行ってください";
			break;
		default:
			message1 = "成績に含まれない値が入力されています";
			message2 = "A,B,C,D,Fのいずれかで入力してください";
		}
		System.out.println(message1+"\n"+message2);
	}
}
