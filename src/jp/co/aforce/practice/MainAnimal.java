package jp.co.aforce.practice;

//プログラムの仕組み&オブジェクト指向 問７
public class MainAnimal {

	public static void main(String[] args) {
		Animal a = new Cat();
		a.speak();
	}

}

class Animal {
	void speak() {
		System.out.println("Some sound");
	}
}

class Cat extends Animal {
	// ここにコードを追加
	@Override
	void speak() {
		System.out.println("Meow!");
	}

}
