package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.prefs.Preferences;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.Controller;
import model.Employee;

public class AddEmployeeDialog extends JDialog {
	private AddEmployeePanel addEmployeePanel;
	private JPanel buttonPanel;
	private JButton submitButton;
	private JButton cancelButton;
	private Controller controller;
	private Preferences dataPreferences;

	public AddEmployeeDialog() {
		setBackground(Color.WHITE);
		setSize(new Dimension(550, 333));

		controller = new Controller();

		addEmployeePanel = new AddEmployeePanel();
		getContentPane().add(addEmployeePanel, BorderLayout.CENTER);

		buttonPanel = new JPanel();
		submitButton = new JButton("Submit");
		cancelButton = new JButton("Cancel");
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.add(submitButton);
		buttonPanel.add(cancelButton);

		Dimension dimension = submitButton.getPreferredSize();
		cancelButton.setPreferredSize(dimension);

		getContentPane().add(buttonPanel, BorderLayout.SOUTH);

		cancelButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				addEmployeePanel.Reset();
				setVisible(false);
			}
		});

		submitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				boolean flag = true;
				Employee employee = addEmployeePanel.getData();

				try {
					controller.addEmployee(employee);
				} catch (Exception SQLIntegrityConstraintViolationException) {
					// TODO Auto-generated catch block
					flag = false;
					JOptionPane.showMessageDialog(null,
							"Employee with same ID already exists, Please choose a different ID");
				}
				if (flag)
					JOptionPane.showMessageDialog(null, "Employee has been added");

			}
		});

	}
}