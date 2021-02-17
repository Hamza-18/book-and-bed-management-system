package tables;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.Student;

public class StudentsTable extends JTable {
	private JTable studentsTable;
	private StudentsTableModel studentsTableModel;

	public StudentsTable() {
		setLayout(new BorderLayout());

		studentsTableModel = new StudentsTableModel();
		studentsTable = new JTable(studentsTableModel);
		add(new JScrollPane(studentsTable), BorderLayout.CENTER);
	}

	public void setData(ArrayList<Student> db) {
		studentsTableModel.setList(db);
	}

	public void refresh() {

		studentsTableModel.fireTableDataChanged();
	}
}
