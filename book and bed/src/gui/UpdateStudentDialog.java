package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;

public class UpdateStudentDialog extends JDialog {

	private SearchPanel searchPanel;

	public UpdateStudentDialog() {
		getContentPane().setLayout(new BorderLayout());
		setSize(new Dimension(700, 700));

		searchPanel = new SearchPanel();
		getContentPane().add(searchPanel, BorderLayout.NORTH);
	}

}
