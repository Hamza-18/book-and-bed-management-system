package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;

import model.Controller;
import tables.PaymentsTable;

public class ViewPaymentsDialog extends JDialog {
	private Controller controller;
	private PaymentsTable paymentsTable;

	public ViewPaymentsDialog(JFrame parent) {
		super(parent, "EmployeePayments", true);
		setSize(new Dimension(800, 800));
		setLayout(new BorderLayout());
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);

		paymentsTable = new PaymentsTable();
		controller = new Controller();

		add(paymentsTable, BorderLayout.CENTER);

	}

	public void setData() {
		paymentsTable.setData(controller.getPayments(null));
		paymentsTable.refresh();
		setVisible(true);

	}

}
