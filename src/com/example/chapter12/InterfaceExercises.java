package com.example.chapter12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InterfaceExercises {

	public static void main(String[] args) {
		//問１
		Movable car = new Car2();
		car.move();

		//問２
		Animal3 dog = new Dog3();
		dog.makeSound();

		//問３
		Bird bird = new Bird();
		bird.makeSound();
		bird.fly();

		//問４
		Circle circle = new Circle(5);
		System.out.println(String.format("半径5の円の面積は%.3fです", circle.calculateArea()));

		//問５
		LaserPrinter laserPrinter = new LaserPrinter(true, "普通紙", "A4");
		laserPrinter.print();
		laserPrinter.showStatus();

		//問６
		C c = new C();
		c.message();

		//問７
		Circle2 circle2 = new Circle2(15);
		System.out.println("半径" + circle2.getR() + String.format("の円の満席は%.3f", circle2.calculateArea()));
		;
		Rectangle2 rectangle2 = new Rectangle2(14, 17);
		System.out.println("高さ" + rectangle2.getHeight() + "、幅" + rectangle2.getWidth() + "の長方形の面積は"
				+ (int) (rectangle2.calculateArea()));

		//問８
		ArrayList<Student2> student = new ArrayList<>(List.of(
				new Student2("田中太郎", 47),
				new Student2("山中次郎", 92),
				new Student2("大塚三郎", 59)));
		student.sort(new ScoreComparator());
		for (Student2 scores : student) {
			System.out.println(scores.toString());
		}
	}
}

//問１
interface Movable {
	public void move();
}

class Car2 implements Movable {
	@Override
	public void move() {
		System.out.println("車が動く");
	}
}

//問２
interface Animal3 {
	public void makeSound();
}

class Dog3 implements Animal3 {
	@Override
	public void makeSound() {
		System.out.println("わんわん");
	}
}

//問３
interface Flyable {
	public void fly();
}

class Bird implements Flyable, Animal3 {
	@Override
	public void makeSound() {
		System.out.println("ブッポウソウ");
	}

	@Override
	public void fly() {
		System.out.println("飛べる");
	}
}

//問４
interface MathConstants {
	double PI = 3.1415926535;
}

class Circle implements MathConstants {
	private int r;

	public Circle(int r) {
		this.r = r;
	}

	public double calculateArea() {
		return r * r * PI;
	}
}

//問５
interface Printer {

	public void print();

	void showStatus();
}

class LaserPrinter implements Printer {
	private boolean connection;
	private String paper;
	private String paperSize;

	public LaserPrinter(boolean connection, String paper, String paperSize) {
		this.connection = connection;
		this.paper = paper;
		this.paperSize = paperSize;
	}

	public void print() {
		System.out.println("印刷実行中です");
	}

	public void showStatus() {
		System.out.println("接続状況：" + connection +
				"\n用紙設定：" + paper +
				"\n用紙サイズ：" + paperSize);
	}
}

//問６
interface A {
	default void message() {
		System.out.println("interface-Aです");
	}
}

interface B {
	default void message() {
		System.out.println("interface-Bです");
	}
}

class C implements A, B {
	public void message() {
		A.super.message();
		B.super.message();
		System.out.println("競合解消");
	}
}

//問７
interface Shape2 {
	double calculateArea();
}

class Circle2 implements Shape2 {
	private int r;

	public Circle2(int r) {
		this.r = r;
	}

	public int getR() {
		return r;
	}

	@Override
	public double calculateArea() {
		return Math.PI * r * r;
	}
}

class Rectangle2 implements Shape2 {
	private int height;
	private int width;

	public Rectangle2(int a, int b) {
		height = a;
		width = b;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public double calculateArea() {
		return height * width;
	}
}

//問８
class Student2 {
	private String name;
	private int score;

	public Student2(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return name + "の成績は" + score + "点です";
	}

}

class ScoreComparator implements Comparator<Student2> {
	@Override
	public int compare(Student2 s1, Student2 s2) {
		return Integer.compare(s2.getScore(), s1.getScore()); // 降順
	}
}