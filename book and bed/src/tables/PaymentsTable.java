package tables;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.Employee;

public class PaymentsTable extends JPanel {
	private JTable paymentsTable;
	private PaymentsTableModel paymentsTableModel;

	public PaymentsTable() {
		paymentsTableModel = new PaymentsTableModel();
		paymentsTable = new JTable(paymentsTableModel);

		setLayout(new BorderLayout());
		add(new JScrollPane(paymentsTable), BorderLayout.CENTER);
	}

	public void setData(ArrayList<Employee> db) {
		paymentsTableModel.setList(db);
	}

	public void refresh() {

		paymentsTableModel.fireTableDataChanged();
	}

}
