package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePanel extends JPanel {
	private JPanel titlePanel;
	private JPanel componentsPanel;
	private JPanel panel;
	private JLabel totalStudentsLabel;
	private JPanel panel_1;
	private JLabel totalEmployeesLabel;
	private JLabel students;
	private JLabel employees;
	private JPanel panel_2;
	private JLabel maleStudentslabel;
	private JPanel panel_3;
	private JLabel femaleStudentsLabel;
	private JLabel maleStudents;
	private JLabel femaleStudents;

	public HomePanel() {
		setBackground(new Color(255, 255, 255));
		setLayout(new BorderLayout());

		titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		add(titlePanel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Home");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 35));
		titlePanel.add(lblNewLabel);

		componentsPanel = new JPanel();
		componentsPanel.setLayout(null);
		componentsPanel.setBackground(new Color(255, 255, 255));
		add(componentsPanel, BorderLayout.CENTER);

		panel = new JPanel();
		panel.setBounds(25, 43, 219, 36);
		componentsPanel.add(panel);

		totalStudentsLabel = new JLabel("Total Students");
		panel.add(totalStudentsLabel);

		panel_1 = new JPanel();
		panel_1.setBounds(486, 43, 219, 36);
		componentsPanel.add(panel_1);

		totalEmployeesLabel = new JLabel("Total Employees");
		panel_1.add(totalEmployeesLabel);

		students = new JLabel("0");
		students.setFont(new Font("Dialog", Font.PLAIN, 40));
		students.setBounds(113, 112, 91, 63);
		componentsPanel.add(students);

		employees = new JLabel("0");
		employees.setFont(new Font("Dialog", Font.PLAIN, 40));
		employees.setBounds(558, 106, 91, 74);
		componentsPanel.add(employees);

		panel_2 = new JPanel();
		panel_2.setBounds(25, 198, 122, 36);
		componentsPanel.add(panel_2);

		maleStudentslabel = new JLabel("Male Students");
		panel_2.add(maleStudentslabel);

		panel_3 = new JPanel();
		panel_3.setBounds(208, 198, 122, 36);
		componentsPanel.add(panel_3);

		femaleStudentsLabel = new JLabel("Male Students");
		panel_3.add(femaleStudentsLabel);

		maleStudents = new JLabel("0");
		maleStudents.setFont(new Font("Dialog", Font.PLAIN, 40));
		maleStudents.setBounds(70, 258, 91, 63);
		componentsPanel.add(maleStudents);

		femaleStudents = new JLabel("0");
		femaleStudents.setFont(new Font("Dialog", Font.PLAIN, 40));
		femaleStudents.setBounds(239, 258, 91, 63);
		componentsPanel.add(femaleStudents);

	}
}
