package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
		Insertstmt.setDate(1, (Date) kitchen.getDate());
		Insertstmt.setString(2, kitchen.getExpense());
		Insertstmt.execute();

	}

	public void addStudents(Student student) throws SQLException {
		Statement stmt = connection.createStatement();
		String addData = "insert into Students values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		String addDataTwo = "insert into Students(StudentName,FatherName,Gender,StudentNumber, GuardianNumber"
				+ ", Email, BloodGroup, Address, City,Employment,University,Semester,Department,AdmissionDate,"
				+ "Rent,SecurityFee,RoomNumber,Resident) Values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

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
			if (student.getResident() != null) {
				Insertstmt.setString(19, student.getResident());
			} else {
				Insertstmt.setString(19, "Yes");
			}

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
			if (student.getResident() != null) {
				Insertstmt.setString(18, student.getResident());
			} else {
				Insertstmt.setString(18, "Yes");
			}

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

	public ArrayList<Student> getStudents(String query) throws SQLException {
		students.clear();
		String getDb;
		if (query == null)
			getDb = "select * from Students";
		else {
			getDb = "select * from Students";
			getDb += query;
			System.out.println(getDb);
		}
		Statement selectStmt = connection.createStatement();
		ResultSet checkResult = selectStmt.executeQuery(getDb);
		while (checkResult.next()) {
			String id = checkResult.getLong("StudentId") + "";
			String studentName = checkResult.getString("StudentName");
			String fatherName = checkResult.getString("FatherName");
			String gender = checkResult.getString("Gender");
			String studentNumber = checkResult.getString("StudentNumber");
			String guardianNumber = checkResult.getString("GuardianNumber");
			String email = checkResult.getString("Email");
			String blood = checkResult.getString("BloodGroup");
			String address = checkResult.getString("Address");
			String city = checkResult.getString("City");
			String employment = checkResult.getString("Employment");
			String uni = checkResult.getString("University");
			String sem = checkResult.getString("Semester");
			String department = checkResult.getString("Department");
			Date date = checkResult.getDate("AdmissionDate");
			String rent = checkResult.getString("Rent");
			String fee = checkResult.getString("SecurityFee");
			String room = checkResult.getString("RoomNumber");
			String resident = checkResult.getString("Resident");
			students.add(new Student(id, studentName, fatherName, gender, studentNumber, guardianNumber, email, blood,
					address, city, employment, uni, sem, department, date, rent, fee, room, resident));
		}
		checkResult.close();
		selectStmt.close();
		return students;
	}

	public ArrayList<Employee> getPayments(String query) throws SQLException {
		employees.clear();
		String getDb = "select * from EmployeePayments";
		Statement selectStmt = connection.createStatement();
		ResultSet checkResult = selectStmt.executeQuery(getDb);
		while (checkResult.next()) {
			String id = checkResult.getLong("EmployeeId") + "";
			String name = checkResult.getString("EmployeeName");
			String number = checkResult.getString("PhoneNumber");
			String gender = checkResult.getString("Gender");
			String type = checkResult.getString("Designation");
			String salary = checkResult.getString("Payment");
			Date date = checkResult.getDate("Date");
			employees.add(new Employee(name, number, gender, type, salary, date, id));
		}
		checkResult.close();
		selectStmt.close();
		return employees;
	}

	public ArrayList<Kitchen> getMonthlyExpense() throws SQLException {
		monthlyExpense.clear();
		String query = "Select * from KitchenMonthlyExpense";
		Statement statement = connection.createStatement();
		ResultSet checkResult = statement.executeQuery(query);
		while (checkResult.next()) {
			String month = checkResult.getString("Month");
			Date date = checkResult.getDate("Date");
			String expense = checkResult.getString("Expense");

			monthlyExpense.add(new Kitchen(month, expense, date));
		}

		return monthlyExpense;
	}

	public ArrayList<Kitchen> getDailyExpense() throws SQLException {
		monthlyExpense.clear();
		String query = "Select * from KitchenDailyExpense";
		Statement statement = connection.createStatement();
		ResultSet checkResult = statement.executeQuery(query);
		while (checkResult.next()) {
			Date date = checkResult.getDate("Date");
			String expense = checkResult.getString("Expense");

			monthlyExpense.add(new Kitchen(expense, date));
		}

		return monthlyExpense;
	}

	public void deleteEmployee(String query) throws SQLException {
		Statement stmt = connection.createStatement();
		PreparedStatement deleteStmt = connection.prepareStatement(query);
		deleteStmt.execute();
		stmt.close();

	}

	public void deleteStudent(String query) throws SQLException {
		Statement stmt = connection.createStatement();
		PreparedStatement deleteStmt = connection.prepareStatement(query);
		deleteStmt.execute();
		stmt.close();

	}

	public int getStudentCount() throws SQLException {
		int count = 0;
		String query = "select Count(*) from Students where Resident = 'Yes' ";
		Statement statement = connection.createStatement();
		ResultSet checkResult = statement.executeQuery(query);
		if (checkResult.next())
			count = checkResult.getInt(1);
		return count;
	}

	public int getMaleStudentCount() throws SQLException {
		int count = 0;
		String query = "select Count(*) from Students where Resident = 'Yes' and Gender = 'Male'";
		Statement statement = connection.createStatement();
		ResultSet checkResult = statement.executeQuery(query);
		if (checkResult.next())
			count = checkResult.getInt(1);
		return count;
	}

	public int getFemaleStudentCount() throws SQLException {
		int count = 0;
		String query = "select Count(*) from Students where Resident = 'Yes' and Gender = 'Female'";
		Statement statement = connection.createStatement();
		ResultSet checkResult = statement.executeQuery(query);
		if (checkResult.next())
			count = checkResult.getInt(1);
		return count;
	}

	public int getEmployeeCount() throws SQLException {
		int count = 0;
		String query = "select Count(*) from Employees";
		Statement statement = connection.createStatement();
		ResultSet checkResult = statement.executeQuery(query);
		if (checkResult.next())
			count = checkResult.getInt(1);
		return count;
	}

	public ArrayList<String> getMaleRooms() throws SQLException {
		ArrayList<String> rooms = new ArrayList<>();

		String query = "Select RoomNumber from Students where Resident = 'Yes' and Gender = 'Male'";
		Statement statement = connection.createStatement();
		ResultSet checkResult = statement.executeQuery(query);
		while (checkResult.next()) {

			String room = checkResult.getString("RoomNumber");

			rooms.add(room);
		}

		return rooms;
	}

	public ArrayList<String> getFemaleRooms() throws SQLException {
		ArrayList<String> rooms = new ArrayList<>();

		String query = "Select RoomNumber from Students where Resident = 'Yes' and Gender = 'Female' ";
		Statement statement = connection.createStatement();
		ResultSet checkResult = statement.executeQuery(query);
		while (checkResult.next()) {

			String room = checkResult.getString("RoomNumber");

			rooms.add(room);
		}

		return rooms;
	}

}
