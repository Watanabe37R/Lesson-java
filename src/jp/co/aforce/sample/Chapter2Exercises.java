package jp.co.aforce.sample;

public class Chapter2Exercises {

	public static void main(String[] args) {
		//問１
		DoubleInteger doubleInteger = new DoubleInteger();
		doubleInteger.Question1();
		//問２
		GreaterThanTen greaterThanTen = new GreaterThanTen();
		greaterThanTen.Question2();
		//問３
		EvenOrOdd evenOrOdd = new EvenOrOdd();
		evenOrOdd.Question3();
		//問４～
		OtheQuestion otheQuestion = new OtheQuestion();
		//問４
		otheQuestion.Question4();
		//問５
		otheQuestion.Question5();
		//問６
		otheQuestion.Question6();
		//問７
		otheQuestion.Question7();
		//問８
		otheQuestion.Question8();
		//問９
		otheQuestion.Question9();
		//問10
		otheQuestion.Question10();
		//問11
		otheQuestion.Question11();
		//問12
		otheQuestion.Question12();
		//問13
		otheQuestion.Question13();
		//問14
		otheQuestion.Question14();
		//問15
		otheQuestion.Question15();
		//問16
		otheQuestion.Question16();
		//問17
		otheQuestion.Question17();
		//問18
		otheQuestion.Question18();
		//問19
		otheQuestion.Question19();
		//問20
		otheQuestion.Question20();
	}
}

class DoubleInteger {
	public void Question1() {
		int num = 5;
		int result = num * 2;
		System.out.println("問１：" + result);
	}
}

class GreaterThanTen {
	public void Question2() {
		int num = 12;
		if (num > 10) {
			System.out.println("問２：この値は、10よりも大きいです。");
		}
	}
}

class EvenOrOdd {
	public void Question3() {
		int num = 7;
		if (num % 2 == 0) {
			System.out.println("問３：この値は偶数です。");
		} else {
			System.out.println("問３：この値は奇数です。");
		}
	}
}

class OtheQuestion {
	public void Question4() {
		double num = 4.5;
		double result;
		result = num / 2;
		System.out.println("問４：" + result);
	}

	public void Question5() {
		double num = 7.8;
		int numInt;
		double numDouble;
		numInt = (int) num;
		numDouble = Math.round((num - numInt) * 1000) / 1000.0;
		System.out.println("問５　整数部分：" + numInt + "小数点部分：" + numDouble);
	}

	public void Question6() {
		double num = 3.2;
		double result;
		result = num * 10;
		System.out.println("問６：" + result);
	}

	public void Question7() {
		int num = 0;
		if (num == 0) {
			System.out.println("問７：この値は０です。");
		}
	}

	public void Question8() {
		int num = -5;
		if (num < 0) {
			System.out.println("問８：この値は負の数です。");
		}
	}

	public void Question9() {
		int num = 15;
		if (num % 5 == 0) {
			System.out.println("問９：この値は５の倍数です。");
		}
	}

	public void Question10() {
		int num1 = 8;
		int num2 = 3;
		int result = num1 + num2;
		System.out.println("問10：" + result);
	}

	public void Question11() {
		int num1 = 10;
		int num2 = 4;
		int result = num1 - num2;
		System.out.println("問11：" + result);
	}

	public void Question12() {
		int num1 = 6;
		int num2 = 7;
		int result = num1 * num2;
		System.out.println("問12：" + result);
	}

	public void Question13() {
		String name = "自分の名前";
		int age = 30;
		age++;
		System.out.println("問13：" + name + "は次の誕生日で" + age + "歳です。");
	}

	public void Question14() {
		int num1 = 8;
		int num2 = 3;
		System.out.println("問14：和差積商剰余");
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
	}

	public void Question15() {
		int test1 = 75;
		int test2 = 88;
		int test3 = 92;
		int result = (test1 + test2 + test3) / 3;
		System.out.println("問15：" + result);
	}

	public void Question16() {
		int price = 12_000;
		int discount = 30;
		int newPrice = price * (100 - discount) / 100;
		System.out.println("問16：" + newPrice);
	}

	public void Question17() {
		boolean a = true;
		boolean b = false;
		boolean c = (a && b) || (!a && !b);
		System.out.println("問17："+c);
	}

	public void Question18() {
		boolean x = true;
		boolean y = false;
		boolean z = x || y && !x;
		System.out.println("問18："+z);
	}

	public void Question19() {
		boolean p = false;
		boolean q = true;
		boolean r = !(p || q) && (p && !q);
		System.out.println("問19："+r);
	}

	public void Question20() {
		int age = 20;
		boolean hasStudentID = false;

		if ((age < 25 && hasStudentID) || age == 20) {
			System.out.println("問20：割引対象です");
		} else {
			System.out.println("問20：通常料金です");
		}

	}
}
