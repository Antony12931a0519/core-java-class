package com.corejavaclass.exception.handling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		System.out.println(1);
//		System.out.println(1/0);

		try {

			System.out.println(1 / 0);
			
			

		} catch (Exception ex) {
			System.out.println("Exception occured");
			ex.printStackTrace();
		}finally{
			//code clean up activities
			System.out.println("End of the program");
		}
		System.out.println("dfghjk");
		
		

	}

}
