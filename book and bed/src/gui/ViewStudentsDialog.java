package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Controller;
import tables.StudentsTable;

public class ViewStudentsDialog extends JDialog {
	private StudentsTable studentsTable;
	private Controller controller;
	private JPanel searchPanel;
	private JLabel searchLabel;
	private JComboBox searchBox;
	private JButton searchBtn;

	public ViewStudentsDialog(JFrame parent) {
		super(parent, "Students", true);

		setSize(new Dimension(1366, 800));
		setLayout(new BorderLayout());

		studentsTable = new StudentsTable();
		controller = new Controller();
		add(studentsTable, BorderLayout.CENTER);

		searchPanel = new JPanel();
		searchPanel.setBackground(Color.white);
		searchPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		add(searchPanel, BorderLayout.NORTH);

		searchLabel = new JLabel("Students");
		searchPanel.add(searchLabel);

		searchBox = new JComboBox();
		DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
		comboModel.addElement("All");
		comboModel.addElement("Current");
		searchBox.setModel(comboModel);
		searchPanel.add(searchBox);

		searchBtn = new JButton("SEARCH");
		searchPanel.add(searchBtn);

		searchBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String query = null;
				if (searchBox.getSelectedIndex() == 0) {
					setData(query);
				} else {
					query = " where Resident = 'Yes'";
					setData(query);
				}
			}
		});

	}

	public void setData() {
		studentsTable.setData(controller.getStudents(null));
		studentsTable.refresh();
		setVisible(true);
	}

	public void setData(String query) {
		studentsTable.setData(controller.getStudents(query));
		studentsTable.refresh();
	}

}
