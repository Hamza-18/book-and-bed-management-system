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
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import model.Employee;

public class AddPaymentsPanel extends JPanel {

	private JTextField employeeName;
	private JTextField employeeId;
	private JTextField number;
	private JTextField employeeWork;

	private ButtonGroup gender;
	private JTextField employeePayment;
	private JDatePickerImpl paymentDate;

	public AddPaymentsPanel() {
		setComponents();
	}

	public void setComponents() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 78, 170, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 64, 38, 28, 93, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		setBackground(Color.white);

		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.anchor = GridBagConstraints.EAST;
		gbc_lblName.gridx = 0;
		gbc_lblName.gridy = 0;
		add(lblName, gbc_lblName);

		employeeName = new JTextField();
		GridBagConstraints gbc_employeeName = new GridBagConstraints();
		gbc_employeeName.insets = new Insets(0, 0, 5, 5);
		gbc_employeeName.anchor = GridBagConstraints.WEST;
		gbc_employeeName.gridx = 1;
		gbc_employeeName.gridy = 0;
		add(employeeName, gbc_employeeName);
		employeeName.setColumns(10);

		JLabel lblCnic = new JLabel("CNIC:");
		lblCnic.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblCnic = new GridBagConstraints();
		gbc_lblCnic.insets = new Insets(0, 0, 5, 5);
		gbc_lblCnic.anchor = GridBagConstraints.EAST;
		gbc_lblCnic.gridx = 2;
		gbc_lblCnic.gridy = 0;
		add(lblCnic, gbc_lblCnic);

		employeeId = new JTextField(10);
		employeeId.setColumns(10);
		GridBagConstraints gbc_employeeId = new GridBagConstraints();
		gbc_employeeId.insets = new Insets(0, 0, 5, 0);
		gbc_employeeId.anchor = GridBagConstraints.WEST;
		gbc_employeeId.gridx = 3;
		gbc_employeeId.gridy = 0;
		add(employeeId, gbc_employeeId);

		JLabel lblRoom = new JLabel("Number:");
		lblRoom.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblRoom = new GridBagConstraints();
		gbc_lblRoom.anchor = GridBagConstraints.EAST;
		gbc_lblRoom.insets = new Insets(0, 5, 5, 5);
		gbc_lblRoom.gridx = 0;
		gbc_lblRoom.gridy = 1;
		add(lblRoom, gbc_lblRoom);

		number = new JTextField();
		number.setColumns(10);
		GridBagConstraints gbc_number = new GridBagConstraints();
		gbc_number.anchor = GridBagConstraints.WEST;
		gbc_number.insets = new Insets(0, 0, 5, 5);
		gbc_number.gridx = 1;
		gbc_number.gridy = 1;
		add(number, gbc_number);

		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblGender = new GridBagConstraints();
		gbc_lblGender.anchor = GridBagConstraints.EAST;
		gbc_lblGender.insets = new Insets(0, 10, 5, 5);
		gbc_lblGender.gridx = 2;
		gbc_lblGender.gridy = 1;
		add(lblGender, gbc_lblGender);

		JRadioButton maleRadio = new JRadioButton("Male");
		GridBagConstraints gbc_maleRadio = new GridBagConstraints();
		gbc_maleRadio.anchor = GridBagConstraints.WEST;
		gbc_maleRadio.insets = new Insets(0, 0, 5, 0);
		gbc_maleRadio.gridx = 3;
		gbc_maleRadio.gridy = 1;
		add(maleRadio, gbc_maleRadio);

		JRadioButton femaleRadio = new JRadioButton("Female");
		GridBagConstraints gbc_femaleRadio = new GridBagConstraints();
		gbc_femaleRadio.insets = new Insets(0, 0, 5, 0);
		gbc_femaleRadio.anchor = GridBagConstraints.WEST;
		gbc_femaleRadio.gridx = 3;
		gbc_femaleRadio.gridy = 2;
		add(femaleRadio, gbc_femaleRadio);
		maleRadio.setActionCommand("Male");
		femaleRadio.setActionCommand("Female");
		maleRadio.setPreferredSize(femaleRadio.getPreferredSize());
		maleRadio.setSelected(true);
		gender = new ButtonGroup();
		gender.add(maleRadio);
		gender.add(femaleRadio);

		DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
		comboModel.addElement("Permanent");
		comboModel.addElement("Temporary");

		JLabel lblDuration_1_1 = new JLabel("Payment:");
		lblDuration_1_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDuration_1_1 = new GridBagConstraints();
		gbc_lblDuration_1_1.anchor = GridBagConstraints.EAST;
		gbc_lblDuration_1_1.insets = new Insets(0, 10, 5, 5);
		gbc_lblDuration_1_1.gridx = 0;
		gbc_lblDuration_1_1.gridy = 3;
		add(lblDuration_1_1, gbc_lblDuration_1_1);

		employeePayment = new JTextField("");
		employeePayment.setColumns(10);
		GridBagConstraints gbc_EmployeePayment = new GridBagConstraints();
		gbc_EmployeePayment.anchor = GridBagConstraints.WEST;
		gbc_EmployeePayment.insets = new Insets(0, 0, 5, 5);
		gbc_EmployeePayment.gridx = 1;
		gbc_EmployeePayment.gridy = 3;
		add(employeePayment, gbc_EmployeePayment);

		JLabel lblWork = new JLabel("Designation:");
		lblWork.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblWork = new GridBagConstraints();
		gbc_lblWork.anchor = GridBagConstraints.EAST;
		gbc_lblWork.insets = new Insets(0, 0, 5, 5);
		gbc_lblWork.gridx = 2;
		gbc_lblWork.gridy = 3;
		add(lblWork, gbc_lblWork);

		employeeWork = new JTextField();
		employeeWork.setColumns(10);
		GridBagConstraints gbc_employeeWork = new GridBagConstraints();
		gbc_employeeWork.insets = new Insets(0, 0, 5, 0);
		gbc_employeeWork.anchor = GridBagConstraints.WEST;
		gbc_employeeWork.gridx = 3;
		gbc_employeeWork.gridy = 3;
		add(employeeWork, gbc_employeeWork);

		JLabel lblWork_1 = new JLabel("Date:");
		lblWork_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblWork_1 = new GridBagConstraints();
		gbc_lblWork_1.anchor = GridBagConstraints.EAST;
		gbc_lblWork_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblWork_1.gridx = 0;
		gbc_lblWork_1.gridy = 4;
		add(lblWork_1, gbc_lblWork_1);

		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");

		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		paymentDate = new JDatePickerImpl(datePanel, new DateLabelFormatter());

		GridBagConstraints gbc_paymentDate = new GridBagConstraints();
		gbc_paymentDate.anchor = GridBagConstraints.WEST;
		gbc_paymentDate.insets = new Insets(0, 0, 0, 5);
		gbc_paymentDate.gridx = 1;
		gbc_paymentDate.gridy = 4;
		add(paymentDate, gbc_paymentDate);

	}

	public Employee getPayment() {
		Employee employee;
		String id = employeeId.getText();
		String name = employeeName.getText();
		String phoneNumber = number.getText();
		String EmployeeGender = gender.getSelection().getActionCommand();
		String type = employeeWork.getText();
		String payment = employeePayment.getText();
		java.sql.Date date = null;
		String month = (paymentDate.getModel().getMonth() + 1) + "";
		String day = paymentDate.getModel().getDay() + "";
		String year = paymentDate.getModel().getYear() + "";
		if (month.length() == 1) {
			month = "0" + month;
		}
		if (day.length() == 1) {
			day = "0" + day;
		}
		date = Date.valueOf(year + "-" + month + "-" + day);

		if (id.equals(""))
			employee = new Employee(name, phoneNumber, EmployeeGender, type, payment, date);
		else {
			employee = new Employee(name, phoneNumber, EmployeeGender, type, payment, date, id);
		}
		return employee;
	}

	public void Reset() {
		employeeName.setText("");
		employeeId.setText("");
		employeeWork.setText("");
		number.setText("");
		employeePayment.setText("");
	}

}
