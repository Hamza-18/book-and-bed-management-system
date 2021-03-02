package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

public class LoginPanel extends JPanel {
	private JTextField userName;
	private JPasswordField userPassword;
	private Image icon;
	private static final String PASSWORD = "admin";
	private static final String USER_NAME = "admin";
	private LoginInterface loginInterface;
	private JPanel logoPanel;
	private JPanel credentialsPanel;

	public LoginPanel() {
		setLayout(new BorderLayout());

		logoPanel = new JPanel();
		logoPanel.setSize(200, 100);
		logoPanel.setLayout(new GridBagLayout());
		logoPanel.isVisible();
		logoPanel.setBackground(new Color(46, 45, 45));
		add(logoPanel, BorderLayout.WEST);

		JLabel logo = new JLabel("");
		GridBagConstraints gbc_logo = new GridBagConstraints();
		gbc_logo.insets = new Insets(0, 100, 0, 100);
		logoPanel.add(logo, gbc_logo);

		icon = new ImageIcon(LoginPanel.class.getResource("/res/book and bed Logo.png")).getImage()
				.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		logo.setIcon(new ImageIcon(icon));

		credentialsPanel = new JPanel();
		credentialsPanel.setLayout(new BorderLayout());
		credentialsPanel.setBackground(Color.white);
		credentialsPanel.setSize(300, 300);
		add(credentialsPanel, BorderLayout.CENTER);

		JPanel userPanel = new JPanel();
		userPanel.setBounds(424, 0, 376, 474);
		userPanel.setLayout(null);
		userPanel.setBackground(new Color(255, 255, 255));
		credentialsPanel.add(userPanel, BorderLayout.CENTER);

		userName = new JTextField();
		userName.setForeground(new Color(105, 105, 105));
		userName.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		userName.setBounds(25, 174, 326, 30);
		userPanel.add(userName);
		userName.setColumns(10);

		userPassword = new JPasswordField();
		userPassword.setForeground(new Color(105, 105, 105));
		userPassword.setColumns(10);
		userPassword.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		userPassword.setBounds(25, 263, 326, 30);
		userPanel.add(userPassword);

		JButton loginBtn = new JButton("Login");
		loginBtn.setBackground(new Color(0, 128, 128));
		loginBtn.setForeground(new Color(255, 255, 255));
		loginBtn.setBounds(152, 337, 117, 25);
		userPanel.add(loginBtn);

		JLabel lblUsername = new JLabel("User Name:");
		lblUsername.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblUsername.setBounds(25, 140, 136, 30);
		userPanel.add(lblUsername);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblPassword.setBounds(25, 231, 136, 30);
		userPanel.add(lblPassword);

		JLabel warning = new JLabel("");
		warning.setBounds(25, 305, 326, 15);
		userPanel.add(warning);

		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String user = userName.getText();
				char[] pass = userPassword.getPassword();
				if (user.equals(USER_NAME) && (new String(pass).equals(PASSWORD))) {
					loginInterface.passLogin(true);
				} else {
					warning.setText("* Wrong user name or password");
					loginInterface.passLogin(false);
				}
			}
		});
	}

//	public LoginPanel() {
//		setVisible(true);
//		setLayout(null);
//		setSize(798, 492);
//		Dimension dimension = getSize();
//
//		JPanel logoPanel = new JPanel();
//		logoPanel.setBounds(0, 0, 424, 474);
//		logoPanel.setLayout(null);
//		logoPanel.isVisible();
//		logoPanel.setBackground(new Color(46, 45, 45));
//		add(logoPanel);
//
//		JLabel logo = new JLabel("");
//		logo.setHorizontalAlignment(SwingConstants.CENTER);
//		logo.setAlignmentX(Component.CENTER_ALIGNMENT);
//		logo.setBounds(61, 96, 253, 318);
//		logoPanel.add(logo);
//

//	}

	public void loginListener(LoginInterface loginInterface) {
		this.loginInterface = loginInterface;
	}
}
