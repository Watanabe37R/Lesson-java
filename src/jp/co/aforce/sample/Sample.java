package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		List<String> fruitlist =new ArrayList<String>();
		fruitlist.add("apple");
		fruitlist.add("potato");
		System.out.println(fruitlist);
		fruitlist.add("grape");
		fruitlist.add(1,"peach");
		System.out.println(fruitlist);
		String element0=fruitlist.get(0);
		System.out.println(element0);
		fruitlist.remove(3);
		System.out.println(fruitlist);
		fruitlist.remove("peach");
		System.out.println(fruitlist);
		
		//ArrayList問題
		ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4));
		System.out.println(list);
		System.out.println(list.get(1));
		list.add(5);
		list.add(6);
		list.remove(Integer.valueOf(2));
		list.remove(2);
		list.add(2,2);
		System.out.println(list);
		list.set(2, 4);
		System.out.println(list);
		list.removeAll(list);
		System.out.println(list);
		
		//HashMap問題
		Map<String,Integer>nameMap=new HashMap<>(Map.of(
				"Bob",1,"Alice",2,"John",2));
		nameMap.put("Tom",1);
		System.out.println(nameMap);
		System.out.println(nameMap.get("Alice"));
		//int nmap=nameMap.get("Taro");//ぬるぽ
		//System.out.println(nmap);
		
		Map<String,Integer> product=new HashMap<>(Map.of(
				"りんご",100,"みかん",80,"バナナ",120,"いちご",300));
		//正統派
		String item = "ぶどう";
		if (product.containsKey(item)) {
			System.out.println(item+"は、"+product.get(item)+"円です。");
		}else {
			System.out.println("申し訳ありませんが、その商品は取り扱っていません。");
		}
		
		//null判定
		/*String item = "ぶどう";
		Integer price=product.get(item);//nullの場合を鑑みIntegerで受ける
		if (price != null) {
			System.out.println(item+"は、"+price+"円です。");
		}else {
			System.out.println("申し訳ありませんが、その商品は取り扱っていません。");
		}*/
		
		/*try-catch
		try {
			String item = "ぶどう";
			int price=product.get(item);
			System.out.println(item+"は、"+price+"円です。");
		}catch(NullPointerException e){
			System.out.println("申し訳ありませんが、その商品は取り扱っていません。");
		}
		*/
	}
}