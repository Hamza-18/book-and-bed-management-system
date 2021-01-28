package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EmployeePanel extends JPanel {
	private JPanel titlePanel;
	private JPanel componentsPanel;
	private JPanel viewEmployeePanel;
	private JPanel addEmployeePanel;
	private JPanel updateEmployeePanel;
	private JPanel deleteEmployeePanel;

	private JLabel lblViewEmployee;
	private JLabel lblDeleteEmployee;
	private JLabel lblUpdateEmployee;
	private JLabel lblAddEmployee;

	private Image addEmployeeIcon;
	private Image updateEmployeeIcon;
	private Image deleteEmployeeIcon;
	private Image viewEmployeeIcon;

	public EmployeePanel() {
		setLayout(new BorderLayout());
		setBackground(new Color(255, 255, 255));

		setComponents();
	}

	public void setComponents() {
		titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		add(titlePanel, BorderLayout.NORTH);

		JLabel lblEmployees = new JLabel("Employees");
		lblEmployees.setFont(new Font("Dialog", Font.BOLD, 35));
		titlePanel.add(lblEmployees);

		componentsPanel = new JPanel();
		componentsPanel.setLayout(null);
		componentsPanel.setBackground(new Color(255, 255, 255));
		add(componentsPanel, BorderLayout.CENTER);

		viewEmployeePanel = new JPanel();
		viewEmployeePanel.setBounds(12, 63, 301, 65);
		componentsPanel.add(viewEmployeePanel);

		lblViewEmployee = new JLabel("View Employees");
		lblViewEmployee.setFont(new Font("Dialog", Font.BOLD, 25));
		viewEmployeePanel.add(lblViewEmployee);

		addEmployeePanel = new JPanel();
		addEmployeePanel.setBounds(343, 63, 296, 65);
		componentsPanel.add(addEmployeePanel);

		lblAddEmployee = new JLabel("Add Employee");
		lblAddEmployee.setFont(new Font("Dialog", Font.BOLD, 25));
		addEmployeePanel.add(lblAddEmployee);

		updateEmployeePanel = new JPanel();
		updateEmployeePanel.setBounds(12, 179, 301, 65);
		componentsPanel.add(updateEmployeePanel);

		lblUpdateEmployee = new JLabel("Update Employee");
		lblUpdateEmployee.setFont(new Font("Dialog", Font.BOLD, 25));
		updateEmployeePanel.add(lblUpdateEmployee);

		deleteEmployeePanel = new JPanel();
		deleteEmployeePanel.setBounds(343, 179, 296, 65);
		componentsPanel.add(deleteEmployeePanel);

		lblDeleteEmployee = new JLabel("Delete Employee");
		lblDeleteEmployee.setFont(new Font("Dialog", Font.BOLD, 25));
		deleteEmployeePanel.add(lblDeleteEmployee);

		addEmployeeIcon = new ImageIcon(StudentPanel.class.getResource("/res/adduser.png")).getImage()
				.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		lblAddEmployee.setIcon(new ImageIcon(addEmployeeIcon));

		deleteEmployeeIcon = new ImageIcon(StudentPanel.class.getResource("/res/deleteuser.png")).getImage()
				.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		lblDeleteEmployee.setIcon(new ImageIcon(deleteEmployeeIcon));

		updateEmployeeIcon = new ImageIcon(StudentPanel.class.getResource("/res/update.png")).getImage()
				.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		lblUpdateEmployee.setIcon(new ImageIcon(updateEmployeeIcon));

		viewEmployeeIcon = new ImageIcon(StudentPanel.class.getResource("/res/viewdata.jpeg")).getImage()
				.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		lblViewEmployee.setIcon(new ImageIcon(viewEmployeeIcon));
	}
}
