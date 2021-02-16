package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DeleteEmployeePanel extends JPanel {

	private JTextField employeeName;
	private JTextField employeeId;
	private JTextField employeeWork;
	private JButton searchBtn;
	private UpdateEmployeeInterface updateEmployeeInterface;

	public DeleteEmployeePanel() {

		setComponents();

		searchBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String query;
				String name = "";
				String work = "";
				long id;

				if (employeeName.getText() != null)
					name = employeeName.getText();

				if (employeeWork.getText() != null)
					work = employeeWork.getText();
				if (employeeId.getText().equals(""))
					id = -1;
				else {
					id = Long.parseLong(employeeId.getText());
				}
				query = "where Name = " + "'" + name + "'" + " or EmployeeId = " + "'" + id + "'" + " or Designation = "
						+ "'" + work + "'";
				updateEmployeeInterface.getQuery(query);
			}
		});
	}

	public void setInterface(UpdateEmployeeInterface updateEmployeeInterface) {
		this.updateEmployeeInterface = updateEmployeeInterface;
	}

	public void setComponents() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 78, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 64, 38, 54, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
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

		employeeId = new JTextField(15);
		employeeId.setColumns(15);
		GridBagConstraints gbc_employeeId = new GridBagConstraints();
		gbc_employeeId.insets = new Insets(0, 0, 5, 0);
		gbc_employeeId.anchor = GridBagConstraints.WEST;
		gbc_employeeId.gridx = 3;
		gbc_employeeId.gridy = 0;
		add(employeeId, gbc_employeeId);

		JLabel lblRoom = new JLabel("Designation:");
		lblRoom.setFont(new Font("Dialog", Font.PLAIN, 18));
		GridBagConstraints gbc_lblRoom = new GridBagConstraints();
		gbc_lblRoom.anchor = GridBagConstraints.EAST;
		gbc_lblRoom.insets = new Insets(0, 5, 5, 5);
		gbc_lblRoom.gridx = 0;
		gbc_lblRoom.gridy = 1;
		add(lblRoom, gbc_lblRoom);

		employeeWork = new JTextField();
		employeeWork.setColumns(10);
		GridBagConstraints gbc_employeeWork = new GridBagConstraints();
		gbc_employeeWork.anchor = GridBagConstraints.WEST;
		gbc_employeeWork.insets = new Insets(0, 0, 5, 5);
		gbc_employeeWork.gridx = 1;
		gbc_employeeWork.gridy = 1;
		add(employeeWork, gbc_employeeWork);

		searchBtn = new JButton("Search");
		searchBtn.setFont(new Font("Dialog", Font.BOLD, 15));
		GridBagConstraints gbc_btnSearch = new GridBagConstraints();
		gbc_btnSearch.insets = new Insets(0, 0, 5, 0);
		gbc_btnSearch.gridx = 3;
		gbc_btnSearch.gridy = 1;
		add(searchBtn, gbc_btnSearch);

	}

	public void Reset() {

		employeeId.setText("");
		employeeName.setText("");
		employeeWork.setText("");
	}
}
