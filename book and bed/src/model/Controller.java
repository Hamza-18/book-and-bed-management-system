package model;

import java.sql.SQLException;
import java.util.ArrayList;

public class Controller {
	private static Database database = new Database();;

	public static void setConnection() throws Exception {
		database.setConnection();
	}

	public void addEmployee(Employee employee) throws SQLException {
		database.addEmployee(employee);
	}

	public void addPayment(Employee employee) throws SQLException {
		database.addPayment(employee);
	}

	public void addMonthlyExpense(Kitchen kitchen) throws SQLException {
		database.addMonthlyExpense(kitchen);
	}

	public void addDailyExpense(Kitchen kitchen) throws SQLException {
		database.addDailyExpense(kitchen);
	}

	public void addStudent(Student student) throws SQLException {
		database.addStudents(student);
	}

	public ArrayList<Employee> getEmployees(String query) {
		try {
			return database.getEmployees(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Employee> getPayments(String query) {
		try {
			return database.getPayments(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Kitchen> getMonthlyExpense() {
		try {
			return database.getMonthlyExpense();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Kitchen> getDailyExpense() {
		try {
			return database.getDailyExpense();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Student> getStudents(String query) {
		try {
			return database.getStudents(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void deleteEmployee(String query) throws SQLException {
		database.deleteEmployee(query);
	}

	public void deleteStudent(String query) throws SQLException {
		database.deleteStudent(query);
	}

	public String getStudentCount() throws SQLException {
		return database.getStudentCount() + "";
	}

	public String getMaleStudentCount() throws SQLException {
		return database.getMaleStudentCount() + "";
	}

	public String getFemaleCount() throws SQLException {
		return database.getFemaleStudentCount() + "";
	}

	public String getEmployeeCount() throws SQLException {
		return database.getEmployeeCount() + "";
	}

	public ArrayList<String> getMaleRooms() throws SQLException {

		return database.getMaleRooms();
	}

	public ArrayList<String> getFemaleRooms() throws SQLException {
		return database.getFemaleRooms();
	}

	public ArrayList<Student> getPaidStudents(String month) throws SQLException {
		return database.getPaidStudents(month);
	}

	public ArrayList<Student> getUnPaidStudents(String month) throws SQLException {
		return database.getUnPaidStudents(month);
	}

}
