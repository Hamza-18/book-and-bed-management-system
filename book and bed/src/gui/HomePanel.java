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
	private JPanel totalStudentPanel;
	private JPanel totalEmployeePanel;
	private JPanel maleStudentPanel;

	private JLabel totalStudentsLabel;
	private JLabel totalEmployeesLabel;
	private JLabel students;
	private JLabel employees;
	private JLabel maleStudentslabel;
	private JPanel femaleStudentPanel;
	private JLabel femaleStudentsLabel;
	private JLabel maleStudents;
	private JLabel femaleStudents;

	private static int BASIC_RED = 178;
	private static int BASIC_GREEN = 176;
	private static int BASIC_BLUE = 152;

	public HomePanel() {
		setBackground(new Color(255, 255, 255));
		setLayout(new BorderLayout());

		setComponents();
		setColor();
	}

	public void setComponents() {
		titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		titlePanel.setBackground(new Color(227, 187, 58));
		add(titlePanel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Home");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 35));
		titlePanel.add(lblNewLabel);

		componentsPanel = new JPanel();
		componentsPanel.setLayout(null);
		componentsPanel.setBackground(new Color(255, 255, 255));
		add(componentsPanel, BorderLayout.CENTER);

		totalStudentPanel = new JPanel();
		totalStudentPanel.setBounds(25, 43, 224, 57);
		componentsPanel.add(totalStudentPanel);

		totalStudentsLabel = new JLabel("Total Students");
		totalStudentsLabel.setFont(new Font("Dialog", Font.BOLD, 25));
		totalStudentPanel.add(totalStudentsLabel);

		totalEmployeePanel = new JPanel();
		totalEmployeePanel.setBounds(470, 43, 235, 57);
		componentsPanel.add(totalEmployeePanel);

		totalEmployeesLabel = new JLabel("Total Employees");
		totalEmployeesLabel.setFont(new Font("Dialog", Font.BOLD, 25));
		totalEmployeePanel.add(totalEmployeesLabel);

		students = new JLabel("0");
		students.setFont(new Font("Dialog", Font.PLAIN, 40));
		students.setBounds(113, 112, 91, 63);
		componentsPanel.add(students);

		employees = new JLabel("0");
		employees.setFont(new Font("Dialog", Font.PLAIN, 40));
		employees.setBounds(558, 106, 91, 74);
		componentsPanel.add(employees);

		maleStudentPanel = new JPanel();
		maleStudentPanel.setBounds(25, 198, 205, 48);
		componentsPanel.add(maleStudentPanel);

		maleStudentslabel = new JLabel("Male Students");
		maleStudentslabel.setFont(new Font("Dialog", Font.BOLD, 25));
		maleStudentPanel.add(maleStudentslabel);

		femaleStudentPanel = new JPanel();
		femaleStudentPanel.setBounds(462, 192, 243, 48);
		componentsPanel.add(femaleStudentPanel);

		femaleStudentsLabel = new JLabel("Female Students");
		femaleStudentsLabel.setFont(new Font("Dialog", Font.BOLD, 25));
		femaleStudentPanel.add(femaleStudentsLabel);

		maleStudents = new JLabel("0");
		maleStudents.setFont(new Font("Dialog", Font.PLAIN, 40));
		maleStudents.setBounds(113, 258, 91, 63);
		componentsPanel.add(maleStudents);

		femaleStudents = new JLabel("0");
		femaleStudents.setFont(new Font("Dialog", Font.PLAIN, 40));
		femaleStudents.setBounds(558, 252, 91, 63);
		componentsPanel.add(femaleStudents);

	}

	public void setColor() {
		JPanel[] panels = { totalEmployeePanel, totalStudentPanel, maleStudentPanel, femaleStudentPanel };
		for (JPanel jPanel : panels) {
			jPanel.setBackground(new Color(BASIC_RED, BASIC_GREEN, BASIC_BLUE));
			jPanel.setBorder(null);
		}

	}
}
