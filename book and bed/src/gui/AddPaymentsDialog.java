package gui;

import java.awt.BorderLayout;
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

public class AddPaymentsDialog extends JDialog {
	private AddPaymentsPanel addPaymentsPanel;
	private JPanel buttonPanel;
	private JButton submitButton;
	private JButton cancelButton;
	private Controller controller;
	private Preferences dataPreferences;

	public AddPaymentsDialog() {
		setLayout(new BorderLayout());
		setSize(new Dimension(550, 320));
		setLocationRelativeTo(null);

		controller = new Controller();

		addPaymentsPanel = new AddPaymentsPanel();
		add(addPaymentsPanel, BorderLayout.CENTER);

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
				addPaymentsPanel.Reset();
				setVisible(false);
			}
		});

		submitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				boolean flag = true;
				Employee employee = addPaymentsPanel.getPayment();
				dataPreferences = Preferences.userRoot().node("PaymentsCount");
				dataPreferences.putInt("empCount", Employee.getPaymentCount());
				try {
					controller.addPayment(employee);
				} catch (Exception e) {

					JOptionPane.showMessageDialog(null, "Payment not added");
				}
				if (flag)
					JOptionPane.showMessageDialog(null, "Payment has been added");

			}
		});

	}
}
