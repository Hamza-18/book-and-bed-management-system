package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;

public class DeleteEmployeeDialog extends JDialog {
	private SearchEmployeePanel searchEmployeePanel;

	public DeleteEmployeeDialog() {
		setLayout(new BorderLayout());
		setSize(new Dimension(700, 700));

		searchEmployeePanel = new SearchEmployeePanel();
		add(searchEmployeePanel, BorderLayout.NORTH);
	}
}
