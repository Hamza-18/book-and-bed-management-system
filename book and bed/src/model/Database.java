package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Database {
	private static final String DATABASE = "BooknBed";

	private ArrayList<Student> students;
	private ArrayList<Employee> employees;
	private ArrayList<Kitchen> monthlyExpense;
	private ArrayList<Kitchen> dailyExpense;
	private Connection connection;

	public Database() {
		students = new ArrayList<>();
		employees = new ArrayList<>();
		monthlyExpense = new ArrayList<>();
		dailyExpense = new ArrayList<>();
	}

	public void setConnection() throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new Exception("Driver not found");
		}

		String url = "jdbc:mysql://localhost:3306/BooknBed";
		connection = DriverManager.getConnection(url, "root", "password");
	}

	public void addEmployee(Employee employee) throws SQLException {

		String checkId = "Select * from Employees";
		Statement stmt = connection.createStatement();
		String addData = "insert into Employees values(?,?,?,?,?,?,?,?)";
		String addDataTwo = "insert into Employees(Name,Phone_Number, Gender, Duration, Designation, Salary, Date) Values (?,?,?,?,?,?,?)";
		PreparedStatement Insertstmt = connection.prepareStatement(addData);
		ResultSet checkResult = stmt.executeQuery(checkId);
		if (employee.getId() != null) {
			Insertstmt = connection.prepareStatement(addData);
			Insertstmt.setLong(1, Long.parseLong(employee.getId()));
			Insertstmt.setString(2, employee.getName());
			Insertstmt.setString(3, employee.getNumber());
			Insertstmt.setString(4, employee.getGender());
			Insertstmt.setString(5, employee.getDuration());
			Insertstmt.setString(6, employee.getWorkType());
			Insertstmt.setString(7, employee.getSalary());
			Insertstmt.setDate(8, (Date) employee.getDate());
			Insertstmt.execute();
		}

		else {
			Insertstmt = connection.prepareStatement(addDataTwo);
			Insertstmt.setString(1, employee.getName());
			Insertstmt.setString(2, employee.getNumber());
			Insertstmt.setString(3, employee.getGender());
			Insertstmt.setString(4, employee.getDuration());
			Insertstmt.setString(5, employee.getWorkType());
			Insertstmt.setString(6, employee.getSalary());
			Insertstmt.setDate(7, (Date) employee.getDate());
			Insertstmt.execute();

		}

	}

	public void addPayment(Employee employee) throws SQLException {
		Statement stmt = connection.createStatement();
		String addData = "insert into EmployeePayments values(?,?,?,?,?,?,?)";
		PreparedStatement Insertstmt = connection.prepareStatement(addData);

		Insertstmt = connection.prepareStatement(addData);
		Insertstmt.setString(1, employee.getId());
		Insertstmt.setString(2, employee.getName());
		Insertstmt.setString(3, employee.getNumber());
		Insertstmt.setString(4, employee.getGender());
		Insertstmt.setString(5, employee.getWorkType());
		Insertstmt.setString(6, employee.getSalary());
		Insertstmt.setDate(7, (Date) employee.getDate());
		Insertstmt.execute();

	}

	public void addMonthlyExpense(Kitchen kitchen) throws SQLException {
		Statement stmt = connection.createStatement();
		String addData = "insert into KitchenMonthlyExpense values(?,?,?)";
		PreparedStatement Insertstmt = connection.prepareStatement(addData);

		Insertstmt = connection.prepareStatement(addData);
		Insertstmt.setString(1, kitchen.getMonth());
		Insertstmt.setDate(2, (Date) kitchen.getDate());
		Insertstmt.setString(3, kitchen.getExpense());
		Insertstmt.execute();

	}

	public void addDailyExpense(Kitchen kitchen) throws SQLException {
		Statement stmt = connection.createStatement();
		String addData = "insert into KitchenDailyExpense values(?,?)";
		PreparedStatement Insertstmt = connection.prepareStatement(addData);

		Insertstmt = connection.prepareStatement(addData);
		Insertstmt.setString(1, kitchen.getExpense());
		Insertstmt.setString(2, kitchen.getExpense());
		Insertstmt.execute();

	}

	public void addStudents(Student student) throws SQLException {
		Statement stmt = connection.createStatement();
		String addData = "insert into Students values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		String addDataTwo = "insert into Students(StudentName,FatherName,Gender,StudentNumber, GuardianNumber"
				+ ", Email, BloodGroup, Address, City,Employment,University,Semester,Department,AdmissionDate,Rent,SecurityFee,RoomNumber,Resident) Values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement Insertstmt = connection.prepareStatement(addData);
		if (student.getId() != null) {
			Insertstmt = connection.prepareStatement(addData);
			Insertstmt.setLong(1, Long.parseLong(student.getId()));
			Insertstmt.setString(2, student.getName());
			Insertstmt.setString(3, student.getFatherName());
			Insertstmt.setString(4, student.getGender());
			Insertstmt.setString(5, student.getStudentNumber());
			Insertstmt.setString(6, student.getGuardianNumber());
			Insertstmt.setString(7, student.getStudentEmail());
			Insertstmt.setString(8, student.getBloodGroup());
			Insertstmt.setString(9, student.getAddress());
			Insertstmt.setString(10, student.getCity());
			Insertstmt.setString(11, student.getEmployment());
			Insertstmt.setString(12, student.getUniversity());
			Insertstmt.setString(13, student.getSemester());
			Insertstmt.setString(14, student.getDepartment());
			Insertstmt.setDate(15, (Date) student.getAdmissionDate());
			Insertstmt.setString(16, student.getRent());
			Insertstmt.setString(17, student.getSecurityFee());
			Insertstmt.setString(18, student.getRoomNumber());
			Insertstmt.setString(19, "Yes");

			Insertstmt.execute();
		}

		else {
			Insertstmt = connection.prepareStatement(addDataTwo);
			Insertstmt.setString(1, student.getName());
			Insertstmt.setString(2, student.getFatherName());
			Insertstmt.setString(3, student.getGender());
			Insertstmt.setString(4, student.getStudentNumber());
			Insertstmt.setString(5, student.getGuardianNumber());
			Insertstmt.setString(6, student.getStudentEmail());
			Insertstmt.setString(7, student.getBloodGroup());
			Insertstmt.setString(8, student.getAddress());
			Insertstmt.setString(9, student.getCity());
			Insertstmt.setString(10, student.getEmployment());
			Insertstmt.setString(11, student.getUniversity());
			Insertstmt.setString(12, student.getSemester());
			Insertstmt.setString(13, student.getDepartment());
			Insertstmt.setDate(14, (Date) student.getAdmissionDate());
			Insertstmt.setString(15, student.getRent());
			Insertstmt.setString(16, student.getSecurityFee());
			Insertstmt.setString(17, student.getRoomNumber());
			Insertstmt.setString(18, "Yes");

			Insertstmt.execute();

		}

	}

	public ArrayList<Employee> getEmployees(String query) throws SQLException {
		employees.clear();
		String getDb;
		if (query == null)
			getDb = "select * from Employees ";
		else {
			getDb = "select * from Employees ";
			getDb += query;
		}
		System.out.println(getDb);
		Statement selectStmt = connection.createStatement();
		ResultSet checkResult = selectStmt.executeQuery(getDb);
		while (checkResult.next()) {
			String id = checkResult.getLong("EmployeeId") + "";
			String name = checkResult.getString("Name");
			String number = checkResult.getString("Phone_Number");
			String gender = checkResult.getString("Gender");
			String duration = checkResult.getString("Duration");
			String type = checkResult.getString("Designation");
			String salary = checkResult.getString("Salary");
			Date date = checkResult.getDate("Date");
			employees.add(new Employee(id, name, number, gender, duration, type, salary, date));
		}
		checkResult.close();
		selectStmt.close();
		return employees;
	}

	public void deleteEmployee(String query) throws SQLException {
		Statement stmt = connection.createStatement();
		PreparedStatement deleteStmt = connection.prepareStatement(query);
		deleteStmt.execute();
		stmt.close();

	}

	public List<Student> getStudents() {
		return students;
	}

	public List<Employee> getemEmployees() {
		return employees;
	}

	public List<Kitchen> getMonthlyExpense() {
		return monthlyExpense;
	}

	public List<Kitchen> getDailyExpense() {
		return dailyExpense;
	}

}
