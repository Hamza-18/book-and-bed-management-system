package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;

import model.Controller;
import tables.KitchenTable;

public class ViewMonthlyExpenseDialog extends JDialog {
	private KitchenTable kitchenTable;
	private Controller controller;

	public ViewMonthlyExpenseDialog(JFrame parent, String table) {
		super(parent, table + " Kitchen Expense", true);
		setSize(new Dimension(800, 800));
		setLayout(new BorderLayout());
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);

		kitchenTable = new KitchenTable(table);
		controller = new Controller();

		add(kitchenTable, BorderLayout.CENTER);

	}

	public void setMonthlyData() {
		kitchenTable.setData(controller.getMonthlyExpense());
		kitchenTable.refresh();
		setVisible(true);

	}

	public void setDailyData() {
		kitchenTable.setData(controller.getDailyExpense());
		kitchenTable.refresh();
		setVisible(true);

	}

}
