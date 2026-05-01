package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//問１０
public class Practice10 {

	public static void main(String[] args) {

		//ArrayList<String> arr =new ArrayList<>(List.of("TASK001","TASK002","TASK003","TASK001","TASK004","TASK002"));
		//System.out.println(arr.contains("TASK001"));
		//今回はやったタスクなので重複なし->HashSetを使用。
		//1.処理済みタスクIDを登録
		Set<String> hash = new HashSet<String>();
		//TASK番号に重複があるのでSet.ofを使わず一つ一つadd
		hash.add("TASK001");
		hash.add("TASK002");
		hash.add("TASK003");
		hash.add("TASK001");
		hash.add("TASK004");
		hash.add("TASK002");
		//2.処理済みのタスクID一覧
		for (String t : hash) {
			System.out.print("- " + t + " ");
		}
		//関数ラムダストリーム
		//hash.stream().map(t->"- "+t+" ").forEach(System.out::print);
		System.out.println();
		
		//3.タスクの処理状況の確認
		//いっこいっこやった場合
		/*
		String taskCheck1="TASK003";
		String taskCheck2="TASK005";
					
		if(hash.contains(taskCheck1)) {
			System.out.println("タスクID"+taskCheck1+"は既に処理済みです");
		}else{
			System.out.println("タスクID"+taskCheck1+"は未処理です");
		}
		if(hash.contains(taskCheck2)) {
			System.out.println("タスクID"+taskCheck2+"は既に処理済みです");
			else{
			System.out.println("タスクID"+taskCheck2+"は未処理です");
		}
		*/

		//リスト型でまとめてチェック実装
		ArrayList<String> taskCheck = new ArrayList<>(List.of("TASK003", "TASK005"));
		for (String tc : taskCheck) {
			if (hash.contains(tc)) {
				System.out.println("タスクID'" + tc + "'は既に処理済みです");
			} else {
				System.out.println("タスクID'" + tc + "'は未処理です");
			}
		}
		
		//4.処理済みタスクの総数の表示
		//HashSetだから重複にきにすることなくリストの中身の数を出せばそれが完了数。
		System.out.println("処理済みタスクの総数："+hash.size());	
		//関数ラムダストリーム
		//System.out.println("処理済みタスクの総数："+hash.stream().count());
	}

}
