package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class EmployeePanel extends JPanel {
	private JPanel titlePanel;
	private JPanel componentsPanel;
	private JPanel viewEmployeePanel;
	private JPanel addEmployeePanel;
	private JPanel updateEmployeePanel;
	private JPanel deleteEmployeePanel;
	private JPanel addPayment;

	private JLabel lblViewEmployee;
	private JLabel lblDeleteEmployee;
	private JLabel lblUpdateEmployee;
	private JLabel lblAddEmployee;

	private Image addEmployeeIcon;
	private Image updateEmployeeIcon;
	private Image deleteEmployeeIcon;
	private Image viewEmployeeIcon;

	private static int BASIC_RED = 178;
	private static int BASIC_GREEN = 176;
	private static int BASIC_BLUE = 152;

	private static int SELECTED_RED = 255;
	private static int SELECTED_GREEN = 255;
	private static int SELECTED_BLUE = 255;

	private AddEmployeeDialog addEmployeeDialog;

	public EmployeePanel() {

		setLayout(new BorderLayout());
		setBackground(new Color(255, 255, 255));

		setComponents();
		setColor(null);

		addEmployeeDialog = new AddEmployeeDialog();

		viewEmployeePanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setColor(viewEmployeePanel);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		updateEmployeePanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setColor(updateEmployeePanel);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		deleteEmployeePanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setColor(deleteEmployeePanel);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		addEmployeePanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setColor(addEmployeePanel);
				addEmployeeDialog.setVisible(true);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		addPayment.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				setColor(addPayment);
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

	}

	public void setComponents() {

		titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		titlePanel.setBackground(new Color(227, 187, 58));

		add(titlePanel, BorderLayout.NORTH);

		JLabel lblEmployees = new JLabel("Employees");
		lblEmployees.setFont(new Font("Dialog", Font.BOLD, 35));
		titlePanel.add(lblEmployees);

		componentsPanel = new JPanel();
		componentsPanel.setLayout(null);
		componentsPanel.setBackground(new Color(255, 255, 255));
		add(componentsPanel, BorderLayout.CENTER);

		viewEmployeePanel = new JPanel();
		viewEmployeePanel.setBounds(12, 63, 301, 65);
		componentsPanel.add(viewEmployeePanel);

		lblViewEmployee = new JLabel("View Employees");
		lblViewEmployee.setFont(new Font("Dialog", Font.BOLD, 25));
		viewEmployeePanel.add(lblViewEmployee);

		addEmployeePanel = new JPanel();
		addEmployeePanel.setBounds(390, 63, 296, 65);
		componentsPanel.add(addEmployeePanel);

		lblAddEmployee = new JLabel("Add Employee");
		lblAddEmployee.setFont(new Font("Dialog", Font.BOLD, 25));
		addEmployeePanel.add(lblAddEmployee);

		updateEmployeePanel = new JPanel();
		updateEmployeePanel.setBounds(12, 179, 301, 65);
		componentsPanel.add(updateEmployeePanel);

		lblUpdateEmployee = new JLabel("Update Employee");
		lblUpdateEmployee.setFont(new Font("Dialog", Font.BOLD, 25));
		updateEmployeePanel.add(lblUpdateEmployee);

		deleteEmployeePanel = new JPanel();
		deleteEmployeePanel.setBounds(390, 179, 296, 65);
		componentsPanel.add(deleteEmployeePanel);

		lblDeleteEmployee = new JLabel("Delete Employee");
		lblDeleteEmployee.setFont(new Font("Dialog", Font.BOLD, 25));
		deleteEmployeePanel.add(lblDeleteEmployee);

		addEmployeeIcon = new ImageIcon(StudentPanel.class.getResource("/res/adduser.png")).getImage()
				.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		lblAddEmployee.setIcon(new ImageIcon(addEmployeeIcon));

		deleteEmployeeIcon = new ImageIcon(StudentPanel.class.getResource("/res/deleteuser.png")).getImage()
				.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		lblDeleteEmployee.setIcon(new ImageIcon(deleteEmployeeIcon));

		updateEmployeeIcon = new ImageIcon(StudentPanel.class.getResource("/res/update.png")).getImage()
				.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		lblUpdateEmployee.setIcon(new ImageIcon(updateEmployeeIcon));

		viewEmployeeIcon = new ImageIcon(StudentPanel.class.getResource("/res/viewdata.jpeg")).getImage()
				.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		lblViewEmployee.setIcon(new ImageIcon(viewEmployeeIcon));

		addPayment = new JPanel();
		addPayment.setBounds(17, 303, 296, 65);
		componentsPanel.add(addPayment);

		JLabel lblAddPayment = new JLabel("Add Payment");
		lblAddPayment.setFont(new Font("Dialog", Font.BOLD, 25));
		addPayment.add(lblAddPayment);
	}

	public void setColor(JPanel panel) {

		JPanel[] panels = { addEmployeePanel, deleteEmployeePanel, updateEmployeePanel, viewEmployeePanel, addPayment };
		if (panel != null) {
			for (JPanel jPanel : panels) {
				if (jPanel != panel) {
					jPanel.setBackground(new Color(BASIC_RED, BASIC_GREEN, BASIC_BLUE));
					jPanel.setBorder(null);
				}
				panel.setBackground(new Color(SELECTED_RED, SELECTED_GREEN, SELECTED_BLUE));
				panel.setBorder(new LineBorder(new Color(0, 255, 255)));
			}
		} else {
			for (JPanel jPanel : panels) {
				jPanel.setBackground(new Color(BASIC_RED, BASIC_GREEN, BASIC_BLUE));
				jPanel.setBorder(null);
			}
		}
	}

}
