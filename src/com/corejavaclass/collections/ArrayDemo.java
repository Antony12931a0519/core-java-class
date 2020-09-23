package com.corejavaclass.collections;

public class ArrayDemo {

	public static void main(String[] args) {

		String[] names = new String[11];

		for (int i = 0; i <= 10; i++) {
			names[i] = "Antony" + i;
		}

		for (String name : names) {
			System.out.println(name);
		}

	}

}
