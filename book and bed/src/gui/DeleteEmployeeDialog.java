package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Controller;
import tables.EmployeeTable;

public class DeleteEmployeeDialog extends JDialog {
	private DeleteEmployeePanel deleteEmployeePanel;
	private EmployeeTable employeeTable;
	private Controller controller;
	private JPanel deletePanel;
	private JLabel deletelaLabel;
	private JTextField deleteId;
	private JButton deleteButton;

	public DeleteEmployeeDialog() {
		setLayout(new BorderLayout());
		setSize(new Dimension(700, 700));

		deleteEmployeePanel = new DeleteEmployeePanel();
		add(deleteEmployeePanel, BorderLayout.NORTH);

		employeeTable = new EmployeeTable();
		controller = new Controller();
		add(employeeTable, BorderLayout.CENTER);

		deletePanel = new JPanel();
		deletePanel.setBackground(Color.white);
		deletePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

		deletelaLabel = new JLabel("CNIC");
		deletePanel.add(deletelaLabel);
		deleteId = new JTextField(20);
		deletePanel.add(deleteId);

		deleteButton = new JButton("DELETE");
		deletePanel.add(deleteButton);
		add(deletePanel, BorderLayout.SOUTH);

		deleteEmployeePanel.setInterface(new UpdateEmployeeInterface() {

			@Override
			public void getQuery(String query) {
				// TODO Auto-generated method stub
				employeeTable.setData(controller.getEmployees(query));
				employeeTable.refresh();
			}
		});

		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (!deleteId.getText().equals("")) {
					String query = "Delete from Employees where EmployeeId = " + "'"
							+ Long.parseLong(deleteId.getText()) + "'";
					try {
						controller.deleteEmployee(query);
						employeeTable.refresh();
						JOptionPane.showMessageDialog(null, "Employee has been deleted");
					} catch (SQLException e) {
						// TODO Auto-generated catch block
					}
				}
			}
		});
	}
}
