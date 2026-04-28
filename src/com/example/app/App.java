package com.example.app;

import com.example.model.Data;
import com.example.school.Student;
import com.example.service.Logic;

//名前空間
public class App {

	public static void main(String[] args) {
		//問３
		Student student =new Student("田中太郎",3);
		student.introduce();
		
		//問６
		Data data =new Data();
		Logic logic =new Logic();
		logic.setData(data);
		logic.getData(data);
	}

}
