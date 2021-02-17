package tables;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.Kitchen;

public class KitchenTable extends JPanel {
	private JTable kitchenTable;
	private KitchenTableModel kitchenTableModel;

	public KitchenTable(String table) {
		kitchenTableModel = new KitchenTableModel(table);
		kitchenTable = new JTable(kitchenTableModel);

		setLayout(new BorderLayout());
		add(new JScrollPane(kitchenTable), BorderLayout.CENTER);
	}

	public void setData(ArrayList<Kitchen> db) {
		kitchenTableModel.setList(db);
	}

	public void refresh() {

		kitchenTableModel.fireTableDataChanged();
	}
}
