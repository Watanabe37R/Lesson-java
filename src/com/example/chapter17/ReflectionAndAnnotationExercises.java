package com.example.chapter17;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

//アノテーション定義
@Target(ElementType.TYPE)//クラスに指定
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
	String name();
}

public class ReflectionAndAnnotationExercises {

	public static void main(String[] args) {
		//問１
		System.out.println("問１");
		Sample sample = new Sample("test", 160, false);

		try {
			Field sampleField1 = sample.getClass().getDeclaredField("data1");
			Field sampleField2 = sample.getClass().getDeclaredField("data2");
			Field sampleField3 = sample.getClass().getDeclaredField("flug1");
			sampleField1.setAccessible(true);
			sampleField2.setAccessible(true);
			sampleField3.setAccessible(true);

			System.out.println("data1:" + sampleField1.get(sample) + " data2:" + sampleField2.get(sample) + " flug1:"
					+ sampleField3.get(sample));

		} catch (NoSuchFieldException | IllegalAccessException e) {
			e.printStackTrace();
		}

		//問２
		System.out.println("問２");

		MyAnnotation anno = MyClass.class.getAnnotation(MyAnnotation.class);
		System.out.println(anno.name());

		//問３
		System.out.println("問３");
		
		Calculator addCalculator=new Calculator();
		System.out.println(addCalculator.add(365,734));
		
		//問４
		System.out.println("問４");
		
        String str = new String("Hello"); // String インスタンスを作成
        System.out.println(str.getClass().getName());// 完全修飾名を取得

	}

}

//問１
class Sample {
	private String data1;
	private int data2;
	private boolean flug1;

	public Sample(String s, int i, boolean b) {
		data1 = s;
		data2 = i;
		flug1 = b;
	}
	//処理たらたら(今回は使用しないので実装しない)
}

//問２
@MyAnnotation(name = "MyClass")
class MyClass {
	private String data;
	//つらつら
}

//問３

class Calculator{
	/* *
	 * 電卓を実装するクラスの中で整数a,bの和を計算するものです
	 * 引数に整数を２つ定義することによって足し算を行います。
	 * 返り値はint
	 * 2026/04/30更新
	 * */
	public int add(int a ,int b) {
		return a+b;
	}
}

//問５
class Animal {
    void speak() {
        System.out.println("鳴く");
    }
}

class Dog extends Animal {
	/* *
	 * @Overrideについて
	 * スーパークラスAnimalを継承したDogクラスが
	 * スーパークラスAnimalにあるspeakメソッドを
	 * 上書きして新たに内容を設定したときに使用される
	 * アノテーション。
	 * オーバーライドする際に使用され、
	 * オーバーライド時のエラーチェックなどに使用される
	 * */
	@Override	
    void speak() {
        System.out.println("ワン！");
    }
}

//問６
class ForPractice{
	/* *
	 * このメソッドは、二つの整数を引数にもち
	 * その値を足し算し、和をint型で返します
	 * */
	public int add(int a, int b) {
	    return a + b;
	}
}

