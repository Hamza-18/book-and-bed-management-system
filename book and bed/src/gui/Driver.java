package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Driver {

	public static void main(String[] args) {
		//// https://github.com/Hamza-18/book-and-bed-management-system.git
		Dashboard dashboard = new Dashboard();
		LoginPanel loginPanel = new LoginPanel();
		JPanel contentPanel = new JPanel();
		JFrame loginFrame = new JFrame();

		contentPanel.setLayout(new BorderLayout());
		contentPanel.add(loginPanel, BorderLayout.CENTER);
		loginFrame.setContentPane(contentPanel);
		loginFrame.setVisible(true);
		loginFrame.setSize(new Dimension(798, 492));
		loginFrame.setMaximumSize(new Dimension(798, 492));
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.setLocationRelativeTo(null);
		loginFrame.repaint();
		loginPanel.loginListener(new LoginInterface() {

			@Override
			public void passLogin(boolean flag) {
				// TODO Auto-generated method stub
				if (flag) {
					loginFrame.setVisible(false);
					dashboard.setVisible(true);
				}
			}
		});
	}
}
