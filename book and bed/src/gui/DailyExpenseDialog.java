package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class DailyExpenseDialog extends JDialog {
	private DailyExpense dailyExpense;
	private JPanel buttonPanel;
	private JButton submitButton;
	private JButton cancelButton;

	public DailyExpenseDialog() {
		setMinimumSize(new Dimension(600, 300));
		setSize(600, 300);
		getContentPane().setLayout(new BorderLayout());

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

			}
		});
	}
}