package com.corejavaclass.custom.exception.handling;

public class CreditCardException extends Exception {

	private int code;

	/**
	 * @param code
	 * @param message
	 */
	public CreditCardException(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public CreditCardException() {

	}

	private String message;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CreditCardException [code=" + code + ", message=" + message
				+ "]";
	}
	
	
	
	

}
