package jp.co.aforce.sample;

public class ExceptionPractice {

	public static void main(String[] args) {
		String str = null;

		/*
		 * System.out.println(str.length()); //.length()なのでぬるぽ
		 * System.out.println("プログラムは継続します");	
		*/
		//例外処理を適用
		try {
			System.out.println(str.length()); //.length()なのでぬるぽ
		} catch (NullPointerException e) {
			System.out.println("ぬるぽが発生しました：" + e.getMessage());
		}

		/*
		 * 		try {
					//ぬるぽ以外の例外が出るもの
					int[] nums = { 1, 2, 3, 4, 5 };
					System.out.println(nums[5]);//ArrayIndexOutOfBoundsException
				} catch (NullPointerException e) {
					System.out.println("ぬるぽが発生しました：" + e.getMessage());
				}
				*/
		//自分で例外を起こす
		try {
			int age = 15;
			if (age < 18) {
				throw new IllegalArgumentException("18歳未満は登録できません");
			}
		} catch (Exception e) {
			System.out.println("例外が発生しました：" + e.getMessage());
		}
		System.out.println("プログラムは継続します");
	}

}
