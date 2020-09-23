package com.corejavaclass.collections.examples;

public class Student {

	private String name;
	private int sid;
	private String department;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sid
	 */
	public int getSid() {
		return sid;
	}

	/**
	 * @param sid
	 *            the sid to set
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department
	 *            the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", sid=" + sid + ", department="
				+ department + "]";
	}

	/**
	 * @param name
	 * @param sid
	 * @param department
	 */
	public Student(String name, int sid, String department) {
		super();
		this.name = name;
		this.sid = sid;
		this.department = department;
	}
	
	

}
