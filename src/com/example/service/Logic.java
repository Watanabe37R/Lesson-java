package com.example.service;
//名前空間
import com.example.model.Data;
public class Logic {
	//問６
	public void setData(Data data) {
		 data.setName("山田太郎");
		 data.setAge(25);
	}
	public void getData(Data data) {
		System.out.println(data.getName());
		System.out.println(data.getAge()+"歳");
	}
}
