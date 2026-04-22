package jp.co.aforce.sample;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Chapter4and5Exercises {

	public static void main(String[] args) {
		Question4and5 question = new Question4and5();
		//問１
		question.Question1();
		//問２
		question.Question2();
		//問３
		System.out.println("Hello\tWorld\nJava");
		//問５
		question.Question5();
		//問６
		question.Question6();
	}
}

class Question4and5 {
	public void Question1() {
		String str1 = "Java";
		String str2 = "Programming";
		String str3 = str1.substring(1, 3) + str2.substring(2, 5);
		System.out.println("問１" + str3);
	}

	public void Question2() {
		LocalDate nextBirthday = LocalDate.of(2027, 4, 8);
		LocalDate today = LocalDate.now();
		int untilBirthday = (int) ChronoUnit.DAYS.between(today, nextBirthday);
		System.out.println("問２：" + untilBirthday + "日後");
	}

	public void Question5() {
		LocalDate today = LocalDate.now();
		System.out.println("問５：" + today);
	}

	public void Question6() {
		LocalDate today = LocalDate.of(2024, 4, 14);
		LocalDate nextWeek = today.plusDays(7);
		System.out.println("問６："+nextWeek);
	}
}
