package tables;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import model.Kitchen;

public class KitchenTableModel extends AbstractTableModel {
	private ArrayList<Kitchen> kitchenArray;
	private String[] columnNames;
	private String table;

	public KitchenTableModel(String table) {
		kitchenArray = new ArrayList<>();
		if (table.equals("Monthly")) {
			columnNames = new String[3];
			columnNames[0] = "Month";
			columnNames[1] = "Date";
			columnNames[2] = "Expense";
			this.table = "Monthly";
		}

		else {
			columnNames = new String[2];

			columnNames[0] = "Date";
			columnNames[1] = "Expense";
			this.table = "Daily";
		}
	}

	public String getColumnName(int col) {

		return columnNames[col];
	}

	public void setList(ArrayList<Kitchen> list) {
		this.kitchenArray = list;
	}

	public ArrayList<Kitchen> getKitchenList() {
		return kitchenArray;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return kitchenArray.size();
	}

	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		Kitchen kitchen = kitchenArray.get(row);
		// for selected row return each column value.
		if (table.equals("Monthly")) {
			switch (col) {
			case 0:
				return kitchen.getMonth();
			case 1:
				return kitchen.getDate();
			case 2:
				return kitchen.getExpense();
			}
		} else {
			switch (col) {
			case 0:
				return kitchen.getDate();
			case 1:
				return kitchen.getExpense();
			}
		}
		return null;
	}

}
