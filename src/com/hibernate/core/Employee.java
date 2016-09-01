package com.hibernate.core;

public class Employee {
	private int emp_id;
	private String emp_Name;
	private String emp_country;
	private String pincode;

	public Employee() {
		System.out.println("Employee - DC");
	}

	public Employee(String emp_Name, String emp_country, String pincode) {
		super();
		this.emp_Name = emp_Name;
		this.emp_country = emp_country;
		this.pincode = pincode;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_Name() {
		return emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public String getEmp_country() {
		return emp_country;
	}

	public void setEmp_country(String emp_country) {
		this.emp_country = emp_country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
