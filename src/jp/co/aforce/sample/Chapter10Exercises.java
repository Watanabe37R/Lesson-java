package jp.co.aforce.sample;

public class Chapter10Exercises {

	public static void main(String[] args) {
		//コンストラクター
		System.out.println("コンストラクタ");
		//問１
		Person10 person = new Person10("田中太郎", 30);
		System.out.println("問１：" + person.name + "は" + person.age + "歳です");
		//問２
		System.out.println("問２：");
		Car10 car = new Car10();
		System.out.println(car.typeName);
		Car10 car2 = new Car10("RX-7");
		System.out.println(car2.typeName);
		//問３
		System.out.println("問３：");
		Book10 book = new Book10("A本", "A太郎", 3_000);
		System.out.println(book.tittle + "の著者は" + book.author + "で価格は" + book.price + "円です");
		Book10 book2 = new Book10("B本", "B次郎");
		System.out.println(book2.tittle + "の著者は" + book2.author + "で価格は" + book2.price + "円です");
		//オーバーライド
		System.out.println("オーバーライド");
		//問１
		System.out.println("問１：");
		Animal10 dog = new Dog10();
		dog.makeSound();
		Animal10 cat = new Cat10();
		cat.makeSound();
		//問２
		System.out.print("問２：");
		Person10of2 person2 = new Person10of2("太郎", 30);
		System.out.println(person2.toString());
		//問３
		System.out.print("問３：");
		Employee10 employee = new Employee10("田中次郎", 130);
		Employee10 employee2 = new Employee10("田中三郎", 130);
		System.out.println(employee.equals(employee2));
		//オーバーロード
		System.out.println("オーバーロード");
		//問１
		System.out.println("問１：");
		Calculation calculation = new Calculation();
		System.out.println(calculation.addition(436, 54));
		System.out.println(calculation.addition(436, 54, 4));
		//問２
		System.out.println("問２：");
		Square square = new Square();
		square.edge(10, 20);
		square.edge(10);
		//問３
		System.out.println("問３：");
		AdditionCalculation addition = new AdditionCalculation();
		System.out.println(addition.addition(1, 1, 4, 5, 1, 4));
		//無名内部クラス
		//問１
		System.out.println();
		Runnable run = new Runnable() {
			@Override
			public void run() {
				System.out.println("無名内部クラスの問１の処理実行");
			}
		};
		Thread t = new Thread(run); //別スレッドで実行する
		t.start();
		//問２はButtonClickEvent.javaで実装
		//問３はOneSecondTimer.javaで実装
		//キャスト
		System.out.println("キャスト");
		//問１
		System.out.println("問１：");
		DoubleInt doubleInt = new DoubleInt(114.514);
		System.out.println(doubleInt.castInt());
		//問２
		System.out.println("問２：");
		Animal10of2 dog2 = new Dog10of2();
		dog2.makeSound();
		//問３
		System.out.println("問３：");
		Shape circle = new Circle10();
		if (circle instanceof Circle10)
			((Circle10) circle).comment();
		Shape rectangle = new Rectangle10();
		if (rectangle instanceof Rectangle10)
			((Rectangle10) rectangle).comment();
		//静的フィールド
		System.out.println("静的フィールド");
		//問１
		System.out.println("問１：");
		Counter counter = new Counter();
		counter.count();
		System.out.println(Counter.count);
		counter.count();
		System.out.println(Counter.count);
		//問２
		System.out.println("問２：");
		Student10 student = new Student10("開成");
		System.out.println(Student10.schoolName);
		Student10 student2 = new Student10("麻布");
		System.out.println(Student10.schoolName);
		//問３
		System.out.print("問３：");
		System.out.println(Configuration.appName + "のバージョンは" + Configuration.version);
		//静的メソッド
		System.out.println("静的メソッド");
		//問１
		System.out.print("問１：");
		System.out.println(MathUtils.add(123, 456));
		//問２
		System.out.print("問２：");
		System.out.println(StringUtils.toUpperCase("convert lowercase letters to uppercase letters."));
		//問３
		System.out.print("問３：");
		ArrayUtils arrayNums = new ArrayUtils(-326, 34, -713, 23, 57, -76, 5, 6423);
		System.out.println(ArrayUtils.max());
		//定数
		System.out.println("定数");
		//問１
		System.out.print("問１：");
		int r = 10;
		System.out.println(String.format("半径" + r + "の円の面積は%.3f", MathConstants.PI * r * r));
		//問２
		System.out.print("問２：");
		int n = 1;
		System.out.println(n + "秒間に光が進む距離は、" + PhysicsConstants.LIGHT_SPEED * n + "ｍである");
		//問３
		System.out.print("問３：");
		System.out.println(AppConfig.APP_NAME + "のバージョンは" + AppConfig.VERSION);
		//列挙型
		System.out.println("列挙型");
		//問１
		System.out.println("問１：");
		for (Day day : Day.values()) {
			System.out.println(day.toString());
		}
		//問２
		System.out.println("問２：");
		for (Season season : Season.values()) {
			System.out.println(season.toString());
		}
		//問３
		System.out.println("問３：");
		for (TrafficLight collor : TrafficLight.values()) {
			System.out.println(collor.toString());
		}
	}
}

//コンストラクター
//問１
class Person10 {
	String name;
	int age;

	public Person10(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

//問２
class Car10 {
	String typeName;

	public Car10() {
		typeName = "default";
	}

	public Car10(String name) {
		typeName = name;
	}
}

//問３
class Book10 {
	String tittle;
	String author;
	int price;

	public Book10(String tittle, String author, int price) {
		this.tittle = tittle;
		this.author = author;
		this.price = price;
	}

	public Book10(String tittle, String author) {
		this.tittle = tittle;
		this.author = author;
		price = 2_000;
	}
}

//OR
//問１
class Animal10 {
	public void makeSound() {
		System.out.println("動物の鳴き声");
	}
}

class Dog10 extends Animal10 {
	@Override
	public void makeSound() {
		System.out.println("Bawbaw");
	}
}

class Cat10 extends Animal10 {
	@Override
	public void makeSound() {
		System.out.println("Meow");
	}
}

//問２
class Person10of2 {
	String name;
	int age;

	Person10of2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "の年齢は" + age + "歳です";
	}
}

//問３
class Employee10 {
	String name;
	int employeeId;

	Employee10(String name, int id) {
		this.name = name;
		employeeId = id;
	}

	@Override
	public boolean equals(Object obj) {
		Employee10 other = (Employee10) obj; //インスタンスしたものをEmplyee10型に置き換える 
		return this.employeeId == other.employeeId;

	}
}

//OL
//問１
class Calculation {
	public int addition(int a, int b) {
		return a + b;
	}

	public int addition(int a, int b, int c) {
		return a + b + c;
	}
}

//問２
class Square {
	int width;
	int height;

	public void edge(int a, int b) {
		width = a;
		height = b;
		System.out.println("長方形の" + result());
	}

	public void edge(int a) {
		width = a;
		height = a;
		System.out.println("正方形の" + result());
	}

	public String result() {
		return "幅は" + width + ",高さは" + height + "です";
	}
}

//問３
class AdditionCalculation {
	int sum;

	public int addition(int... num) {
		for (int i : num) {
			sum += i;
		}
		return sum;
	}
}

//キャスト
//問１
class DoubleInt {
	double d;

	public DoubleInt(double d) {
		this.d = d;
	}

	public int castInt() {
		return (int) d;
	}
}

//問２
abstract class Animal10of2 {
	abstract void makeSound();
}

class Dog10of2 extends Animal10of2 {
	public void makeSound() {
		System.out.println("Bawbaw");
	}
}

//問３
interface Shape {
}

class Circle10 implements Shape {
	void comment() {
		System.out.println("これは円です");
	}
}

class Rectangle10 implements Shape {
	void comment() {
		System.out.println("これは長方形です");
	}
}

//静的フィールド
//問１
class Counter {
	static int count = 0;

	public int count() {
		return count++;
	}
}

//問２
class Student10 {
	public static String schoolName;

	public Student10(String name) {
		schoolName = name;
	}
}

//問３
class Configuration {
	public static String appName;
	public static String version;
	static {
		appName = "クラウドサービスSSA";
		version = "ver3.2.13";
	}
}

//静的メソッド
//問１
class MathUtils {
	public static int add(int a, int b) {
		return a + b;
	}
}

class StringUtils {
	public static String toUpperCase(String s) {
		return s.toUpperCase();
	}
}

class ArrayUtils {
	private static int[] numList;

	ArrayUtils(int... nums) {
		numList = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			numList[i] = nums[i];
		}
	}

	public static int max() {
		int max = -2147483648; //intの最低値
		for (int i : numList) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
}

//定数
//問１
class MathConstants {
	public static final double PI = Math.PI;
}

//問２
class PhysicsConstants {
	public static final int LIGHT_SPEED = 299_792_458; //m/s
}

//問３
class AppConfig {
	public static final String APP_NAME = "クラウドSaasお任せくん";
	public static final String VERSION = "ver16.3.9";
}

//列挙型(enum)
//それぞれ別ファイルに定義
