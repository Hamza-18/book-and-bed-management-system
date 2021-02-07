package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JDialog;

public class UpdateEmployeeDialog extends JDialog {
	private SearchEmployeePanel searchEmployeePanel;

	public UpdateEmployeeDialog() {
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);
		setSize(new Dimension(700, 700));

		searchEmployeePanel = new SearchEmployeePanel();
		add(searchEmployeePanel, BorderLayout.NORTH);

	}
}
