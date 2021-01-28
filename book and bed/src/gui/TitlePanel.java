package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitlePanel extends JPanel {
	private Image icon;

	public TitlePanel() {
		setBackground(new Color(0, 125, 125));
		setMinimumSize(new Dimension(600, 90));
		setLayout(new FlowLayout(FlowLayout.CENTER));

		JLabel label = new JLabel("");
		add(label);
		icon = new ImageIcon(TitlePanel.class.getResource("/res/book and bed Logo.png")).getImage()
				.getScaledInstance(85, 85, Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(icon));

//		JLabel lblBookBed = new JLabel("Book & Bed");
//		lblBookBed.setFont(new Font("Dialog", Font.BOLD, 55));
//		lblBookBed.setAlignmentX(Component.CENTER_ALIGNMENT);
//		lblBookBed.setHorizontalTextPosition(SwingConstants.CENTER);
//		lblBookBed.setHorizontalAlignment(SwingConstants.CENTER);
//		lblBookBed.setLocation(new Point(300, 0));
//		add(lblBookBed);
	}
}
