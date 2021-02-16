package tables;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import model.Employee;

public class EmployeeTableModel extends AbstractTableModel {
	private ArrayList<Employee> employeeList;
	private String[] columnName = { "EmployeeId", "Name", "PhoneNumber", "Gender", "Duration", "Designation", "Salary",
			"Date" };

	public EmployeeTableModel() {
		employeeList = new ArrayList();
	}

	public String getColumnName(int col) {

		return columnName[col];
	}

	public void setList(ArrayList<Employee> list) {
		this.employeeList = list;
	}

	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return employeeList.size();
	}

	@Override
	public Object getValueAt(int row, int col) {
		Employee employee = employeeList.get(row);
		// for selected row return each column value.
		switch (col) {
		case 0:
			return employee.getId();
		case 1:
			return employee.getName();
		case 2:
			return employee.getNumber();
		case 3:
			return employee.getGender();
		case 4:
			return employee.getDuration();
		case 5:
			return employee.getWorkType();
		case 6:
			return employee.getDate();
		}
		return null;

	}
}
