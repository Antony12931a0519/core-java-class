package com.corejavaclass.exception.handling;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.corejavaclass.custom.exception.handling.CreditCardException;

public class CreditCardSystem {

	public static void main(String[] args) throws Exception,
			CreditCardException {
		boolean inputMismatched = true;

		long cnumber;
		int pin = 0;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Please enter the card number:");
				cnumber = sc.nextLong();
				System.out.println("Please enter the pin:");
				pin = sc.nextInt();
			} catch (Exception e) {
				inputMismatched = false;
				System.out.println("Invalid input type");
			}
			// if (pin == 1234) {
			// System.out.println("P,ease enyer t he option:");
			// System.out.println("processiong");
			// } else {
			// // throw new Exception("Please enter the correct pin.");
			//
			// throw new CreditCardException(500, "Invalid pin");
			// }
			// System.out.println("Thank you for the trasaction");
		} while (inputMismatched);

	}
}
