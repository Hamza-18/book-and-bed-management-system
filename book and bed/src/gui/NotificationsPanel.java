package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import model.Controller;
import model.Student;

public class NotificationsPanel extends JPanel {
	private JPanel titlePanel;
	private JPanel componentsPanel;
	private JLabel lblPaidFee;
	private JLabel lblUnpaidFee;

	private JTextArea paidStudents;
	private JTextArea unPaidStudents;

	private ArrayList<Student> paidStudentsList;
	private ArrayList<Student> unPaidStudentsList;
	private LocalDate date;
	private Controller controller;

	public NotificationsPanel() {

		setBackground(new Color(255, 255, 255));
		setComponents();
		controller = new Controller();

		paidStudentsList = new ArrayList<>();
		unPaidStudentsList = new ArrayList<>();

		date = java.time.LocalDate.now();
		try {
			paidStudentsList = controller.getPaidStudents(date.getMonthValue() + "");
			String output = "";
			for (Student student : paidStudentsList) {
				String value = String.format("Resident %s has paid the fee of this month", student.getName());
				output += value + "\n";
			}
			paidStudents.append(output);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			unPaidStudentsList = controller.getUnPaidStudents(date.getMonthValue() + "");
			String output = "";
			for (Student student : unPaidStudentsList) {
				String value = String.format("Resident %s needs to pay fee on %s", student.getName(),
						student.getRentDate());
				output += value + "\n";
			}
			unPaidStudents.append(output);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setComponents() {
		setLayout(new BorderLayout());
		titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		titlePanel.setBackground(new Color(227, 187, 58));

		add(titlePanel, BorderLayout.NORTH);

		JLabel lblNotifications = new JLabel("Notifications");
		lblNotifications.setFont(new Font("Dialog", Font.BOLD, 35));
		titlePanel.add(lblNotifications);

		componentsPanel = new JPanel();
		componentsPanel.setLayout(null);
		componentsPanel.setBackground(Color.white);
		add(componentsPanel, BorderLayout.CENTER);

		lblPaidFee = new JLabel("Paid Fee");
		lblPaidFee.setFont(new Font("Dialog", Font.BOLD, 30));
		lblPaidFee.setBounds(12, 43, 251, 64);
		componentsPanel.add(lblPaidFee);

		lblUnpaidFee = new JLabel("Unpaid Fee");
		lblUnpaidFee.setFont(new Font("Dialog", Font.BOLD, 30));
		lblUnpaidFee.setBounds(439, 43, 263, 77);
		componentsPanel.add(lblUnpaidFee);

		paidStudents = new JTextArea();
		paidStudents.setText("hamza");
		paidStudents.setBounds(254, 119, -230, 276);
		componentsPanel.add(paidStudents);

		unPaidStudents = new JTextArea();
		unPaidStudents.setBounds(697, 119, -276, 276);
		componentsPanel.add(unPaidStudents);
	}
}
