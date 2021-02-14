package model;

import java.sql.SQLException;

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

}
