package com.corejavaclass.collections.examples;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	// store list of all the student names in a college

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			names.add("Student-" + i);

		}
		System.out.println(names);

		for (String name : names) {
			System.out.println(name);
		}

	}

}
