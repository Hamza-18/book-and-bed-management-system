package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JDialog;

public class DeleteStudentDialog extends JDialog {
	private SearchPanel searchPanel;

	public DeleteStudentDialog() {
		setBackground(Color.white);
		setLayout(new BorderLayout());
		setMinimumSize(new Dimension(700, 700));

		searchPanel = new SearchPanel();
		add(searchPanel, BorderLayout.NORTH);

	}

}
