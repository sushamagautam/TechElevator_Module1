package com.techelevator;

public class Employee {

	//Constants
	private static final double STARTING_SALARY = 60000;
	
	//instance variables
	private long employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private double salary;
	private Department department;
	private String hireDate;
	
	
	//constructor (w arguments)
	public Employee (long employeeId, String firstName, String lastName, String email, Department department, String hireDate) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.department = department;
		this.hireDate = hireDate;
		this.salary = STARTING_SALARY;
		
	}
	
	//method
	public String getFullName() {
		return this.lastName + ", " + this.getFirstName();
	}
	
	public void raiseSalary(double percent) {
		double raise = salary * percent / 100;
		this.salary += raise;
	}
	
	//getters and setters
	
		public long getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(long employeeId) {
			this.employeeId = employeeId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
	        return email;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public Department getDepartment() {
			return department;
		}
		public void setDepartment(Department department) {
			this.department = department;
		}
		public String getHireDate() {
			return hireDate;
		}
		public void setHireDate(String hireDate) {
			this.hireDate = hireDate;
		}
		
		
	
}
