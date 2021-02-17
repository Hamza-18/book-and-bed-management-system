package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;

import model.Controller;
import tables.StudentsTable;

public class ViewStudentsDialog extends JDialog {
	private StudentsTable studentsTable;
	private Controller controller;

	public ViewStudentsDialog(JFrame parent) {
		super(parent, "Students", true);

		setSize(new Dimension(800, 800));
		setLayout(new BorderLayout());

		studentsTable = new StudentsTable();
		controller = new Controller();
		add(studentsTable, BorderLayout.CENTER);
	}

	public void setData() {
		studentsTable.setData(controller.getStudents(null));
		setVisible(true);
	}

}
