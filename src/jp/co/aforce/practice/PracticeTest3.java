package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//配列、多次元配列
public class PracticeTest3 {

	public static void main(String[] args) {
		//問１
		String merchandise[] = { "シャープペンシル", "ボールペン", "リングノート", "クリップ", "消しゴム" };

		//問２
		System.out.println(merchandise[1]);

		//問３
		ArrayList<String> employeeList = new ArrayList<>(List.of(
				"山田太郎", "鈴木花子", "佐藤二郎", "山田太郎", "高橋三郎"));

		//問５
		System.out.println(employeeList.get(2));

		//問６
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(15);
		list1.add(16);
		list1.add(19);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(12);
		list2.add(18);
		list2.add(20);

		ArrayList<Integer> listIntegration = new ArrayList<>();
		listIntegration = list1; //list1を代入
		listIntegration.addAll(list2);//list2の要素を追加

		Collections.sort(listIntegration);//昇順でソート
		for (int list : listIntegration) {
			System.out.print(list + " ");
		}
		System.out.println();

		//問７
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(13);
		list3.add(14);
		list3.add(17);
		list3.add(21);
		Collections.sort(list3);//昇順でソート
		//おそらく、結合しないで昇順ということで
		//listIntegrationと比較を行い、list3の要素を
		//表示時に挿入していく
		int i = 0;
		for (int list : listIntegration) {
			//リストの全要素を探索し終わるまで
			//かつlistIntegrationの要素よりlist3の今見ている要素が小さいとき
			//list3の要素を入れ続ける
			while (i < list3.size() && list > list3.get(i)) {
				System.out.print(list3.get(i) + " ");
				i++;
			}
			System.out.print(list + " ");
		}
		System.out.println();
	}

}
