package jp.co.aforce.sample;

public class Chapter8Exercises {

	public static void main(String[] args) {
		
	}
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
		System.out.println("nyan");
	}
}

