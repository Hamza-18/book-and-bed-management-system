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
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Controller;
import model.Student;
import tables.StudentsTable;

public class UpdateStudentDialog extends JDialog {
	private SearchPanel searchPanel;
	private Controller controller;
	private StudentsTable studentsTable;
	private JPanel updatePanel;
	private JLabel id;
	private JTextField studentId;
	private JButton updateBtn;
	private AddStudentDialog addStudentDialog;

	public UpdateStudentDialog() {
		getContentPane().setLayout(new BorderLayout());
		setSize(new Dimension(700, 700));
		setLocationRelativeTo(null);

		controller = new Controller();

		searchPanel = new SearchPanel();
		add(searchPanel, BorderLayout.NORTH);

		studentsTable = new StudentsTable();
		add(studentsTable, BorderLayout.CENTER);

		updatePanel = new JPanel();
		updatePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		updatePanel.setBackground(new Color(255, 255, 255));

		id = new JLabel("CNIC");
		updatePanel.add(id);

		studentId = new JTextField(20);
		updatePanel.add(studentId);

		updateBtn = new JButton("UPDATE");
		updatePanel.add(updateBtn);
		add(updatePanel, BorderLayout.SOUTH);

		searchPanel.setInterface(new SearchStudentInterface() {

			@Override
			public void getQuery(String query) {
				// TODO Auto-generated method stub
				studentsTable.setData(controller.getStudents(query));
				studentsTable.refresh();
			}
		});

		updateBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String query = " where StudentId = " + "'" + Long.parseLong(studentId.getText()) + "'";
				Student student = controller.getStudents(query).get(0);
				addStudentDialog = new AddStudentDialog(student);
				addStudentDialog.setVisible(true);
			}
		});
	}

}
