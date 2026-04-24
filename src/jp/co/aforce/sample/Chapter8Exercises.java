package jp.co.aforce.sample;

public class Chapter8Exercises {

	public static void main(String[] args) {

	}
}

//カプセル化の問２
class PersonCapsule {
	//String name;
	private String name;
	//int age;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
	}
	public String getName() {
		return name;
	}
	//・・・
}

//継承の問２
class Person {
	String name;
	int age;
}

class Student extends Person {
	//String name;
	//int age;
	String studentId;
}

//ポリモーフィズムの問２
class Animal {
	void makeSound() {
		System.out.println("Some sound...");
	}
}

class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("bowwow");
	}
}

class Cat extends Animal {
	@Override
	void makeSound() {
		System.out.println("meow");
	}
}
