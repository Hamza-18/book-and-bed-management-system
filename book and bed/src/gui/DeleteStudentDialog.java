package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JDialog;

public class DeleteStudentDialog extends JDialog {
	private SearchPanel searchPanel;

	public DeleteStudentDialog() {
		setBackground(Color.white);
		setLayout(new BorderLayout());

		searchPanel = new SearchPanel();
		add(searchPanel, BorderLayout.NORTH);
	}

}
