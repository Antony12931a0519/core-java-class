package com.corejavaclass.datatypes;

public class Student {
	public static void main(String[] args) {
		//local variable needs to be given with some default values
		String name = null;
		
		sName= "sai";
		System.out.println(sName);
		
		System.out.println(name);
		
//		System.out.println(Student.name);
		Student student = new Student();
		
//		System.out.println(student.name);
		
		System.out.println(Student.sName);
		
		
		
		System.out.println(student.sName);
		
//		System.out.println(address);
//		System.out.println(Student.address);
		System.out.println(student.address);
		
		/*System.out.println(address);
		System.out.println(intitial);
		System.out.println(mobileNumber);
		System.out.println(age);*/
	}

	//static variable
	static String sName="fjfHFU";
	//final variable
	final static String sNamedd="fjfHFU";
	//non static variable
	String address;
	/*char intitial;
	String mobileNumber;
	int age;*/
	
		

}
