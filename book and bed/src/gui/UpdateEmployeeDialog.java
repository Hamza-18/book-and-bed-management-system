package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JScrollPane;

import model.Controller;
import tables.EmployeeTable;

public class UpdateEmployeeDialog extends JDialog {
	private SearchEmployeePanel searchEmployeePanel;
	private Controller controller;
	private EmployeeTable employeeTable;

	public UpdateEmployeeDialog() {
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);
		setSize(new Dimension(700, 700));

		controller = new Controller();
		employeeTable = new EmployeeTable();
		searchEmployeePanel = new SearchEmployeePanel();
		add(searchEmployeePanel, BorderLayout.NORTH);
		add(new JScrollPane(employeeTable), BorderLayout.CENTER);
		searchEmployeePanel.setInterface(new UpdateEmployeeInterface() {

			@Override
			public void getQuery(String query) {
				// TODO Auto-generated method stub
				employeeTable.setData(controller.getEmployees(query));
				employeeTable.refresh();
			}
		});
	}
}
