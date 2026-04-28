package com.example.app;

import static com.example.app.Utility.*;
import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.List;

import com.example.test.OtherPackagePrivate;

//名前空間
//～import
//～アクセス制御
public class Main {
	//import com.example.utils.Helper; //不可視
	public static void main(String[] args) {
		//問５
		//Helper Helper =new Helper //importができないため、これも定義できない

		//import問１
		ArrayList<String> str = new ArrayList<>(List.of(
				"赤", "青", "緑"));
		for (String s : str) {
			System.out.print(s + " ");
		}
		System.out.println();
		//問２
		ArrayList<String> str2 = new ArrayList<>();
		str2.add("春は曙");
		str2.add("夏は夜");
		str2.add("秋は夕暮");
		str2.add("冬はつとめて");
		for (String m : str2) {
			System.out.print(m + " ");
		}
		System.out.println();
		//問３
		int r;
		r = 10;
		double circleArea = PI * r * r;
		System.out.println(String.format("半径" + r + "の円の面積は、%.3fです", circleArea));

		//問４
		greet();

		//問５
		int n;
		n = 10;
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			numList.add((int) (Math.random() * 100));
		}
		for (int nl : numList) {
			System.out.println(nl + " ");
		}

		//問６
		//BMI計算
		double height;
		double weight;
		double bmi;
		height = 174.2;
		weight = 69.5;
		bmi = weight / pow((height / 100), 2);
		System.out.println(String.format("身長%.1fcm、体重%.1fの人のBMIは%.2fです", height, weight, bmi));

		//正三角形の面積
		double side;
		side = 10.0;
		double triangleArea;
		triangleArea = side * side * sqrt(3);
		System.out.println(String.format("１辺%.1fcmの正三角形の面積は%.3fです", side, triangleArea));

		//アクセス制御
		//問３
		Child child =new Child();
		child.Dog("ポチ");
		
		//問４
		Animal dog =new Dog();
		System.out.println(dog.makeSound());

		//問５
		PackagePrivate message1 =new PackagePrivate();
		message1.PackagePrivateMethod();//同PKGのpackage-privateは見える
		
		OtherPackagePrivate message2 =new OtherPackagePrivate();
		//message2.OrherPackagePrivateMethod(); //別PKGのpackage-privateは不可視
	}
}

//import
//問４
class Utility {
	public static void greet() {
		System.out.println("おはようございます、こんにちわ、こんばんわ");
	}
}

//アクセス制御
//問１
class Person {
	private String name;
	protected int age;
	public String address;

	//セッター
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	//ゲッター
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}
}

//問２
class Employee{
	private String name;
	private int age;
	private String address;
	//セッター
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	//ゲッター
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}
}
//問３
class Parent{
	protected String Move(String s) {
		return s+"をする";
	}
}
class Child extends Parent{
	public void Dog(String name) {
		System.out.println(name+"は"+Move("お手"));
	}
}

//問４
class Animal{
	protected String makeSound() {
		return "動物の鳴き声";
	}
}
class Dog extends Animal{
	@Override
	public String makeSound() {
		return "ワンワン";
	}
}

//問５
class BankAccount{
	private int balance;
	public int getBalance() {
		return balance;
	}
	public void deposit(int amount) {
		balance=amount;
	}
}

//問６
class PackagePrivate{
	void PackagePrivateMethod() {
		System.out.println("同じクラスのパッケージプライベート");
	}
}

