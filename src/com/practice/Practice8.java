package com.practice;

import java.util.ArrayList;
import java.util.List;

//問８
public class Practice8 {

	public static void main(String[] args) {
		//初期化
		ArrayList<String> fruit = new ArrayList<>(List.of(
				"リンゴ","バナナ","さくらんぼ"));
		//バナナの削除
		fruit.remove("バナナ");
		//オレンジの追加
		fruit.add("オレンジ");
		//for-each出力
		for(String f : fruit) {
			System.out.print(f+" ");
		}
		//関数ラムダストリーム出力
		//fruit.stream().map(f->f+" ").forEach(System.out::print);
		System.out.println();
	}

}
