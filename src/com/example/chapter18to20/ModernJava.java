package com.example.chapter18to20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModernJava {

	public static void main(String[] args) {
		//配列の表示
		ArrayList<String> arr = new ArrayList<>(List.of(
				"赤坂", "神楽坂", "乃木坂"));

		//従来の呼び方
		for (String s : arr) {
			System.out.print(s + " ");
		}
		System.out.println();
		//モダンな呼び方
		//ストリーム生成->中身(sとした)に空白を追加->forEachで出力
		arr.stream().map(s -> s + " ").forEach(System.out::print);
		System.out.println();
		//乃至
		arr.forEach(s2 -> System.out.print(s2 + " "));
		System.out.println();
		
		//配列の合計
		int[] intArr= {1,1,4,5,1,4};
		//従来の呼び方
		int sum=0;
		for (int i : intArr) {
			sum+=i;
		}
		System.out.println(sum);
		//モダンさん
		System.out.println(Arrays.stream(intArr).sum());
		System.out.println(Arrays.stream(intArr).reduce(0,Integer::sum));
		Arrays.stream(intArr).forEach(System.out::print);
		
		
	}
}
