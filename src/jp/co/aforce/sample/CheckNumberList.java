package jp.co.aforce.sample;

import java.util.ArrayList;

public class CheckNumberList {

	public static void main(String[] args) {
		int intNum = 20;
		ArrayList<String> numList = new ArrayList<>();
		if (intNum > 10) {
			numList.add("large");
		} else {
			numList.add("small");
		}
		System.out.print(numList);

		/*		int intNum[]= {20,10,4,38,13,8,3};
				ArrayList<String> numList =new ArrayList<>();
				for(int i : intNum) {
					if(i>10) {
						numList.add("large");
					}else {
						numList.add("small");
					}
				}
				System.out.print(numList);*/
	}
}
