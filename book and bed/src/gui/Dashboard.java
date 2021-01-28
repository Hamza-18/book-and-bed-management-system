package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private SidePanel sidePanel;
	private TitlePanel titlePanel;
	private HomePanel homePanel;
	private StudentPanel studentPanel;
	private EmployeePanel employeePanel;
	private JPanel panelToRemove;

	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(950, 600));

		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
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

		employeePanel = new EmployeePanel();

		studentPanel = new StudentPanel();

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
			contentPane.remove(panelToRemove);
			contentPane.add(studentPanel, BorderLayout.CENTER);
			panelToRemove = studentPanel;
			contentPane.repaint();
		} else if (panel.equals("homePanel")) {
			contentPane.remove(panelToRemove);
			contentPane.add(homePanel, BorderLayout.CENTER);
			contentPane.repaint();
			panelToRemove = homePanel;
		} else if (panel.equals("employeePanel")) {
			contentPane.remove(panelToRemove);
			contentPane.add(employeePanel, BorderLayout.CENTER);
			contentPane.repaint();
			panelToRemove = employeePanel;
		}

	}
}
