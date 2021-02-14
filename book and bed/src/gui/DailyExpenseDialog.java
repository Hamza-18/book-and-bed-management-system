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

public class DailyExpenseDialog extends JDialog {
	private DailyExpense dailyExpense;
	private JPanel buttonPanel;
	private JButton submitButton;
	private JButton cancelButton;
	private Controller controller;

	public DailyExpenseDialog() {
		setMinimumSize(new Dimension(600, 300));
		setSize(600, 300);
		getContentPane().setLayout(new BorderLayout());

		controller = new Controller();

		dailyExpense = new DailyExpense();
		getContentPane().add(dailyExpense, BorderLayout.NORTH);

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
				setVisible(false);
			}
		});

		submitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				boolean flag = true;
				try {

					controller.addDailyExpense(dailyExpense.getData());
				} catch (Exception SQLIntegrityConstraintViolationException) {
					// TODO Auto-generated catch block
					SQLIntegrityConstraintViolationException.printStackTrace();
					flag = false;
					JOptionPane.showMessageDialog(null, "Expense could not be added");
				}
				if (flag)
					JOptionPane.showMessageDialog(null, "Expense has been added");

			}
		});
	}
}
