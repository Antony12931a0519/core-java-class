package com.corejavaclass.datatypes;

public class Doctor {
	private String name;
	private String address;
	private int age;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	

	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Doctor [name=" + name + "]";
	}

	public static void main(String[] args) {

		Doctor doctor = new Doctor();
		doctor.setAddress("jfdhkfjs");
		doctor.setAge(12);
		doctor.setName("jhfiqk");
		
		
		System.out.println(doctor);
		/*
		 * System.out.println(name); System.out.println(address);
		 * System.out.println(age);
		 */
	}

}
