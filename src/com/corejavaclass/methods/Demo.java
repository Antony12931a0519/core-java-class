package com.corejavaclass.methods;

import com.corejavaclass.datatypes.Doctor;

public class Demo {

	public static void main(String[] args) {
		printMessage();
		System.out.println("Hello World");
		Demo demo = new Demo();
		demo.printMessage1();
		// int age=10;
		// int result = demo.add(1, 3);
		// System.out.println(result);
		System.out.println(demo.add(1, 3));
		System.out.println(printDoctorDetails());

	}

	static void printMessage() {
		System.out.println("hey am executing");
		printMessage1();
	}

	static void printMessage1() {
		System.out.println("hey am executingdjhkjl");
	}

	public int add(int a, int b) {
		// System.out.println("wekkfhk");
		System.out.println(a + b);
		System.out.println("kjljflq");
		float weight = 34.5f;
		return a + b;
	}

	public static Doctor printDoctorDetails() {
		Doctor doc = new Doctor();
		doc.setAddress("ewfewf");
		doc.setAge(12);
		doc.setName("j,bfafq");
		return doc;

	}
}
