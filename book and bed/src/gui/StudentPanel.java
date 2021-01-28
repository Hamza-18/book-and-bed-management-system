package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StudentPanel extends JPanel {
	private JPanel titlePanel;
	private JLabel titleLabel;
	private JPanel componentsPanel;
	private JPanel viewStudentPanel;
	private JPanel addStudentPanel;
	private JPanel updateStudentPanel;
	private JPanel deleteStudentPanel;
	private Image icon;
	private Image deleteStudentIcon;
	private Image updateStudentIcon;
	private Image viewStudentIcon;
	private SidePanelInterface sidePanelInterface;

	public StudentPanel() {
		setLayout(new BorderLayout());
		setBackground(new Color(255, 255, 255));
		setComponents();

	}

	public void setComponents() {
		titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		add(titlePanel, BorderLayout.NORTH);
		titleLabel = new JLabel("Students");
		titleLabel.setFont(new Font("Dialog", Font.BOLD, 35));
		titlePanel.add(titleLabel);

		componentsPanel = new JPanel();
		componentsPanel.setLayout(null);
		componentsPanel.setBackground(new Color(255, 255, 255));
		add(componentsPanel, BorderLayout.CENTER);

		viewStudentPanel = new JPanel();
		viewStudentPanel.setBounds(12, 55, 301, 65);
		componentsPanel.add(viewStudentPanel);

		JLabel lblViewStudents = new JLabel("View Students");
		lblViewStudents.setFont(new Font("Dialog", Font.BOLD, 25));
		viewStudentPanel.add(lblViewStudents);

		addStudentPanel = new JPanel();
		addStudentPanel.setBounds(334, 55, 296, 65);
		componentsPanel.add(addStudentPanel);

		JLabel lblAddStudents = new JLabel("Add Student");
		lblAddStudents.setFont(new Font("Dialog", Font.BOLD, 25));
		addStudentPanel.add(lblAddStudents);

		updateStudentPanel = new JPanel();
		updateStudentPanel.setBounds(12, 160, 301, 65);
		componentsPanel.add(updateStudentPanel);

		JLabel lblUpdateStudents = new JLabel("Update Student");
		lblUpdateStudents.setFont(new Font("Dialog", Font.BOLD, 25));
		updateStudentPanel.add(lblUpdateStudents);

		deleteStudentPanel = new JPanel();
		deleteStudentPanel.setBounds(334, 160, 296, 65);
		componentsPanel.add(deleteStudentPanel);

		JLabel lblDeleteStudents = new JLabel("Delete Student");
		lblDeleteStudents.setFont(new Font("Dialog", Font.BOLD, 25));
		deleteStudentPanel.add(lblDeleteStudents);

		icon = new ImageIcon(StudentPanel.class.getResource("/res/adduser.png")).getImage().getScaledInstance(50, 50,
				Image.SCALE_SMOOTH);
		lblAddStudents.setIcon(new ImageIcon(icon));

		deleteStudentIcon = new ImageIcon(StudentPanel.class.getResource("/res/deleteuser.png")).getImage()
				.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		lblDeleteStudents.setIcon(new ImageIcon(deleteStudentIcon));

		updateStudentIcon = new ImageIcon(StudentPanel.class.getResource("/res/update.png")).getImage()
				.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		lblUpdateStudents.setIcon(new ImageIcon(updateStudentIcon));

		viewStudentIcon = new ImageIcon(StudentPanel.class.getResource("/res/viewdata.jpeg")).getImage()
				.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		lblViewStudents.setIcon(new ImageIcon(viewStudentIcon));

	}
}
