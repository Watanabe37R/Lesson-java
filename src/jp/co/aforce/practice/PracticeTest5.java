package jp.co.aforce.practice;

//制御構文２
public class PracticeTest5 {

	public static void main(String[] args) {
		//問１
		//用意されているもの
		int r = new java.util.Random().nextInt();
		int fortune =r;
		switch(fortune) {
		case 1: System.out.println("吉です");
		case 2: System.out.println("中吉です");
		case 3: System.out.println("大吉です");
		default: System.out.println("凶です");
		}
		System.out.println();
		
		//問２
		for(int i=1;i<=100;i++) {
			if(i%7==0) {
				System.out.print(i+",");
			}
		}
		
		//問３
		for(int j=1;j<=10;j++) {
			for(int k=1;k<=10;k++) {
				System.out.print(j*k+" ");
			}
			
		}
		
		//
	}

}
