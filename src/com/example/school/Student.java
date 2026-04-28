package com.example.school;
//名前空間
public class Student {
	//問３
	String name;
	int grade;
	public Student(String name,int grade) {
		this.name=name;
		this.grade=grade;
	}
	public void introduce() {
		System.out.println(name+"です。学年は"+grade+"です");
	}
}
