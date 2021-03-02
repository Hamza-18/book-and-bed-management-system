package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import model.Controller;
import model.Employee;
import tables.EmployeeTable;

public class UpdateEmployeeDialog extends JDialog {
	private SearchEmployeePanel searchEmployeePanel;
	private Controller controller;
	private EmployeeTable employeeTable;
	private JPanel updatePanel;
	private JLabel idLabel;
	private JTextField employeeId;
	private JButton updateBtn;
	private AddEmployeeDialog addEmployeeDialog;

	public UpdateEmployeeDialog() {
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);
		setMinimumSize(new Dimension(750, 700));
		setSize(new Dimension(750, 700));
		setLocationRelativeTo(null);

		controller = new Controller();
		employeeTable = new EmployeeTable();
		searchEmployeePanel = new SearchEmployeePanel();
		add(searchEmployeePanel, BorderLayout.NORTH);
		add(new JScrollPane(employeeTable), BorderLayout.CENTER);

		updatePanel = new JPanel();
		updatePanel.setBackground(Color.white);
		updatePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		add(updatePanel, BorderLayout.SOUTH);

		idLabel = new JLabel("CNIC");
		updatePanel.add(idLabel);

		employeeId = new JTextField(20);
		updatePanel.add(employeeId);

		updateBtn = new JButton("UPDATE");
		updatePanel.add(updateBtn);

		searchEmployeePanel.setInterface(new UpdateEmployeeInterface() {

			@Override
			public void getQuery(String query) {
				// TODO Auto-generated method stub
				employeeTable.setData(controller.getEmployees(query));
				employeeTable.refresh();
			}
		});

		updateBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (employeeId.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter employee Id");
				} else {
					String query = " where EmployeeId = " + "'" + Long.parseLong(employeeId.getText()) + "'";
					try {
						Employee employee = controller.getEmployees(query).get(0);
						addEmployeeDialog = new AddEmployeeDialog(employee);
						addEmployeeDialog.setVisible(true);

					} catch (IndexOutOfBoundsException e) {
						JOptionPane.showMessageDialog(null,
								"Employee ID entered is not correct or employee not found.");

					}
				}
			}
		});
	}
}
