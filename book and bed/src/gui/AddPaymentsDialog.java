package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class AddPaymentsDialog extends JDialog {
	private AddPaymentsPanel addPaymentsPanel;
	private JPanel buttonPanel;
	private JButton submitButton;
	private JButton cancelButton;

	public AddPaymentsDialog() {
		setLayout(new BorderLayout());
		setSize(new Dimension(550, 320));

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

			}
		});

	}

}
