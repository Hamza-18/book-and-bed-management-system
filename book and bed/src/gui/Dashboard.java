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
	}
}
