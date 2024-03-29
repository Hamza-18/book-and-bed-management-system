package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.sql.Date;
import java.util.Properties;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import model.Kitchen;

public class DailyExpense extends JPanel {
	private JTextField dailyExpense;

	private ButtonGroup gender;
	private JDatePickerImpl date;

	public DailyExpense() {
		setComponents();
	}

	public void setComponents() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 78, 170, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 64, 38, 28, 93, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		setBackground(Color.WHITE);
		setVisible(true);

		JLabel textField = new JLabel("Expense:");
		textField.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.anchor = GridBagConstraints.EAST;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		add(textField, gbc_textField);

		dailyExpense = new JTextField();
		GridBagConstraints gbc_dailyExpense = new GridBagConstraints();
		gbc_dailyExpense.insets = new Insets(0, 0, 5, 5);
		gbc_dailyExpense.anchor = GridBagConstraints.WEST;
		gbc_dailyExpense.gridx = 1;
		gbc_dailyExpense.gridy = 0;
		add(dailyExpense, gbc_dailyExpense);
		dailyExpense.setColumns(10);

		JLabel lblCnic = new JLabel("Date:");
		lblCnic.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblCnic = new GridBagConstraints();
		gbc_lblCnic.insets = new Insets(0, 0, 5, 5);
		gbc_lblCnic.anchor = GridBagConstraints.EAST;
		gbc_lblCnic.gridx = 2;
		gbc_lblCnic.gridy = 0;
		add(lblCnic, gbc_lblCnic);
		gender = new ButtonGroup();

		DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
		comboModel.addElement("Permanent");
		comboModel.addElement("Temporary");

		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");

		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		date = new JDatePickerImpl(datePanel, new DateLabelFormatter());

		GridBagConstraints gbc_paymentDate = new GridBagConstraints();
		gbc_paymentDate.anchor = GridBagConstraints.WEST;
		gbc_paymentDate.insets = new Insets(0, 0, 0, 5);
		gbc_paymentDate.gridx = 3;
		gbc_paymentDate.gridy = 0;
		add(date, gbc_paymentDate);

	}

	public Kitchen getData() {

		java.sql.Date monthDate = null;
		String month = (date.getModel().getMonth() + 1) + "";
		String day = date.getModel().getDay() + "";
		String year = date.getModel().getYear() + "";
		if (month.length() == 1) {
			month = "0" + month;
		}
		if (day.length() == 1) {
			day = "0" + day;
		}

		monthDate = Date.valueOf(year + "-" + month + "-" + day);

		String expense = dailyExpense.getText();

		return (new Kitchen(expense, monthDate));
	}

	public void Reset() {
		dailyExpense.setText("");
	}

}
