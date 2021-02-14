package model;

import java.sql.Date;

public class Employee {
	private String name;
	private String id;
	private String number;
	private String gender;
	private String duration;
	private String workType;
	private String salary;
	private java.sql.Date date;
	private static int count = 0;
	private static int paymentCount = 0;

	// Employee Constructor
	public Employee(String id, String name, String number, String gender, String duration, String work, String salary,
			java.sql.Date date) {

		setName(name);
		setId(id);
		setNumber(number);
		setGender(gender);
		setDuration(duration);
		setWorkType(work);
		setSalary(salary);
		setDate(date);
	}

	public Employee(String name, String number, String gender, String duration, String work, String Salary,
			java.sql.Date date) {
		setName(name);
		setNumber(number);
		setGender(gender);
		setDuration(duration);
		setWorkType(work);
		setSalary(salary);
		setDate(date);
	}

	// Payment Constructor
	public Employee(String name, String number, String gender, String work, String salary, java.sql.Date date,
			String id) {

		setName(name);
		setId(id);
		setNumber(number);
		setGender(gender);
		setWorkType(work);
		setSalary(salary);
		setDate(date);
	}

	public Employee(String name, String number, String gender, String work, String salary, java.sql.Date date) {

		this(name, number, gender, work, salary, date, paymentCount + "");
		this.paymentCount++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getWorkType() {
		return workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public static int getPaymentCount() {
		return paymentCount;
	}

	public static void setPaymentCount(int count) {
		Employee.paymentCount = count;
	}
}
