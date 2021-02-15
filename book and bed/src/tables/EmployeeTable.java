package tables;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.Employee;

public class EmployeeTable extends JPanel {
	private JTable employeeTable;
	private EmployeeTableModel employeeTableModel;

	public EmployeeTable() {
		employeeTableModel = new EmployeeTableModel();
		employeeTable = new JTable(employeeTableModel);

		setLayout(new BorderLayout());
		add(new JScrollPane(employeeTable), BorderLayout.CENTER);
	}

	public void setData(ArrayList<Employee> db) {
		employeeTableModel.setList(db);
	}

	public void refresh() {

		employeeTableModel.fireTableDataChanged();
	}
}
