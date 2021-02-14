package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.Controller;
import model.Student;

public class AddStudentDialog extends JDialog {
	private AddStudentPanel addStudentPanel;
	private JPanel buttonPanel;
	private JButton submitButton;
	private JButton cancelButton;
	private Controller controller;

	public AddStudentDialog() {
		setLayout(new BorderLayout());
		setMinimumSize(new Dimension(730, 600));
		addStudentPanel = new AddStudentPanel();
		add(addStudentPanel, BorderLayout.CENTER);

		controller = new Controller();

		buttonPanel = new JPanel();
		submitButton = new JButton("Submit");
		cancelButton = new JButton("Cancel");
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.add(submitButton);
		buttonPanel.add(cancelButton);

		Dimension dimension = submitButton.getPreferredSize();
		cancelButton.setPreferredSize(dimension);

		add(buttonPanel, BorderLayout.SOUTH);

		cancelButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				addStudentPanel.Reset();
				setVisible(false);
			}
		});

		submitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean flag = true;
				Student student = addStudentPanel.getData();
				try {
					controller.addStudent(student);
				} catch (Exception SQLIntegrityConstraintViolationException) {
					// TODO Auto-generated catch block
					SQLIntegrityConstraintViolationException.printStackTrace();
					flag = false;
					JOptionPane.showMessageDialog(null, "Student not added");
				}
				if (flag)
					JOptionPane.showMessageDialog(null, "Student has been added");

			}

		});

	}
}
