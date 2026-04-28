package com.example.chapter12;

public class AbstractClass {

	public static void main(String[] args) {
		//問２
		Vehicle car = new Car();
		car.move();

		//問３
		Animal2 dog = new Dog2();
		System.out.println(dog.makeSound() + "と鳴いた後、" + dog.sleep());

		//問４
		Person student = new Student("田中太郎");
		student.introduce();

		//問５
		Shape rectangle = new Rectangle(3, 6);
		System.out.println("面積は" + rectangle.calculateArea() +
				"、周囲長は" + rectangle.calculatePerimeter());

		//問６
		Computer device = new Computer("PC4738");
		device.powerOn();
		device.useDevice();
		
		//問７
		Appliance microwave=new Microwave();
		microwave.tyrnOn();
		microwave.tyrnOff();
	}
}

//問１
abstract class Animal {
	abstract public String makeSound();

}

class Dog extends Animal {
	@Override
	public String makeSound() {
		return "BauBau";
	}
}

class Cat extends Animal {
	@Override
	public String makeSound() {
		return "Meou";
	}
}

//問２
abstract class Vehicle {
	abstract protected void move();
}

class Car extends Vehicle {
	@Override
	public void move() {
		System.out.println("走る");
	}
}

//問３
abstract class Animal2 {
	abstract public String makeSound();

	public String sleep() {
		return "寝ている";
	}

}

class Dog2 extends Animal2 {
	@Override
	public String makeSound() {
		return "BauBau";
	}
}

//問４
abstract class Person {
	protected String name;

	public Person(String name) {
		this.name = name;
	}

	abstract public void introduce();
}

class Student extends Person {
	public Student(String name) {
		super(name);
	}

	@Override
	public void introduce() {
		System.out.println("私の名前は" + name + "です");
	}
}

//問５
abstract class Shape {
	abstract public int calculateArea();

	abstract public int calculatePerimeter();
}

class Rectangle extends Shape {
	private int width;
	private int height;

	public Rectangle(int a, int b) {
		if (a > 0 && b > 0) {
			width = a;
			height = b;
		}
	}

	@Override
	public int calculateArea() {
		return width * height;
	}

	@Override
	public int calculatePerimeter() {
		return (width + height) * 2;
	}
}

//問６
abstract class Device {
	public final void powerOn() {
		System.out.println("電源ON");
	}
}

class Computer extends Device {
	private String name;
	public Computer(String name) {
		this.name = name;
	}

	public void useDevice() {
		System.out.println(name + "を使用しています。");
	}
}

//問７
abstract class Appliance{
	abstract public void tyrnOn();
	abstract public void tyrnOff();
}

abstract class KitchenAppliance extends Appliance{
	@Override
	public void tyrnOn() {
		System.out.println("電源をONにしました");
	}
}
class Microwave extends KitchenAppliance{
	@Override
	public void tyrnOff(){
		System.out.println("電源をOffにしました");
	}
}