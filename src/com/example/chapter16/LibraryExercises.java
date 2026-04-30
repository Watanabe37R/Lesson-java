package com.example.chapter16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LibraryExercises {

	public static void main(String[] args) {
		//問１
		System.out.println("問１");
		LocalDate today = LocalDate.now();
		LocalDate oneWeekLater = today.plusWeeks(1);
		System.out.println(today + "の一週間後は" + oneWeekLater);

		//問２
		System.out.println("問２");
		int n = -10;
		System.out.println(Math.abs(n));
		
		//問３
		System.out.println("問３");
		ArrayList<Integer> numList =new ArrayList<>(List.of(5,3,8,1));
		Collections.sort(numList);
		numList.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		//問４
		System.out.println("問４");
		LocalDateTime now =LocalDateTime.now();
		DateTimeFormatter format =DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh時mm分ss秒");
		System.out.println(now.format(format));
		
	}

}
