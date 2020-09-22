package com.corejavaclass.exception.handling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		System.out.println(1);

		try {

			System.out.println(1 / 0);

		} catch (Exception ex) {
			System.out.println("Exception occured");
			ex.printStackTrace();
		}
		System.out.println("dfghjk");

	}

}
