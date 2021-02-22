package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.prefs.Preferences;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Controller;
import model.Employee;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private SidePanel sidePanel;
	private TitlePanel titlePanel;
	private HomePanel homePanel;
	private StudentPanel studentPanel;
	private EmployeePanel employeePanel;
	private JPanel panelToRemove;
	private KitchenPanel kitchenPanel;
	private Preferences dataPreferences;

	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(950, 600));
		setLocationRelativeTo(null);

		try {
			Controller.setConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		sidePanel = new SidePanel();
		getContentPane().add(sidePanel, BorderLayout.WEST);

		titlePanel = new TitlePanel();
		contentPane.add(titlePanel, BorderLayout.NORTH);

		homePanel = new HomePanel();
		contentPane.add(homePanel, BorderLayout.CENTER);
		panelToRemove = homePanel;

		try {
			dataPreferences = dataPreferences.userRoot().node("PaymentCount");
			Employee.setPaymentCount(dataPreferences.getInt("empCount", 0));
		} catch (Exception e) {
			// TODO: handle exception
		}

		sidePanel.addPanel(new SidePanelInterface() {

			@Override
			public void setPanel(String panel) {
				// TODO Auto-generated method stub
				changePanel(panel);
			}
		});

	}

	public void changePanel(String panel) {

		if (panel.equals("studentPanel")) {
			if (panelToRemove != studentPanel) {
				studentPanel = new StudentPanel();
				contentPane.remove(panelToRemove);
				contentPane.add(studentPanel, BorderLayout.CENTER);
				panelToRemove = studentPanel;
				contentPane.repaint();
			}
		} else if (panel.equals("homePanel")) {
			if (panelToRemove != homePanel) {
				contentPane.remove(panelToRemove);
				contentPane.add(homePanel, BorderLayout.CENTER);
				contentPane.repaint();
				homePanel.setCount();
				panelToRemove = homePanel;
			}
		} else if (panel.equals("employeePanel")) {
			if (panelToRemove != employeePanel) {
				employeePanel = new EmployeePanel();
				contentPane.remove(panelToRemove);
				contentPane.add(employeePanel, BorderLayout.CENTER);
				contentPane.repaint();
				panelToRemove = employeePanel;
			}
		} else {
			if (panelToRemove != kitchenPanel) {
				kitchenPanel = new KitchenPanel();
				contentPane.remove(panelToRemove);
				contentPane.add(kitchenPanel, BorderLayout.CENTER);
				contentPane.repaint();
				panelToRemove = kitchenPanel;
			}
		}

	}

}
