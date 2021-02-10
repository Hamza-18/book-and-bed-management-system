package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class AddStudentDialog extends JDialog {
	private AddStudentPanel addStudentPanel;
	private JPanel buttonPanel;
	private JButton submitButton;
	private JButton cancelButton;

	public AddStudentDialog() {
		setLayout(new BorderLayout());
		setMinimumSize(new Dimension(730, 600));
		addStudentPanel = new AddStudentPanel();
		add(addStudentPanel, BorderLayout.CENTER);

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
				addStudentPanel.getData();

			}

		});

	}
}
