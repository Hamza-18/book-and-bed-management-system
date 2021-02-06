package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;

public class UpdateStudentDialog extends JDialog {

	private SearchPanel searchPanel;

	public UpdateStudentDialog() {
		setMinimumSize(new Dimension(800, 800));
		setLayout(new BorderLayout());

		searchPanel = new SearchPanel();
		add(searchPanel, BorderLayout.NORTH);
	}

}
