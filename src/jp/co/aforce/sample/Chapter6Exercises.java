package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Chapter6Exercises {

	public static void main(String[] args) {
		Question6 question = new Question6();
		System.out.println("コレクション");
		//問１ー１
		question.Question1of1();
		//問１－２
		question.Question1of2();
		System.out.println("リスト");
		//問２－１
		question.Question2of1();
		//問２－２
		question.Question2of2();
		//問２－３
		question.Question2of3();
		System.out.println("ハッシュ");
		//問３－１
		question.Question3of1();
		//問３－２
		question.Question3of2();
		//問３－３
		question.Question3of3();
		System.out.println("配列とリスト");
		//問４－１
		question.Question4of1();
		//問４－２
		question.Question4of2();
		//問４－３
		question.Question4of3();
	}
}

class Question6 {

	public void Question1of1() {
		ArrayList<Integer> arr = new ArrayList<>(
				List.of(10, 20, 30, 40, 50));
		System.out.println("問１：");
		for (int i = arr.size() - 1; i >= 0; i--) {
			System.out.println(arr.get(i));
		}
	}

	public void Question1of2() {
		ArrayList<String> arr = new ArrayList<>(
				List.of("リンゴ", "バナナ", "さくらんぼ", "リンゴ", "さくらんぼ"));
		HashSet<String> set = new HashSet<>(arr);

		System.out.println("問２：");
		for (String element : set) {
			System.out.println(element);
		}
	}

	public void Question2of1() {
		ArrayList<Integer> arr = new ArrayList<>(
				List.of(10, 20, 30, 40, 50, 60, 70));
		int item = 45;
		if (arr.contains(item)) {
			System.out.println("問１：" + item + "はリストに存在します");
		} else {
			System.out.println("問１：" + item + "はリストに存在しません");
		}
	}

	public void Question2of2() {
		ArrayList<String> animalEnglish = new ArrayList<>(List.of(
				"Indian elephant", "Serval cat", "Black-tailed gull", "Vulture", "Buffalo", "Tasmanian Devil"));
		Collections.sort(animalEnglish);
		System.out.println("問２：" + animalEnglish);
	}

	public void Question2of3() {
		LinkedList<String> keikyuDaishiLine = new LinkedList<>(List.of(
				"京急川崎", "港町", "鈴木町", "川崎大師", "東門前", "大師橋", "小島新田"));
		System.out.println("問３：" + keikyuDaishiLine.getFirst() + "～" + keikyuDaishiLine.getLast());
	}

	public void Question3of1() {
		Map<Integer, String> dial = new HashMap<>(Map.of(
				110, "警察", 113, "電話故障受付", 115, "電報", 116, "電話の新設等", 117, "時報", 118, "海保", 119, "消防,救急", 171, "災害伝言",
				177, "天気予報", 188, "消費者ホットライン"));
		dial.put(189, "児相");
		System.out.println("問１：" + dial);
	}

	public void Question3of2() {
		Map<String, String> Subject = new HashMap<>(Map.of(
				"国語", "Japanese", "算数", "Math", "理科", "Science", "社会", "Social Studies", "英語", "English", "道徳",
				"Moral Education", "体育", "Physical Education", "総合", "Integrated Studies", "家庭科", "Home Economics"));
		String SubjectJp = "英語";
		if (Subject.containsKey(SubjectJp)) {
			System.out.println("問２：" + SubjectJp + "は英訳すると" + Subject.get(SubjectJp));
		} else {
			System.out.println("問２：対応する教科は存在しません");
		}
	}

	public void Question3of3() {
		Set<String> str = new HashSet<>();
		str.add("Java");
		str.add("Python");
		str.add("Java");
		str.add("Ruby");
		str.add("Python");
		System.out.println("問３：" + str);
	}

	public void Question4of1() {
		int integer[] = new int[] { 10, 20, 30, 40 };
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i : integer) {
			arr.add(i);
		}
		System.out.println("問１：" + arr);
	}

	public void Question4of2() {
		ArrayList<String> arr = new ArrayList<>(List.of(
				"東京", "品川", "新横浜", "小田原"));
		String str[] = arr.toArray(new String[0]);
		System.out.println("問２" + Arrays.toString(str));
	}

	public void Question4of3() {
		//学生の名前とその成績を保存するため。HashMapを使用。
		Map<String, Integer> grades = new HashMap<>(Map.of(
				"佐藤敏夫", 90, "田中高菜", 83, "三国三郎", 75, "奥瀬智也", 58));
		int sum = 0;
		double ave = 0;
		for (Integer i : grades.values()) {
			sum += i;
		}
		ave = (double)sum / grades.size();
		System.out.println("問３：" + ave);
	}
}
