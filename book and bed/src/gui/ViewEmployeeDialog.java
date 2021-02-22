package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;

import model.Controller;
import tables.EmployeeTable;

public class ViewEmployeeDialog extends JDialog {
	private EmployeeTable employeeTable;
	private Controller controller;

	public ViewEmployeeDialog(JFrame parent) {
		super(parent, "Employees", true);
		setSize(new Dimension(800, 800));
		setLayout(new BorderLayout());
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);

		employeeTable = new EmployeeTable();
		controller = new Controller();

		add(employeeTable, BorderLayout.CENTER);

	}

	public void setData() {
		employeeTable.setData(controller.getEmployees(null));
		employeeTable.refresh();
		setVisible(true);

	}
}
