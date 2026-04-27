package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.List;

//制御構文１
public class PracticeTest4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//問１
		ArrayList<String> animals = new ArrayList<>(List.of(
				"犬", "猫", "うさぎ", "へび"));

		//問２
		String likeAnimal;
		likeAnimal = "ヘビクイワシ";
		boolean onTheList = animals.contains(likeAnimal);
		if (onTheList) {
			System.out.println(likeAnimal + "はリストに含まれています");
		} else {
			System.out.println(likeAnimal + "はリストに含まれていません");
		}

		//問３
		int Calender;
		Calender = 3;
		String result = switch (Calender) {
		case 1 -> "冬物セール";
		case 2, 3, 4 -> "春物を売る";
		case 5 -> "春物セール";
		case 6, 7 -> "夏物を売る";
		case 8 -> "夏物セール";
		case 9 -> "秋物を売る";
		case 10, 11, 12 -> "冬物を売る";
		default -> "不正な月です";
		};
		System.out.println(Calender+"月は"+result);
	}

}
