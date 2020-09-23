package com.corejavaclass.collections.examples;

import java.util.List;
import java.util.Stack;

public class CustomClassAsListExample {

	public static void main(String[] args) {
		// List<Student> students = new ArrayList<Student>();

		// List<Student> students = new LinkedList<Student>();//works on linked
		// list

		// List<Student> students = new Vector<Student>();//sizing is not
		// mplemeted properly

		List<Student> students = new Stack<Student>();// sizing is not mplemeted
														// properly

		Student s1 = new Student("Antony", 1, "CSE");
		students.add(s1);
		students.add(s1);
		students.add(s1);
		Student s2 = new Student("Sampath", 2, "CSE");
		students.add(s2);
		Student s3 = new Student("Vikky", 3, "CSE");
		Student s4 = new Student("Dikky", 4, "CSE");
		Student s5 = new Student("Sikky", 5, "CSE");

		students.add(s3);
		students.add(s4);
		students.add(s5);

		// System.out.println(students);

		System.out.println("Actual List:");
		for (Student name : students) {
			System.out.println(name);
		}

		if (students != null && students.size() > 0) {
			students.remove(0);
		}

		System.out.println("Updated List:");
		for (Student name : students) {
			System.out.println(name);
		}

		System.out.println("Final List:");
		// students.clear();
		// students.removeAll(c)
		System.out.println(students);

		if (students != null && students.size() > 0) {

			if (students.contains(students.get(0))) {
				System.out.println(students.get(0).getName());
			}
		}

	}

}
