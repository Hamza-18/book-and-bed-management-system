package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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

	private ArrayList<Student> paidStudentsList;
	private ArrayList<Student> unPaidStudentsList;
	private LocalDate date;
	private Controller controller;
	private JTextArea unPaidStudentsArea;
	private JTextArea paidStudentsArea;

	public NotificationsPanel() {

		setBackground(new Color(255, 255, 255));
		setComponents();
		controller = new Controller();

		paidStudentsList = new ArrayList<>();
		unPaidStudentsList = new ArrayList<>();
		Refresh();
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
		componentsPanel.setBackground(Color.white);
		add(componentsPanel, BorderLayout.CENTER);
		GridBagLayout gbl_componentsPanel = new GridBagLayout();
		gbl_componentsPanel.columnWidths = new int[] { 251, 163, 276, 0 };
		gbl_componentsPanel.rowHeights = new int[] { 43, 64, 298, 0 };
		gbl_componentsPanel.columnWeights = new double[] { 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_componentsPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		componentsPanel.setLayout(gbl_componentsPanel);

		lblPaidFee = new JLabel("Paid Fee");
		lblPaidFee.setFont(new Font("Dialog", Font.BOLD, 30));
		GridBagConstraints gbc_lblPaidFee = new GridBagConstraints();
		gbc_lblPaidFee.anchor = GridBagConstraints.NORTH;
		gbc_lblPaidFee.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPaidFee.insets = new Insets(0, 0, 5, 5);
		gbc_lblPaidFee.gridx = 0;
		gbc_lblPaidFee.gridy = 1;
		componentsPanel.add(lblPaidFee, gbc_lblPaidFee);

		lblUnpaidFee = new JLabel("Unpaid Fee");
		lblUnpaidFee.setFont(new Font("Dialog", Font.BOLD, 30));
		GridBagConstraints gbc_lblUnpaidFee = new GridBagConstraints();
		gbc_lblUnpaidFee.anchor = GridBagConstraints.NORTH;
		gbc_lblUnpaidFee.insets = new Insets(5, 5, 0, 0);
		gbc_lblUnpaidFee.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblUnpaidFee.gridheight = 2;
		gbc_lblUnpaidFee.gridx = 2;
		gbc_lblUnpaidFee.gridy = 1;
		componentsPanel.add(lblUnpaidFee, gbc_lblUnpaidFee);

		paidStudentsArea = new JTextArea();
		paidStudentsArea.setFont(new Font("Dialog", Font.PLAIN, 15));
		paidStudentsArea.setEditable(false);
		GridBagConstraints gbc_paidStudentsArea = new GridBagConstraints();
		gbc_paidStudentsArea.fill = GridBagConstraints.BOTH;
		gbc_paidStudentsArea.insets = new Insets(5, 5, 0, 5);
		gbc_paidStudentsArea.gridx = 0;
		gbc_paidStudentsArea.gridy = 2;
		componentsPanel.add(paidStudentsArea, gbc_paidStudentsArea);

		unPaidStudentsArea = new JTextArea();
		unPaidStudentsArea.setFont(new Font("Dialog", Font.PLAIN, 15));
		unPaidStudentsArea.setEditable(false);
		GridBagConstraints gbc_unPaidStudentsArea = new GridBagConstraints();
		gbc_unPaidStudentsArea.fill = GridBagConstraints.BOTH;
		gbc_unPaidStudentsArea.gridx = 2;
		gbc_unPaidStudentsArea.gridy = 2;
		componentsPanel.add(unPaidStudentsArea, gbc_unPaidStudentsArea);
	}

	public void Refresh() {
		date = java.time.LocalDate.now();
		try {
			paidStudentsList = controller.getPaidStudents(date.getMonthValue() + "");
			String output = "";
			for (Student student : paidStudentsList) {
				String value = String.format("Resident %s has paid the fee of this month", student.getName());
				output += value + "\n";
			}
			paidStudentsArea.append(output);
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

			unPaidStudentsArea.append(output);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
