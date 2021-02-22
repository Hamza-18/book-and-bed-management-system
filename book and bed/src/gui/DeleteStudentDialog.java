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
import tables.StudentsTable;

public class DeleteStudentDialog extends JDialog {
	private SearchPanel searchPanel;
	private StudentsTable studentsTable;
	private Controller controller;
	private JPanel deletePanel;
	private JTextField studentId;
	private JLabel idJLabel;
	private JButton deleteBtn;

	public DeleteStudentDialog() {
		setBackground(Color.white);
		setLayout(new BorderLayout());
		setMinimumSize(new Dimension(700, 700));
		setLocationRelativeTo(null);

		searchPanel = new SearchPanel();
		add(searchPanel, BorderLayout.NORTH);

		studentsTable = new StudentsTable();
		controller = new Controller();
		add(studentsTable, BorderLayout.CENTER);

		deletePanel = new JPanel();
		deletePanel.setBackground(new Color(255, 255, 255));
		deletePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		add(deletePanel, BorderLayout.SOUTH);

		idJLabel = new JLabel("CNIC");
		deletePanel.add(idJLabel);

		studentId = new JTextField(20);
		deletePanel.add(studentId);

		deleteBtn = new JButton("DELETE");
		deletePanel.add(deleteBtn);

		searchPanel.setInterface(new SearchStudentInterface() {

			@Override
			public void getQuery(String query) {
				// TODO Auto-generated method stub
				studentsTable.setData(controller.getStudents(query));
			}
		});

		deleteBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (!studentId.getText().equals("")) {
					String query = "delete from Students where StudentId = " + "'" + Long.parseLong(studentId.getText())
							+ "'";
					try {
						controller.deleteStudent(query);
						JOptionPane.showMessageDialog(null, "Student has been deleted");

					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(null, "Please enter Student Id");
				}
			}
		});
	}

}
