package com.SeleniumAnyWhere.com.anyAut;

public class Student {
	
	private int id;
	private String name;
	private int age;
	
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	Student(int id, String name, int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public void displayRecords(){
		System.out.println("Student id: "+id);
		System.out.println("Student name: "+name);
		System.out.println("Age of student is: "+age);
	}
	
}
