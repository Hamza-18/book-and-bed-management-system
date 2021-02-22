package gui;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Driver {

	public static void main(String[] args) {
		//// https://github.com/Hamza-18/book-and-bed-management-system.git
		Dashboard dashboard = new Dashboard();
		LoginPanel loginPanel = new LoginPanel();
		JFrame loginFrame = new JFrame();
		loginFrame.setContentPane(loginPanel);
		loginFrame.setVisible(true);
		loginFrame.setSize(new Dimension(798, 492));
//		loginFrame.setResizable(false);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.setLocationRelativeTo(null);
		loginPanel.loginListener(new LoginInterface() {

			@Override
			public void passLogin(boolean flag) {
				// TODO Auto-generated method stub
//				if (flag) {
				loginFrame.setVisible(false);
				dashboard.setVisible(true);
//				}
			}
		});
	}
}
