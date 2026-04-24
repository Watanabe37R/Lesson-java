package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;

public class Chapter9Exercises {

	public static void main(String[] args) {
		//クラスの問１
		System.out.println("問１");
		Peason peason = new Peason("太郎", 20);
		System.out.println(peason.name);
		System.out.println(peason.age);

		//クラスの問２
		System.out.println("問２");
		Book book = new Book("Java教本", "高橋大藤", 2530);
		book.showInfo();

		//クラスの問３
		System.out.println("問３");
		Student9 student = new Student9();
		System.out.println(student.scoareAverage());

		//クラスの問４
		System.out.println("問４");
		Employee employee = new Employee(100, "田中太郎", 300_0000);
		System.out.println(employee.raiseSalary(1.1));

		//クラスの問５
		System.out.println("問５");
		Circle circle = new Circle(100);
		System.out.println(String.format("%.2f", circle.areaOfCircle()));

		//インスタンスの問１
		System.out.println("問１");
		Dog2 dog = new Dog2("ポメ");
		System.out.println(dog.name);

		//インスタンスの問２
		System.out.println("問２");
		Cat2 cat = new Cat2("ミケ");
		cat.meow();

		//インスタンスの問３
		System.out.println("問３");
		Car car = new Car("RX-7", 120);
		System.out.println("車種：" + car.model + "、速度：" + car.speed);
		Car car2 = new Car("カマロ", 110);
		System.out.println("車種：" + car2.model + "、速度：" + car2.speed);
		Car car3 = new Car("フェアレディ", 130);
		System.out.println("車種：" + car3.model + "、速度：" + car3.speed);

		//インスタンスの問４
		System.out.println("問４");
		Rectangle rectangle = new Rectangle(114, 514);
		System.out.println(rectangle.areaSquare());

		//インスタンスの問５
		System.out.println("問５");
		Robot robot = new Robot("run");
		robot.move();
		Robot robot2 = new Robot("walk");
		robot2.move();
		Robot robot3 = new Robot("dance");
		robot3.move();

		//インスタンスの問６
		System.out.println("問６");
		Student2 student1 = new Student2("田中太郎", new int[] { 80, 60, 70, 20, 78 });
		System.out.println(student1.name + "の合計点は" + student1.total + "点で、平均点は、"
				+ String.format("%.2f", student1.getAverage()) + "点です");
		Student2 student2 = new Student2("大塚花子", new int[] { 60, 78, 34, 63, 91 });
		System.out.println(student2.name + "の合計点は" + student2.total + "点で、平均点は、"
				+ String.format("%.2f", student2.getAverage()) + "点です");

		//mainメソッドの問１
		System.out.println("問１");
		System.out.println("Hello,World！");
		//mainメソッドの問２
		System.out.println("問２");
		System.out.println(12 + 34);
		//mainメソッドの問４
		//今までにそれなりにやってるので省略
		//mainメソッドの問５
		System.out.println("問５");
		String name;
		int age;
		name = "name";
		age = 30;
		System.out.println("私の名前は" + name + "で歳は" + age + "歳です");
		//引数と戻り値
		Question9 question = new Question9();
		//問１
		System.out.println("問１");
		System.out.println(question.greet("name"));
		//問２
		System.out.println("問２");
		System.out.println(question.add(13, 54));
		//問３
		System.out.println("問３");
		System.out.println(question.inEven(13));
		//問４
		System.out.println("問４");
		System.out.println(question.repeat("Java", 3));
		//問５
		System.out.println("問５");
		System.out.println(String.format("%.3f",question.calcArea(20)));

	}
}

//問１
class Peason {
	public String name;
	public int age;

	public Peason(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

//問２
class Book {
	public String title;
	public String author;
	public int price;

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void showInfo() {
		System.out.println("本のタイトル：" + this.title + "、著者：" + this.author + "、価格：" + this.price + "円");
	}
}

//問３
class Student9 {
	public Map<String, Integer> student = new HashMap<>(Map.of(
			"田中太郎", 30, "山中花子", 79, "原口泰三", 87, "小清水綾子", 56));

	public int scoareAverage() {
		int sum = 0;
		for (Integer score : this.student.values()) {
			sum += score;
		}
		return sum / this.student.size();
	}
}

//問４
class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	protected int raiseSalary(double percent) {
		return this.salary *= percent;
	}
}

//問５
class Circle {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public double areaOfCircle() {
		return (double) Math.PI * this.radius * this.radius;
	}
}

//インスタンス
//問１
class Dog2 {
	String name;

	public Dog2(String name) {
		this.name = name;
	}
}

//問２
class Cat2 {
	String name;

	//ここに追加
	public Cat2(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println(name + "が鳴いた！");
	}
}

//問３
class Car {
	String model;
	int speed;

	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}
}

//問４
class Rectangle {
	int height;
	int width;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int areaSquare() {
		return width * height;
	}
}

//問５
class Robot {
	String move;

	public Robot(String move) {
		this.move = move;
	}

	public void move() {
		System.out.println(this.move);
	}
}

//問６
class Student2 {
	String name;
	int[] score;
	int total;

	Student2(String name, int[] score) {
		this.name = name;
		this.score = score;
		getTotal();
		getAverage();
	}

	public int getTotal() {
		for (int subject : score) {
			total += subject;
		}
		return total;
	}

	public double getAverage() {
		return (double) total / score.length;
	}
}

//引数と戻り値
class Question9 {
	public String greet(String name) {
		return "こんにちは" + name + "さん！";
	}

	public int add(int a, int b) {
		return a + b;
	}

	public boolean inEven(int num) {
		boolean even;
		if (num % 2 == 0) {
			even = true;
		} else {
			even = false;
		}
		return even;
	}

	public static String repeat(String word, int times) {
		// wordをtimes回繰り返した文字列を返す
		String result = "";
		for (int i = 0; i < times; i++) {
			result += word;
		}
		return result;
	}

	public double calcArea(double r) {
		return Math.PI * r * r;
	}

}